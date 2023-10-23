package com.annp.pojo;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-19T21:27:28", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Promotion.class)
public class Promotion_ { 

    public static volatile SingularAttribute<Promotion, Date> beginDate;
    public static volatile SingularAttribute<Promotion, String> note;
    public static volatile SingularAttribute<Promotion, String> code;
    public static volatile SingularAttribute<Promotion, Date> endDate;
    public static volatile SingularAttribute<Promotion, Integer> discount;
    public static volatile SingularAttribute<Promotion, Integer> id;
    public static volatile SingularAttribute<Promotion, Integer> type;

}