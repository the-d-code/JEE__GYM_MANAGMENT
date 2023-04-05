/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "plans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plans.findAll", query = "SELECT p FROM Plans p"),
    @NamedQuery(name = "Plans.findByPlanId", query = "SELECT p FROM Plans p WHERE p.planId = :planId"),
    @NamedQuery(name = "Plans.findByPlanName", query = "SELECT p FROM Plans p WHERE p.planName = :planName"),
    @NamedQuery(name = "Plans.findByTime", query = "SELECT p FROM Plans p WHERE p.time = :time"),
    @NamedQuery(name = "Plans.findByPrice", query = "SELECT p FROM Plans p WHERE p.price = :price"),
    @NamedQuery(name = "Plans.findByIsActive", query = "SELECT p FROM Plans p WHERE p.isActive = :isActive")})
public class Plans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "plan_id")
    private Integer planId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "plan_name")
    private String planName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "time")
    private String time;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "price")
    private String price;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_active")
    private int isActive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "planId")
    private List<Payments> paymentsList;

    public Plans() {
    }

    public Plans(Integer planId) {
        this.planId = planId;
    }

    public Plans(Integer planId, String planName, String time, String price, int isActive) {
        this.planId = planId;
        this.planName = planName;
        this.time = time;
        this.price = price;
        this.isActive = isActive;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    @XmlTransient
    public List<Payments> getPaymentsList() {
        return paymentsList;
    }

    public void setPaymentsList(List<Payments> paymentsList) {
        this.paymentsList = paymentsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planId != null ? planId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plans)) {
            return false;
        }
        Plans other = (Plans) object;
        if ((this.planId == null && other.planId != null) || (this.planId != null && !this.planId.equals(other.planId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Plans[ planId=" + planId + " ]";
    }
    
}
