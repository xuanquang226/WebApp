package com.annp.pojo;

import com.annp.pojo.District;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-23T15:38:27", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Ward.class)
public class Ward_ { 

    public static volatile SingularAttribute<Ward, Date> createdDate;
    public static volatile SingularAttribute<Ward, District> districtId;
    public static volatile SingularAttribute<Ward, Integer> id;
    public static volatile SingularAttribute<Ward, String> ward;
    public static volatile SingularAttribute<Ward, Date> updatedDate;

}