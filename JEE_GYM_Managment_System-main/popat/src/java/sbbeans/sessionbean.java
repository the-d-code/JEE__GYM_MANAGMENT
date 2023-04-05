/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package sbbeans;

import entity.Blogs;
import entity.Branches;
import entity.Cities;
import entity.Countries;
import entity.Plans;
import entity.States;
import entity.Trainer;
import entity.Users;
import java.util.Collection;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
public class sessionbean implements sessionbeanLocal {

    @PersistenceContext(unitName = "popatPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    String gettinguser_id;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public List<Countries> getallcountry() {
        List<Countries> country = em.createNamedQuery("Countries.findAll").getResultList();
        return country;
    }

    @Override
    public String addCountry(String country_name) {

        Countries c = new Countries();
        c.setCountryName(country_name);
        em.persist(c);
        return "Inserted";

    }

    @Override
    public List<States> getallstates() {
        List<States> state = em.createNamedQuery("States.findAll").getResultList();
        return state;
    }

    @Override
    public String addstates(String state_name, int country_id) {
        try {

            Countries c = em.find(Countries.class, country_id);
            List<States> s = c.getStatesList();
            States state = new States();
            // state.setStateId(State_id);
            state.setStateName(state_name);
            state.setCountryId(c);
            s.add(state);
            c.setStatesList(s);
            em.persist(state);
            em.merge(c);

            return "inserted";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Cities> getallcity() {

        List<Cities> city = em.createNamedQuery("Cities.findAll").getResultList();
        return city;

    }

    @Override
    public String addcities(String city_name, int state_id) {
        try {

            States s = em.find(States.class, state_id);
            List<Cities> c = s.getCitiesList();
            Cities city = new Cities();
            city.setCityName(city_name);
            city.setStateId(s);
            c.add(city);
            s.getCitiesList();
            em.persist(city);
            em.merge(s);
            return "inserted";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Branches> getallbranch() {

        List<Branches> branch = em.createNamedQuery("Branches.findAll").getResultList();
        return branch;

    }

    @Override
    public List<Trainer> getalltrainer() {
        List<Trainer> trainer = em.createNamedQuery("Trainer.findAll").getResultList();
        return trainer;
    }

    @Override
    public String addbranch(String branch_name, int country_id, int state_id, int city_id, String address, String email, String mobile, String description) {
        Branches branches = new Branches();
        branches.setBranchName(branch_name);
        Countries country = em.find(Countries.class, country_id);
        branches.setCountryId(country);
        States state = em.find(States.class, state_id);
        branches.setStateId(state);
        Cities city = em.find(Cities.class, city_id);
        branches.setCityId(city);
        branches.setAddress(address);
        branches.setEmail(email);
        branches.setMobile(mobile);
        branches.setDescription(description);
        em.persist(branches);
        return "Inserted";

    }

    @Override
    public List<Users> getalluser() {
        List<Users> user = em.createNamedQuery("Users.findAll").getResultList();
        return user;
    }

    @Override
    public List<Plans> getallplan() {
        List<Plans> plan = em.createNamedQuery("Plans.findAll").getResultList();
        return plan;
    }

    @Override
    public String addplan(String plan_name, String time, String price, int Is_active) {
        Plans p = new Plans();
        p.setPlanName(plan_name);
        p.setTime(time);
        p.setPrice(price);
        p.setIsActive(Is_active);
        em.persist(p);
        return "Inserted";
    }

    @Override
    public List<Blogs> getallblog() {
        List<Blogs> blog = em.createNamedQuery("Blogs.findAll").getResultList();
        return blog;
    }

    @Override
    public String updateplan(int plan_id, String plan_name, String time, String price, int Is_active) {

        try {
            Plans p = em.find(Plans.class, plan_id);
            p.setPlanName(plan_name);
            p.setTime(time);
            p.setPrice(price);
            p.setIsActive(Is_active);
            p.setPlanId(plan_id);
            em.merge(p);
            return "updated";

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Plans searchplan(int plan_id) {

        Plans plan = em.find(Plans.class, plan_id);
        return plan;

    }

    @Override
    public String updatecountry(int country_id, String country_name) {
        try {
            Countries c = em.find(Countries.class, country_id);
            c.setCountryName(country_name);
            em.merge(c);
            return "updated";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }

    }

    @Override
    public Countries searchcountry(int country_id) {
        Countries country = em.find(Countries.class, country_id);
        return country;
    }

    @Override
    public String addtrainer(int branch_id, String trainer_first_name, String trainer_last_name, String trainer_username, String trainer_email, String trainer_password, int country_id, int state_id, int city_id, String trainer_gender, String trainer_birth_date, int trainer_age, int trainer_height, int trainer_weight, String trainer_image, String trainer_address, int is_active) {

        Trainer trainer = new Trainer();
        Branches branch = em.find(Branches.class, branch_id);
        trainer.setBranchId(branch);
        trainer.setTrainerFirstName(trainer_first_name);
        trainer.setTrainerLastName(trainer_last_name);
        trainer.setTrainerUsername(trainer_username);
        trainer.setTrainerEmail(trainer_email);
        trainer.setTrainerPassword(trainer_password);
        Countries country = em.find(Countries.class, country_id);
        trainer.setCountryId(country);
        States state = em.find(States.class, state_id);
        trainer.setStateId(state);
        Cities city = em.find(Cities.class, city_id);
        trainer.setCityId(city);
        trainer.setTrainerGender(trainer_gender);
        trainer.setTrainerBirthDate(trainer_birth_date);
        trainer.setTrainerAge(trainer_age);
        trainer.setTrainerHeight(trainer_height);
        trainer.setTrainerWeight(trainer_weight);
        trainer.setTrainerImage(trainer_image);
        trainer.setTarinerAddress(trainer_address);
        trainer.setIsActive(is_active);
        em.persist(trainer);
        return "inserted";
    }

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
        user.setIsActive(is_active);
        em.persist(user);
        return "inserted";
    }

    @Override
    public String updateBranch(int branch_id, String branch_name, int country_id, int state_id, int city_id, String address, String email, String mobile, String description) {
        Branches branch = em.find(Branches.class, branch_id);
        branch.setBranchName(branch_name);
        Countries country = em.find(Countries.class, country_id);
        branch.setCountryId(country);
        States state = em.find(States.class, state_id);
        branch.setStateId(state);
        Cities city = em.find(Cities.class, city_id);
        branch.setCityId(city);
        branch.setAddress(address);
        branch.setEmail(email);
        branch.setMobile(mobile);
        branch.setDescription(description);
        em.merge(branch);
        return "Updated";
    }

    @Override
    public Branches searchBanch(int branch_id) {
        Branches branch = em.find(Branches.class, branch_id);
        return branch;
    }

    @Override
    public String removeBranch(int branch_id) {
        Branches branch = em.find(Branches.class, branch_id);
        em.remove(branch);
        return "Deleted";
    }

    @Override
    public String removecountry(int country_id) {
        Countries country = em.find(Countries.class, country_id);
        em.remove(country);
        return "Deleted";
    }

    @Override
    public String removestate(int state_id) {
        States state = em.find(States.class, state_id);
        em.remove(state);
        return "Deleted";
    }

    @Override
    public String removecity(int city_id) {
        Cities city = em.find(Cities.class, city_id);
        em.remove(city);
        return "Deleted";
    }

    @Override
    public String removetrainer(int trainer_id) {
        Trainer trainer = em.find(Trainer.class, trainer_id);
        em.remove(trainer);
        return "Deleted";
    }

    @Override
    public String removeuser(int user_id) {
        Users user = em.find(Users.class, user_id);
        em.remove(user);
        return "Deleted";
    }

    @Override
    public String removeplan(int plan_id) {
        Plans plan = em.find(Plans.class, plan_id);
        em.remove(plan);
        return "Deleted";
    }

    @Override
    public String updatestate(int state_id, String state_name, int country_id) {
        States state = em.find(States.class, state_id);
        state.setStateName(state_name);
        Countries country = em.find(Countries.class, country_id);
        state.setCountryId(country);
        em.merge(state);
        return "updated";

    }

    @Override
    public States searchstate(int state_id) {
        States state = em.find(States.class, state_id);
        return state;
    }

    @Override
    public String updatecity(int city_id, String city_name, int state_id) {
        Cities city = em.find(Cities.class, city_id);
        city.setCityName(city_name);
        States state = em.find(States.class, state_id);
        city.setStateId(state);
        em.merge(city);
        return "updated";
    }

    @Override
    public Cities searchcity(int city_id) {
        Cities city = em.find(Cities.class, city_id);
        return city;
    }

    @Override
    public String updatetrainer(int trainer_id, int branch_id, String trainer_first_name, String trainer_last_name, String trainer_username, String trainer_email, String trainer_password, int country_id, int state_id, int city_id, String trainer_gender, String trainer_birth_date, int trainer_age, int trainer_height, int trainer_weight, String trainer_image, String trainer_address, int is_active) {
        Trainer trainer = new Trainer();
        Branches branch = em.find(Branches.class, branch_id);
        trainer.setBranchId(branch);
        trainer.setTrainerFirstName(trainer_first_name);
        trainer.setTrainerLastName(trainer_last_name);
        trainer.setTrainerUsername(trainer_username);
        trainer.setTrainerEmail(trainer_email);
        trainer.setTrainerPassword(trainer_password);
        Countries country = em.find(Countries.class, country_id);
        trainer.setCountryId(country);
        States state = em.find(States.class, state_id);
        trainer.setStateId(state);
        Cities city = em.find(Cities.class, city_id);
        trainer.setCityId(city);
        trainer.setTrainerGender(trainer_gender);
        trainer.setTrainerBirthDate(trainer_birth_date);
        trainer.setTrainerAge(trainer_age);
        trainer.setTrainerHeight(trainer_height);
        trainer.setTrainerWeight(trainer_weight);
        trainer.setTrainerImage(trainer_image);
        trainer.setTarinerAddress(trainer_address);
        trainer.setIsActive(is_active);
        em.merge(trainer);
        System.out.println(trainer_first_name);
        return "updated";
    }

    @Override
    public Trainer searchtrainer(int trainer_id) {
        Trainer trainer = em.find(Trainer.class, trainer_id);
        return trainer;
    }

    @Override
    public String addblog(String tag, String title, String image, String description) {
        Blogs b = new Blogs();
        b.setTag(tag);
        b.setTitle(title);
        b.setImage(image);
        b.setDescription(description);

        em.persist(b);
        return "Inserted";
    }

    @Override
    public String updateblog(int blog_id, String tag, String title, String image, String description) {
        try {
            Blogs b = em.find(Blogs.class, blog_id);
            b.setTag(tag);
            b.setTitle(title);
            b.setImage(image);
            b.setDescription(description);
            em.merge(b);
            return "updated";
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Blogs searchblog(int blog_id) {
        Blogs b = em.find(Blogs.class, blog_id);
        return b;
    }

    @Override
    public String removeblog(int blog_id) {
        Blogs b=em.find(Blogs.class, blog_id);
        em.remove(b);
        return "Deleted";
    }

    @Override
    public List<States> findStatesbyId(Integer s_id) {
        
        return em.createNamedQuery("States.States.findByStateId").setParameter("state_id", s_id).getResultList();
//        return em.createNamedQuery("TblVillage.findByVillageId").setParameter("villageId", vid).getResultList();
    }

    @Override
    public String findCountriesbyStatesId(int s_id) {
        return em.find(States.class, s_id).getCountryId().getCountryName();
        
//        return em.find(States.class, s_id).getCountryId().getCountryName();
//       return em.find(TblVillage.class, vid).getTalukaId().getTalukaName();
    }

    @Override
    public String findbyUserName(String username) {
        List <Users> user=em.createNamedQuery("Users.findByUsername").setParameter("username", username).getResultList();
        for(Users u:user){
            gettinguser_id=u.getUserId().toString();
            System.out.println("user id is" + gettinguser_id);
            
        }
        return gettinguser_id;
    }

   

    
}
