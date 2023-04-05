/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package sbbeans;

import entity.Branches;
import entity.Cities;
import entity.Countries;
import entity.States;
import entity.Users;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
public class usersessionbean implements usersessionbeanLocal {

    @PersistenceContext(unitName = "popatPU")
    private EntityManager em;

    
    
    @Override
    public String adduser(String user_role, int branch_id, String first_name, String last_name, String username, String email, String password, int country_id, int state_id, int city_id, String address, String gender, String birth_date, int age, int height, int weight, String image, int is_active) {
         Users user = new Users();
        user.setUserRole(user_role);
        Branches branch = em.find(Branches.class, branch_id);
        user.setBranchId(branch);
        user.setFirstName(first_name);
        user.setLastName(last_name);
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        Countries country = em.find(Countries.class, country_id);
        user.setCountryId(country);
        States state = em.find(States.class, state_id);
        user.setStateId(state);
        Cities city = em.find(Cities.class, city_id);
        user.setCityId(city);
        user.setAddress(address);
        user.setGender(gender);
        user.setBirthDate(birth_date);
        user.setAge(age);
        user.setHeight(height);
        user.setWeight(weight);
        user.setImage(image);
        user.setIsActive(1);
        em.persist(user);
        return "inserted";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public void persist(Object object) {
        em.persist(object);
    }
}
