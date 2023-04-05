/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managebeans;

import entity.Plans;
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
@Named(value = "planbean")
@SessionScoped
public class planbean implements Serializable {

    @EJB
    private sessionbeanLocal sb;

    public sessionbeanLocal getSb() {
        return sb;
    }

    public void setSb(sessionbeanLocal sb) {
        this.sb = sb;
    }
    
    int plan_id;
    String plan_name;
    String time;
    String price;
    int is_active;

    public int getPlan_id() {
        return plan_id;
    }

    public void setPlan_id(int plan_id) {
        this.plan_id = plan_id;
    }

    public String getPlan_name() {
        return plan_name;
    }

    public void setPlan_name(String plan_name) {
        this.plan_name = plan_name;
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

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    
    
    /**
     * Creates a new instance of planbean
     */
    public planbean() {
    }
    
    public List<Plans> getallplan(){
        return sb.getallplan();
    }
    
    public String addplan(){
        try{
            sb.addplan(plan_name, time, price, is_active);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        plan_name = "";
        time=" ";
        price=" ";
        is_active=0;
        return "plans.jsf";
    }
    
    public String updateplan(){
        try{
        sb.updateplan(plan_id, plan_name, time, price, is_active);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
       
        plan_name=" ";
        time=" ";
        price=" ";
        is_active=0;
       return "plans.jsf";
    }
    
    public String searchplan(int pid){
        Plans p=sb.searchplan(pid);
        plan_id=p.getPlanId();
        plan_name=p.getPlanName();
        time=p.getTime();
        price=p.getPrice();
        is_active=p.getIsActive();
        return "updateplan.jsf";
    }
   
    public void removeplan(int plan_id){
        sb.removeplan(plan_id);
    }
    
}
