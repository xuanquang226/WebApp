package com.annp.pojo;

import com.annp.pojo.Users;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-07-26T16:26:12", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Role.class)
public class Role_ { 

    public static volatile SetAttribute<Role, Users> usersSet;
    public static volatile SingularAttribute<Role, Date> updateDate;
    public static volatile SingularAttribute<Role, Date> createdDate;
    public static volatile SingularAttribute<Role, String> permission;
    public static volatile SingularAttribute<Role, Integer> id;

}