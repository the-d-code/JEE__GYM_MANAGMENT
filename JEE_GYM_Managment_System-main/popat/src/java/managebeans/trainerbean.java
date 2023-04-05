/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managebeans;
import entity.*;
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
@Named(value = "trainerbean")
@SessionScoped
public class trainerbean implements Serializable {

    @EJB
    private sessionbeanLocal sb;

    public sessionbeanLocal getSb() {
        return sb;
    }

    public void setSb(sessionbeanLocal sb) {
        this.sb = sb;
    }
    
    int trainer_id;
    int branch_id;
    String trainer_first_name;
    String trainer_last_name;
    String trainer_username;
    String trainer_email;
    String trainer_password;
    int country_id;
    int state_id;
    int city_id;
    String trainer_gender;
    String trainer_birth_date;
    int trainer_age;
    int trainer_height;
    int trainer_weight;
    String trainer_image;
    String trainer_address;
    int is_active;
    
    private Part uploadedFile;
    private String folder = "C:\\NETBEANS\\popat\\web\\resources\\trainerimg";

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

    
    
    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getTrainer_first_name() {
        return trainer_first_name;
    }

    public void setTrainer_first_name(String trainer_first_name) {
        this.trainer_first_name = trainer_first_name;
    }

    public String getTrainer_last_name() {
        return trainer_last_name;
    }

    public void setTrainer_last_name(String trainer_last_name) {
        this.trainer_last_name = trainer_last_name;
    }

    public String getTrainer_username() {
        return trainer_username;
    }

    public void setTrainer_username(String trainer_username) {
        this.trainer_username = trainer_username;
    }

    public String getTrainer_email() {
        return trainer_email;
    }

    public void setTrainer_email(String trainer_email) {
        this.trainer_email = trainer_email;
    }

    public String getTrainer_password() {
        return trainer_password;
    }

    public void setTrainer_password(String trainer_password) {
        this.trainer_password = trainer_password;
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

    public String getTrainer_gender() {
        return trainer_gender;
    }

    public void setTrainer_gender(String trainer_gender) {
        this.trainer_gender = trainer_gender;
    }

    public String getTrainer_birth_date() {
        return trainer_birth_date;
    }

    public void setTrainer_birth_date(String trainer_birth_date) {
        this.trainer_birth_date = trainer_birth_date;
    }

    public int getTrainer_age() {
        return trainer_age;
    }

    public void setTrainer_age(int trainer_age) {
        this.trainer_age = trainer_age;
    }

    public int getTrainer_height() {
        return trainer_height;
    }

    public void setTrainer_height(int trainer_height) {
        this.trainer_height = trainer_height;
    }

    public int getTrainer_weight() {
        return trainer_weight;
    }

    public void setTrainer_weight(int trainer_weight) {
        this.trainer_weight = trainer_weight;
    }

    public String getTrainer_image() {
        return trainer_image;
    }

    public void setTrainer_image(String trainer_image) {
        this.trainer_image = trainer_image;
    }

    public String getTrainer_address() {
        return trainer_address;
    }

    public void setTrainer_address(String trainer_address) {
        this.trainer_address = trainer_address;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }
    
    
    

    
    
    /**
     * Creates a new instance of trainerbean
     */
    public trainerbean() {
    }
    
    //display trainer
    
    public List<Trainer> getalltrainer(){
        return sb.getalltrainer();
    }
    
    //insert trainer
    
    public String inserttrainer(){
        try{
            
            InputStream input=uploadedFile.getInputStream();
            String Filename=uploadedFile.getSubmittedFileName();
           sb.addtrainer(branch_id, trainer_first_name, trainer_last_name, trainer_username, trainer_email, trainer_password, country_id, state_id, city_id, trainer_gender, trainer_birth_date, trainer_age, trainer_height, trainer_weight,Filename, trainer_address, is_active);
             
            Files.copy(input, new File(folder,Filename).toPath() );
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
    }
        trainer_first_name=" ";
        trainer_last_name=" ";
        trainer_username=" ";
        trainer_email=" ";
        trainer_password=" ";
        trainer_gender=" ";
        trainer_birth_date=" ";
        trainer_image=" ";
        trainer_address=" ";
        return "trainers.jsf";
    }
    
    //update trainer
    
    public String updatetrainer(){
         try{
            
            InputStream input=uploadedFile.getInputStream();
            String Filename=uploadedFile.getSubmittedFileName();
          String result=  sb.updatetrainer(trainer_id, branch_id, trainer_first_name, trainer_last_name, trainer_username, trainer_email, trainer_password, country_id, state_id, city_id, trainer_gender, trainer_birth_date, trainer_age, trainer_height, trainer_weight, Filename, trainer_address, is_active);
             
            Files.copy(input, new File(folder,Filename).toPath() );
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
    }
        trainer_first_name=" ";
        trainer_last_name=" ";
        trainer_username=" ";
        trainer_email=" ";
        trainer_password=" ";
        trainer_gender=" ";
        trainer_birth_date=" ";
        trainer_image=" ";
        trainer_address=" ";
        return "trainers.jsf";
    
    }
    
    //search trainer
    
    public String searchtrainer(int tid){
        Trainer trainer=sb.searchtrainer(tid);
        trainer_id=trainer.getTrainerId();
        branch_id=trainer.getBranchId().getBranchId();
        trainer_first_name=trainer.getTrainerFirstName();
        trainer_last_name=trainer.getTrainerLastName();
        trainer_username=trainer.getTrainerUsername();
        trainer_email=trainer.getTrainerEmail();
        trainer_password=trainer.getTrainerPassword();
        country_id=trainer.getCountryId().getCountryId();
        state_id=trainer.getStateId().getStateId();
        city_id=trainer.getCityId().getCityId();
        trainer_gender=trainer.getTrainerGender();
        trainer_birth_date=trainer.getTrainerBirthDate();
        trainer_age=trainer.getTrainerAge();
        trainer_height=trainer.getTrainerHeight();
        trainer_weight=trainer.getTrainerWeight();
        trainer_image=trainer.getTrainerImage();
        trainer_address=trainer.getTarinerAddress();
        is_active=trainer.getIsActive();
        return "updatetrainer.jsf";
        
    }
    
//    public String searchBranch(int bid){
//        Branches branch = sb.searchBanch(bid);
//        branch_id = branch.getBranchId();
//        branch_name = branch.getBranchName();
//        country_id = branch.getCountryId().getCountryId();
//        state_id = branch.getStateId().getStateId();
//        city_id = branch.getCityId().getCityId();
//        address = branch.getAddress();
//        email = branch.getEmail();
//        mobile = branch.getMobile();
//        description = branch.getDescription();
//        
//        return "updatebranch.jsf";
//    }
    
    //delet trainer
    
    public void removetrainer(int trainer_id){
        sb.removetrainer(trainer_id);
    }
    
}
