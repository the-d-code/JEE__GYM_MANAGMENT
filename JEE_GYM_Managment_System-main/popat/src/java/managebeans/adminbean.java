/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package managebeans;
import entity.*;
import entity.Countries;
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
@Named(value = "adminbean")
@SessionScoped
public class adminbean implements Serializable {

    @EJB
    private sessionbeanLocal sb;

    public sessionbeanLocal getSb() {
        return sb;
    }

    public void setSb(sessionbeanLocal sb) {
        this.sb = sb;
    }
    
    //country
    
    int country_id;
    String country_name;

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
    
    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
    
    //display country
     public List<Countries> getallcountry(){
       return sb.getallcountry();
   }
     
     //insert country
    public String addCountry(){
        try{
            sb.addCountry(country_name);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        country_name = "";
        return "countries.jsf";
    }
    
    //update country
    public String updatecountry(){
       try{
           sb.updatecountry(country_id, country_name);
       }
        catch(Exception e){
            System.out.println(e.getMessage());
            
        }
       country_name=" ";
       return "countries.jsf";
   }
    
    //search country
    public String searchcountry(int cid){
       Countries c=sb.searchcountry(cid);
       country_id=c.getCountryId();
       country_name=c.getCountryName();
       return "updatecountry.jsf";
   }
    
    //remove country
    public void removecountry(int country_id){
        sb.removecountry(country_id);
    }
    
     //State
     
    int state_id;
    String state_name;

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }
    
    //display state
    public List<States> getallstates(){
       return sb.getallstates();
   }
    
   //insert state
   public String addstates(){
        try{
            
            sb.addstates(state_name, country_id);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
    }
        state_name=" ";
        return "states.jsf";
   }
   
   //update state
   
   public String updatestate(){
       try{
           sb.updatestate(state_id, state_name, country_id);
       }
        catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
   }
       state_name=" ";
       return "states.jsf";
   }
   
   //search state
   
   public String searchstate(int sid){
       States state=sb.searchstate(sid);
       state_id=state.getStateId();
       state_name=state.getStateName();
       country_id=state.getCountryId().getCountryId();
       return "updatestate.jsf";
       
   }
   
   //remove state
   public void removestate(int state_id){
       sb.removestate(state_id);
   }
   
   //find states by country
   
    public List<States> findStatesbyId(Integer s_id) {
        return sb.findStatesbyId(s_id);
    }
    
    public String findCountriesbyStatesId(int s_id){
        return sb.findCountriesbyStatesId(s_id);
    }
    
    //city
    
    int city_id;
    String city_name;

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }
    
    //display city
    public List<Cities> getallcity(){
       return sb.getallcity();
   }
   
    //insert city
   public String addcities(){
       try{
           sb.addcities(city_name, state_id);
       }
       catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
   }
       city_name=" ";
       return "cities.jsf";
   }
   
   //update city 
   
   public String updatecity(){
       try{
           sb.updatecity(city_id, city_name, state_id);
       }
        catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
   }
     city_name=" ";
     return "cities.jsf";
   }
   
   //search city
   
   public String searchcity( int cid){
       Cities city=sb.searchcity(cid);
       city_id=city.getCityId();
       city_name=city.getCityName();
       state_id=city.getStateId().getStateId();
       
       return "updatecity.jsf";
       
   }
   
   //remove city
   public void removecity(int city_id){
       sb.removecity(city_id);
   }
    
    
    /**
     * Creates a new instance of adminbean
     */
    public adminbean() {
    }
   
}


