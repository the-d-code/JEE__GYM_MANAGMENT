/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managebeans;

import entity.Blogs;
import java.io.File;
import java.io.InputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.http.Part;
import sbbeans.sessionbeanLocal;

/**
 *
 * @author Dell
 */
@Named(value = "blogbean")
@SessionScoped
public class blogbean implements Serializable {

    @EJB
    private sessionbeanLocal sb;

    public sessionbeanLocal getSb() {
        return sb;
    }

    public void setSb(sessionbeanLocal sb) {
        this.sb = sb;
    }
    
    int blog_id;
    String tag;
    String title;
    String image;
    String description;

    public int getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(int blog_id) {
        this.blog_id = blog_id;
    }
    
    

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    private Part uploadedFile;
    private String folder = "C:\\NETBEANS\\popat\\web\\resources\\blogimg";

    public Part getUploadedFile() {
        return uploadedFile;
    }

    public void setUploadedFile(Part uploadedFile) {
        this.uploadedFile = uploadedFile;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
    
    

    
    
    /**
     * Creates a new instance of blogbean
     */
    public blogbean() {
    }
    
    public List<Blogs> getallblog(){
       return sb.getallblog();
    }
    
    public String insertblog(){
        try{
            
            InputStream input=uploadedFile.getInputStream();
            String Filename=uploadedFile.getSubmittedFileName();
            sb.addblog(tag, title, Filename, description);
            Files.copy(input, new File(folder,Filename).toPath() );
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
    }
        tag=" ";
        title=" ";
        image=" ";
        description=" ";
        return "blogs.jsf";
    }
    
    public String updateblog(){
        try{
        InputStream input=uploadedFile.getInputStream();
            String Filename=uploadedFile.getSubmittedFileName();
            sb.updateblog(blog_id, tag, title, Filename, description);
            Files.copy(input, new File(folder,Filename).toPath() );
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
    }
        tag=" ";
        title=" ";
        image=" ";
        description=" ";
        return "blogs.jsf";
    }
    
    public String searchblog(int bid){
        Blogs blog=sb.searchblog(bid);
        blog_id=blog.getBlogId();
        tag=blog.getTag();
        title=blog.getTitle();
        image=blog.getImage();
        description=blog.getDescription();
        return "updateblog.jsf";
    }
    
    public void removeblog(int blog_id){
        sb.removeblog(blog_id);
    }
    
}
