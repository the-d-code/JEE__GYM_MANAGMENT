/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managebeans;
import entity.*;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sbbeans.sessionbeanLocal;

/**
 *
 * @author Dell
 */
@Named(value = "branchbean")
@SessionScoped
public class branchbean implements Serializable {

    @EJB
    sessionbeanLocal sb;

    public sessionbeanLocal getSb() {
        return sb;
    }

    public void setSb(sessionbeanLocal sb) {
        this.sb = sb;
    }
    
    int branch_id;
    String branch_name;
    int country_id;
    int state_id;
    int city_id;
    String address;
    String email;
    String mobile;
    String description;

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    

    
    
    /**
     * Creates a new instance of branchbean
     */
    public branchbean() {
    }
    
    public List<Branches> getallbranch(){
        return sb.getallbranch();
    }
    public String addbranch(){
        try{
//            System.out.println("Hello");
//            this.sb.addbranch(branch_name, country_id, state_id, city_id, address, email, mobile, description);
            sb.addbranch(branch_name, country_id, state_id, city_id, address, email, mobile, description);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
//            return null;
        }
        
        branch_name=" ";
        address=" ";
        email=" ";
        mobile=" ";
        description=" ";
        return "branches.jsf";
    }
    
    public String searchBranch(int bid){
        Branches branch = sb.searchBanch(bid);
        branch_id = branch.getBranchId();
        branch_name = branch.getBranchName();
        country_id = branch.getCountryId().getCountryId();
        state_id = branch.getStateId().getStateId();
        city_id = branch.getCityId().getCityId();
        address = branch.getAddress();
        email = branch.getEmail();
        mobile = branch.getMobile();
        description = branch.getDescription();
        
        return "updatebranch.jsf";
    }
    
     public String updateBranch(){
        try{
            sb.updateBranch(branch_id, branch_name, country_id, state_id, city_id, address, email, mobile, description);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        branch_name = "";
        address = "";
        email = "";
        mobile = "";
        description = "";
        return "branches.jsf";
    }
     
     public void removeBranch(int branch_id){
        sb.removeBranch(branch_id);
    }
     
     public String findCountriesbyStatesId(int s_id){
        return sb.findCountriesbyStatesId(s_id);
    }
}
