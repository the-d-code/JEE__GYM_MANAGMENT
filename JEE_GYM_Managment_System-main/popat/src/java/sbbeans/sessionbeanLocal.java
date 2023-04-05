/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package sbbeans;
import entity.*;
import java.util.Collection;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dell
 */
@Local
public interface sessionbeanLocal {
    
    
    //country 
    
    List<Countries> getallcountry();
    public String addCountry(String country_name);
    public String updatecountry(int country_id,String country_name);
    public Countries searchcountry(int country_id);
    public String removecountry(int country_id);
    
    //state
    
    List<States> getallstates();
    public String addstates(String state_name,int country_id);
    public String updatestate(int state_id,String state_name,int country_id);
    public States searchstate(int state_id);
    public String removestate(int state_id);
     public List<States> findStatesbyId(Integer s_id);
    public String findCountriesbyStatesId(int s_id);
    
    
    //city
    
    List<Cities> getallcity();
    public String addcities(String city_name,int state_id);
    public String updatecity(int city_id,String city_name,int state_id);
    public Cities searchcity(int city_id);
    public String removecity(int city_id);
    
    //branch
    
    List<Branches> getallbranch();
    public String addbranch(String branch_name,int country_id,int state_id,int city_id,String address,String email,String mobile,String description);
        public String updateBranch(int branch_id,String branch_name,int country_id,int state_id,int city_id,String address,String email,String mobile,String description);
        public Branches searchBanch(int branch_id);
        public String removeBranch(int branch_id);
    
    //trainer
    
    List<Trainer> getalltrainer();
    public String addtrainer(int branch_id,String trainer_first_name,String trainer_last_name,String trainer_username,String trainer_email,String trainer_password,int country_id,int state_id,int city_id,String trainer_gender,String trainer_birth_date,int trainer_age,int trainer_height,int trainer_weight,String trainer_image,String trainer_address,int is_active);
    public String updatetrainer(int trainer_id,int branch_id,String trainer_first_name,String trainer_last_name,String trainer_username,String trainer_email,String trainer_password,int country_id,int state_id,int city_id,String trainer_gender,String trainer_birth_date,int trainer_age,int trainer_height,int trainer_weight,String trainer_image,String trainer_address,int is_active);
    public Trainer searchtrainer(int trainer_id);
    public String removetrainer(int trainer_id);
    
    //user
    
    List<Users> getalluser();
   public String adduser(String user_role,int branch_id,String first_name,String last_name,String username,String email,String password,int country_id,int state_id,int city_id,String address,String gender,String birth_date,int age,int height,int weight,String image,int is_active);
  public String removeuser(int user_id); 
  
  public String findbyUserName(String username);
  
    
    //plan
    
    List<Plans> getallplan();
    public String addplan(String plan_name,String time,String price,int Is_active);
    public String updateplan(int plan_id,String plan_name,String time,String price,int Is_active);
    public Plans searchplan(int plan_id);
    public String removeplan(int plan_id);
    
    //blog
    
    List<Blogs> getallblog();
    public String addblog(String tag,String title,String image,String description);
    public String updateblog(int blog_id,String tag,String title,String image,String description);
    public Blogs searchblog(int blog_id);
    public String removeblog(int blog_id);
    
    
   
}
