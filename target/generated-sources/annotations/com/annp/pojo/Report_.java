package com.annp.pojo;

import com.annp.pojo.Comment;
import com.annp.pojo.Status;
import com.annp.pojo.Users;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-23T15:38:27", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Report.class)
public class Report_ { 

    public static volatile SingularAttribute<Report, Date> createdDate;
    public static volatile SingularAttribute<Report, Comment> commentid;
    public static volatile SingularAttribute<Report, Integer> reportCount;
    public static volatile SingularAttribute<Report, Integer> id;
    public static volatile SingularAttribute<Report, Date> updatedDate;
    public static volatile SingularAttribute<Report, Status> reportstatus;
    public static volatile SingularAttribute<Report, Users> userid;
    public static volatile SingularAttribute<Report, String> content;

}