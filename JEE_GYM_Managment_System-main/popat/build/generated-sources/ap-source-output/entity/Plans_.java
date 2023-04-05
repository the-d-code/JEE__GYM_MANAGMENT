package entity;

import entity.Payments;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Plans.class)
public class Plans_ { 

    public static volatile ListAttribute<Plans, Payments> paymentsList;
    public static volatile SingularAttribute<Plans, String> price;
    public static volatile SingularAttribute<Plans, String> planName;
    public static volatile SingularAttribute<Plans, Integer> planId;
    public static volatile SingularAttribute<Plans, String> time;
    public static volatile SingularAttribute<Plans, Integer> isActive;

}