package entity;

import entity.Trainer;
import entity.Users;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Schedules.class)
public class Schedules_ { 

    public static volatile SingularAttribute<Schedules, String> startTime;
    public static volatile SingularAttribute<Schedules, String> endTime;
    public static volatile SingularAttribute<Schedules, Users> userId;
    public static volatile SingularAttribute<Schedules, Integer> scheduleId;
    public static volatile SingularAttribute<Schedules, Trainer> trainerId;

}