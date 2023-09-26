package com.annp.pojo;

import com.annp.pojo.Orders;
import com.annp.pojo.Product;
import com.annp.pojo.Status;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-26T15:51:08", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(OrderDetail.class)
public class OrderDetail_ { 

    public static volatile SingularAttribute<OrderDetail, Integer> number;
    public static volatile SingularAttribute<OrderDetail, Date> createdDate;
    public static volatile SingularAttribute<OrderDetail, Status> orderstatus;
    public static volatile SingularAttribute<OrderDetail, Product> productId;
    public static volatile SingularAttribute<OrderDetail, Orders> orderId;
    public static volatile SingularAttribute<OrderDetail, Integer> price;
    public static volatile SingularAttribute<OrderDetail, Integer> id;

}