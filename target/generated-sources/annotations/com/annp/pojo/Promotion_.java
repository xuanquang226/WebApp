package com.annp.pojo;

import com.annp.pojo.Status;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-27T20:03:58", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Promotion.class)
public class Promotion_ { 

    public static volatile SingularAttribute<Promotion, Date> beginDate;
    public static volatile SingularAttribute<Promotion, String> note;
    public static volatile SingularAttribute<Promotion, String> img;
    public static volatile SingularAttribute<Promotion, Float> percentpage;
    public static volatile SingularAttribute<Promotion, Integer> quantity;
    public static volatile SingularAttribute<Promotion, String> code;
    public static volatile SingularAttribute<Promotion, Date> endDate;
    public static volatile SingularAttribute<Promotion, Integer> discount;
    public static volatile SingularAttribute<Promotion, Integer> id;
    public static volatile SingularAttribute<Promotion, Status> type;

}