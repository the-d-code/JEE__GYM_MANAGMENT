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
@StaticMetamodel(Countries.class)
public class Countries_ { 

    public static volatile ListAttribute<Countries, Users> usersList;
    public static volatile ListAttribute<Countries, Trainer> trainerList;
    public static volatile ListAttribute<Countries, States> statesList;
    public static volatile SingularAttribute<Countries, String> countryName;
    public static volatile ListAttribute<Countries, Branches> branchesList;
    public static volatile SingularAttribute<Countries, Integer> countryId;

}