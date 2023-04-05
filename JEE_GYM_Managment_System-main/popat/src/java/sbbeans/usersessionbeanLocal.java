/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/SessionLocal.java to edit this template
 */
package sbbeans;

import javax.ejb.Local;

/**
 *
 * @author Dell
 */
@Local
public interface usersessionbeanLocal {
    
    public String adduser(String user_role,int branch_id,String first_name,String last_name,String username,String email,String password,int country_id,int state_id,int city_id,String address,String gender,String birth_date,int age,int height,int weight,String image,int is_active);
    
}
