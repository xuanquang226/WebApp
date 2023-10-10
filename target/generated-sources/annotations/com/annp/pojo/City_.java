package com.annp.pojo;

import com.annp.pojo.District;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-10T15:39:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(City.class)
public class City_ { 

    public static volatile SingularAttribute<City, Date> createdDate;
    public static volatile SetAttribute<City, District> districtSet;
    public static volatile SingularAttribute<City, String> city;
    public static volatile SingularAttribute<City, Integer> id;
    public static volatile SingularAttribute<City, Date> updatedDate;

}