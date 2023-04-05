/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import record.KeepRecord;


/**
 *
 * @author root
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    
    private String username=KeepRecord.getUsername();
    private String password=KeepRecord.getPassword();
    private String user_id=KeepRecord.getUser_id();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
    
    
    
    private String errorstatus = KeepRecord.getErrorStatus();
    
    public String getErrorStatus() {
        return errorstatus;
    }

    public void setErrorStatus(String status) {
        //status = KeepRecord.getErrorStatus();
        this.errorstatus = status;
    }

 
    public LoginBean() {
        
       // errorstatus="";
    }
    
   
    
  
}
