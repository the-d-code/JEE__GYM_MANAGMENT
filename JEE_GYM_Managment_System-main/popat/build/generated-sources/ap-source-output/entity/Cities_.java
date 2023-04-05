package entity;

import entity.Branches;
import entity.States;
import entity.Trainer;
import entity.Users;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Cities.class)
public class Cities_ { 

    public static volatile ListAttribute<Cities, Users> usersList;
    public static volatile ListAttribute<Cities, Trainer> trainerList;
    public static volatile SingularAttribute<Cities, String> cityName;
    public static volatile SingularAttribute<Cities, States> stateId;
    public static volatile SingularAttribute<Cities, Integer> cityId;
    public static volatile ListAttribute<Cities, Branches> branchesList;

}