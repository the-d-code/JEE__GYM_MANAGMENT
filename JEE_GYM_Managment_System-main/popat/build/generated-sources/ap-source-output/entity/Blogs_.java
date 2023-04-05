package entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-12-29T21:19:29", comments="EclipseLink-2.7.9.v20210604-rNA")
@StaticMetamodel(Blogs.class)
public class Blogs_ { 

    public static volatile SingularAttribute<Blogs, String> image;
    public static volatile SingularAttribute<Blogs, String> description;
    public static volatile SingularAttribute<Blogs, String> tag;
    public static volatile SingularAttribute<Blogs, String> title;
    public static volatile SingularAttribute<Blogs, Integer> blogId;

}