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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
    @NamedQuery(name = "Trainer.findByTrainerId", query = "SELECT t FROM Trainer t WHERE t.trainerId = :trainerId"),
    @NamedQuery(name = "Trainer.findByTrainerFirstName", query = "SELECT t FROM Trainer t WHERE t.trainerFirstName = :trainerFirstName"),
    @NamedQuery(name = "Trainer.findByTrainerLastName", query = "SELECT t FROM Trainer t WHERE t.trainerLastName = :trainerLastName"),
    @NamedQuery(name = "Trainer.findByTrainerUsername", query = "SELECT t FROM Trainer t WHERE t.trainerUsername = :trainerUsername"),
    @NamedQuery(name = "Trainer.findByTrainerEmail", query = "SELECT t FROM Trainer t WHERE t.trainerEmail = :trainerEmail"),
    @NamedQuery(name = "Trainer.findByTrainerPassword", query = "SELECT t FROM Trainer t WHERE t.trainerPassword = :trainerPassword"),
    @NamedQuery(name = "Trainer.findByTrainerGender", query = "SELECT t FROM Trainer t WHERE t.trainerGender = :trainerGender"),
    @NamedQuery(name = "Trainer.findByTrainerBirthDate", query = "SELECT t FROM Trainer t WHERE t.trainerBirthDate = :trainerBirthDate"),
    @NamedQuery(name = "Trainer.findByTrainerAge", query = "SELECT t FROM Trainer t WHERE t.trainerAge = :trainerAge"),
    @NamedQuery(name = "Trainer.findByTrainerHeight", query = "SELECT t FROM Trainer t WHERE t.trainerHeight = :trainerHeight"),
    @NamedQuery(name = "Trainer.findByTrainerWeight", query = "SELECT t FROM Trainer t WHERE t.trainerWeight = :trainerWeight"),
    @NamedQuery(name = "Trainer.findByTrainerImage", query = "SELECT t FROM Trainer t WHERE t.trainerImage = :trainerImage"),
    @NamedQuery(name = "Trainer.findByTarinerAddress", query = "SELECT t FROM Trainer t WHERE t.tarinerAddress = :tarinerAddress"),
    @NamedQuery(name = "Trainer.findByIsActive", query = "SELECT t FROM Trainer t WHERE t.isActive = :isActive")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainer_id")
    private Integer trainerId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "trainer_first_name")
    private String trainerFirstName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "trainer_last_name")
    private String trainerLastName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "trainer_username")
    private String trainerUsername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "trainer_email")
    private String trainerEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "trainer_password")
    private String trainerPassword;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "trainer_gender")
    private String trainerGender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "trainer_birth_date")
    private String trainerBirthDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trainer_age")
    private int trainerAge;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trainer_height")
    private int trainerHeight;
    @Basic(optional = false)
    @NotNull
    @Column(name = "trainer_weight")
    private int trainerWeight;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "trainer_image")
    private String trainerImage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "tariner_address")
    private String tarinerAddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_active")
    private int isActive;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne
    private Branches branchId;
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    @ManyToOne
    private Countries countryId;
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    @ManyToOne
    private States stateId;
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    @ManyToOne
    private Cities cityId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trainerId")
    private List<Schedules> schedulesList;

    public Trainer() {
    }

    public Trainer(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public Trainer(Integer trainerId, String trainerFirstName, String trainerLastName, String trainerUsername, String trainerEmail, String trainerPassword, String trainerGender, String trainerBirthDate, int trainerAge, int trainerHeight, int trainerWeight, String trainerImage, String tarinerAddress, int isActive) {
        this.trainerId = trainerId;
        this.trainerFirstName = trainerFirstName;
        this.trainerLastName = trainerLastName;
        this.trainerUsername = trainerUsername;
        this.trainerEmail = trainerEmail;
        this.trainerPassword = trainerPassword;
        this.trainerGender = trainerGender;
        this.trainerBirthDate = trainerBirthDate;
        this.trainerAge = trainerAge;
        this.trainerHeight = trainerHeight;
        this.trainerWeight = trainerWeight;
        this.trainerImage = trainerImage;
        this.tarinerAddress = tarinerAddress;
        this.isActive = isActive;
    }

    public Integer getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Integer trainerId) {
        this.trainerId = trainerId;
    }

    public String getTrainerFirstName() {
        return trainerFirstName;
    }

    public void setTrainerFirstName(String trainerFirstName) {
        this.trainerFirstName = trainerFirstName;
    }

    public String getTrainerLastName() {
        return trainerLastName;
    }

    public void setTrainerLastName(String trainerLastName) {
        this.trainerLastName = trainerLastName;
    }

    public String getTrainerUsername() {
        return trainerUsername;
    }

    public void setTrainerUsername(String trainerUsername) {
        this.trainerUsername = trainerUsername;
    }

    public String getTrainerEmail() {
        return trainerEmail;
    }

    public void setTrainerEmail(String trainerEmail) {
        this.trainerEmail = trainerEmail;
    }

    public String getTrainerPassword() {
        return trainerPassword;
    }

    public void setTrainerPassword(String trainerPassword) {
        this.trainerPassword = trainerPassword;
    }

    public String getTrainerGender() {
        return trainerGender;
    }

    public void setTrainerGender(String trainerGender) {
        this.trainerGender = trainerGender;
    }

    public String getTrainerBirthDate() {
        return trainerBirthDate;
    }

    public void setTrainerBirthDate(String trainerBirthDate) {
        this.trainerBirthDate = trainerBirthDate;
    }

    public int getTrainerAge() {
        return trainerAge;
    }

    public void setTrainerAge(int trainerAge) {
        this.trainerAge = trainerAge;
    }

    public int getTrainerHeight() {
        return trainerHeight;
    }

    public void setTrainerHeight(int trainerHeight) {
        this.trainerHeight = trainerHeight;
    }

    public int getTrainerWeight() {
        return trainerWeight;
    }

    public void setTrainerWeight(int trainerWeight) {
        this.trainerWeight = trainerWeight;
    }

    public String getTrainerImage() {
        return trainerImage;
    }

    public void setTrainerImage(String trainerImage) {
        this.trainerImage = trainerImage;
    }

    public String getTarinerAddress() {
        return tarinerAddress;
    }

    public void setTarinerAddress(String tarinerAddress) {
        this.tarinerAddress = tarinerAddress;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public Branches getBranchId() {
        return branchId;
    }

    public void setBranchId(Branches branchId) {
        this.branchId = branchId;
    }

    public Countries getCountryId() {
        return countryId;
    }

    public void setCountryId(Countries countryId) {
        this.countryId = countryId;
    }

    public States getStateId() {
        return stateId;
    }

    public void setStateId(States stateId) {
        this.stateId = stateId;
    }

    public Cities getCityId() {
        return cityId;
    }

    public void setCityId(Cities cityId) {
        this.cityId = cityId;
    }

    @XmlTransient
    public List<Schedules> getSchedulesList() {
        return schedulesList;
    }

    public void setSchedulesList(List<Schedules> schedulesList) {
        this.schedulesList = schedulesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerId != null ? trainerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trainerId == null && other.trainerId != null) || (this.trainerId != null && !this.trainerId.equals(other.trainerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Trainer[ trainerId=" + trainerId + " ]";
    }
    
}
