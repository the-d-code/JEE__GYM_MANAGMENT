/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managebeans;

import entity.Users;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.servlet.http.Part;
import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;
import sbbeans.sessionbeanLocal;
import sbbeans.usersessionbeanLocal;

/**
 *
 * @author Dell
 */
@Named(value = "userbean")
@SessionScoped
public class userbean implements Serializable {

    @EJB
    private usersessionbeanLocal usb;

    public usersessionbeanLocal getUsb() {
        return usb;
    }

    public void setUsb(usersessionbeanLocal usb) {
        this.usb = usb;
    }
    
    
    
    

    @EJB
    private sessionbeanLocal sb;

    public sessionbeanLocal getSb() {
        return sb;
    }

    public void setSb(sessionbeanLocal sb) {
        this.sb = sb;
    }
    
    
    
    String user_role;
   int branch_id;
   String first_name;
   String last_name;
   String username;
   String email;
   String password;
   int country_id;
   int state_id;
   int city_id;
  String address;
  String gender;
  String birth_date;
  int age;
  int height;
  int weight;
  String image;
  int is_active;

    public String getUser_role() {
        return user_role;
    }

    public void setUser_role(String user_role) {
        this.user_role = user_role;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }
  
  
  
  
  private Part uploadedFile;
    private String folder = "C:\\NETBEANS\\popat\\web\\resources\\userimage";

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
     * Creates a new instance of userbean
     */
    public userbean() {
    }
    
    //inser user
    
    public List<Users> getalluser(){
        return sb.getalluser();
    }
    
    public String insertuser() throws IOException{
        
            InputStream input=uploadedFile.getInputStream();
            String Filename=uploadedFile.getSubmittedFileName();
            
            Pbkdf2PasswordHashImpl pb;
             pb = new Pbkdf2PasswordHashImpl();
            String enc = pb.generate(password.toCharArray());

            usb.adduser(user_role, branch_id, first_name, last_name, username, email, enc, country_id, state_id, city_id, address, gender, birth_date, age, height, weight, Filename, is_active);
            try{
                FacesContext.getCurrentInstance().getExternalContext().redirect("login.jsf");
            Files.copy(input, new File(folder,Filename).toPath() );
            }
            catch (IOException ex){
                
        }
        
        user_role=" ";
        first_name=" ";
        last_name=" ";
        username=" ";
        email=" ";
        password=" ";
        address=" ";
        gender=" ";
        birth_date=" ";
        image=" ";
        is_active=1;
       return "users.jsf";
    }
    
    
    
    
}
