package com.annp.pojo;

import com.annp.pojo.Category;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-26T15:51:08", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(CategorySub.class)
public class CategorySub_ { 

    public static volatile SingularAttribute<CategorySub, Date> createdDate;
    public static volatile SingularAttribute<CategorySub, String> name;
    public static volatile SingularAttribute<CategorySub, Integer> id;
    public static volatile SingularAttribute<CategorySub, Date> updatedDate;
    public static volatile SingularAttribute<CategorySub, Category> categoryId;

}