package entity;

import entity.Branches;
import entity.Cities;
import entity.Countries;
import entity.Trainer;
import entity.Users;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(States.class)
public class States_ { 

    public static volatile ListAttribute<States, Users> usersList;
    public static volatile ListAttribute<States, Trainer> trainerList;
    public static volatile SingularAttribute<States, String> stateName;
    public static volatile ListAttribute<States, Cities> citiesList;
    public static volatile SingularAttribute<States, Integer> stateId;
    public static volatile ListAttribute<States, Branches> branchesList;
    public static volatile SingularAttribute<States, Countries> countryId;

}