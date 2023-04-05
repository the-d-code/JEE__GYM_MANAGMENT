package entity;

import entity.Branches;
import entity.Cities;
import entity.Countries;
import entity.Schedules;
import entity.States;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Trainer.class)
public class Trainer_ { 

    public static volatile SingularAttribute<Trainer, Branches> branchId;
    public static volatile SingularAttribute<Trainer, String> trainerUsername;
    public static volatile SingularAttribute<Trainer, String> trainerGender;
    public static volatile SingularAttribute<Trainer, States> stateId;
    public static volatile SingularAttribute<Trainer, Cities> cityId;
    public static volatile SingularAttribute<Trainer, Integer> isActive;
    public static volatile SingularAttribute<Trainer, Countries> countryId;
    public static volatile SingularAttribute<Trainer, String> tarinerAddress;
    public static volatile SingularAttribute<Trainer, Integer> trainerAge;
    public static volatile SingularAttribute<Trainer, Integer> trainerWeight;
    public static volatile SingularAttribute<Trainer, String> trainerLastName;
    public static volatile SingularAttribute<Trainer, String> trainerFirstName;
    public static volatile SingularAttribute<Trainer, String> trainerBirthDate;
    public static volatile ListAttribute<Trainer, Schedules> schedulesList;
    public static volatile SingularAttribute<Trainer, String> trainerImage;
    public static volatile SingularAttribute<Trainer, String> trainerEmail;
    public static volatile SingularAttribute<Trainer, String> trainerPassword;
    public static volatile SingularAttribute<Trainer, Integer> trainerId;
    public static volatile SingularAttribute<Trainer, Integer> trainerHeight;

}