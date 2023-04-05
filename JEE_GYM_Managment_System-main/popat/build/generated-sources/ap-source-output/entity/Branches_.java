package entity;

import entity.Cities;
import entity.Countries;
import entity.States;
import entity.Trainer;
import entity.Users;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Branches.class)
public class Branches_ { 

    public static volatile SingularAttribute<Branches, Integer> branchId;
    public static volatile ListAttribute<Branches, Users> usersList;
    public static volatile SingularAttribute<Branches, String> address;
    public static volatile ListAttribute<Branches, Trainer> trainerList;
    public static volatile SingularAttribute<Branches, States> stateId;
    public static volatile SingularAttribute<Branches, String> mobile;
    public static volatile SingularAttribute<Branches, String> branchName;
    public static volatile SingularAttribute<Branches, String> description;
    public static volatile SingularAttribute<Branches, Cities> cityId;
    public static volatile SingularAttribute<Branches, String> email;
    public static volatile SingularAttribute<Branches, Countries> countryId;

}