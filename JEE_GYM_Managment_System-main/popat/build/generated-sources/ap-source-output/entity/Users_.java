package entity;

import entity.Branches;
import entity.Cities;
import entity.Countries;
import entity.Payments;
import entity.Schedules;
import entity.States;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> image;
    public static volatile SingularAttribute<Users, Branches> branchId;
    public static volatile SingularAttribute<Users, String> address;
    public static volatile ListAttribute<Users, Payments> paymentsList;
    public static volatile SingularAttribute<Users, String> gender;
    public static volatile SingularAttribute<Users, States> stateId;
    public static volatile SingularAttribute<Users, Integer> weight;
    public static volatile SingularAttribute<Users, Cities> cityId;
    public static volatile SingularAttribute<Users, Integer> isActive;
    public static volatile SingularAttribute<Users, Integer> userId;
    public static volatile SingularAttribute<Users, String> birthDate;
    public static volatile SingularAttribute<Users, Countries> countryId;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile ListAttribute<Users, Schedules> schedulesList;
    public static volatile SingularAttribute<Users, String> userRole;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, Integer> age;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile SingularAttribute<Users, Integer> height;

}