package com.annp.pojo;

import com.annp.pojo.City;
import com.annp.pojo.Ward;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-10T15:39:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(District.class)
public class District_ { 

    public static volatile SingularAttribute<District, Date> createdDate;
    public static volatile SetAttribute<District, Ward> wardSet;
    public static volatile SingularAttribute<District, String> district;
    public static volatile SingularAttribute<District, Integer> id;
    public static volatile SingularAttribute<District, Date> updatedDate;
    public static volatile SingularAttribute<District, City> cityId;

}