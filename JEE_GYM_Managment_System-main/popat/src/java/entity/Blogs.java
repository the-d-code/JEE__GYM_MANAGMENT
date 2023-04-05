/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "blogs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blogs.findAll", query = "SELECT b FROM Blogs b"),
    @NamedQuery(name = "Blogs.findByBlogId", query = "SELECT b FROM Blogs b WHERE b.blogId = :blogId"),
    @NamedQuery(name = "Blogs.findByTag", query = "SELECT b FROM Blogs b WHERE b.tag = :tag"),
    @NamedQuery(name = "Blogs.findByTitle", query = "SELECT b FROM Blogs b WHERE b.title = :title"),
    @NamedQuery(name = "Blogs.findByImage", query = "SELECT b FROM Blogs b WHERE b.image = :image"),
    @NamedQuery(name = "Blogs.findByDescription", query = "SELECT b FROM Blogs b WHERE b.description = :description")})
public class Blogs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "blog_id")
    private Integer blogId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "tag")
    private String tag;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "image")
    private String image;
    @Size(max = 300)
    @Column(name = "description")
    private String description;

    public Blogs() {
    }

    public Blogs(Integer blogId) {
        this.blogId = blogId;
    }

    public Blogs(Integer blogId, String tag, String title, String image) {
        this.blogId = blogId;
        this.tag = tag;
        this.title = title;
        this.image = image;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blogId != null ? blogId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Blogs)) {
            return false;
        }
        Blogs other = (Blogs) object;
        if ((this.blogId == null && other.blogId != null) || (this.blogId != null && !this.blogId.equals(other.blogId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Blogs[ blogId=" + blogId + " ]";
    }
    
}
