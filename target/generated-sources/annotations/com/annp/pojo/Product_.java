package com.annp.pojo;

import com.annp.pojo.CategorySub;
import com.annp.pojo.OrderDetail;
import com.annp.pojo.Status;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-10T15:39:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> image;
    public static volatile SingularAttribute<Product, Status> productstatus;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, Integer> unitsSold;
    public static volatile SingularAttribute<Product, String> description;
    public static volatile SingularAttribute<Product, Integer> discount;
    public static volatile SingularAttribute<Product, Date> updatedDate;
    public static volatile SetAttribute<Product, OrderDetail> orderDetailSet;
    public static volatile SingularAttribute<Product, CategorySub> categorysubId;
    public static volatile SingularAttribute<Product, Date> createdDate;
    public static volatile SingularAttribute<Product, Integer> reviewCount;
    public static volatile SingularAttribute<Product, Integer> price;
    public static volatile SingularAttribute<Product, BigDecimal> averageRating;
    public static volatile SingularAttribute<Product, String> name;
    public static volatile SingularAttribute<Product, Integer> id;

}