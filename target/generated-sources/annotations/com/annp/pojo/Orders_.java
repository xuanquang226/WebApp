package com.annp.pojo;

import com.annp.pojo.OrderDetail;
import com.annp.pojo.Status;
import com.annp.pojo.Users;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-25T00:02:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Orders.class)
public class Orders_ { 

    public static volatile SingularAttribute<Orders, String> note;
    public static volatile SingularAttribute<Orders, Integer> amount;
    public static volatile SingularAttribute<Orders, Date> createdDate;
    public static volatile SingularAttribute<Orders, Integer> id;
    public static volatile SingularAttribute<Orders, Status> type;
    public static volatile SingularAttribute<Orders, Date> shippedDate;
    public static volatile SingularAttribute<Orders, Users> userid;
    public static volatile SetAttribute<Orders, OrderDetail> orderDetailSet;

}