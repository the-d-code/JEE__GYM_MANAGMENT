package entity;

import entity.Plans;
import entity.Users;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Payments.class)
public class Payments_ { 

    public static volatile SingularAttribute<Payments, String> amount;
    public static volatile SingularAttribute<Payments, Integer> paymentId;
    public static volatile SingularAttribute<Payments, String> buyDate;
    public static volatile SingularAttribute<Payments, String> name;
    public static volatile SingularAttribute<Payments, String> expireDate;
    public static volatile SingularAttribute<Payments, Plans> planId;
    public static volatile SingularAttribute<Payments, Integer> isActive;
    public static volatile SingularAttribute<Payments, Users> userId;

}