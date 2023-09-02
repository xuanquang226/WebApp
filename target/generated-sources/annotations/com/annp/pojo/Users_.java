package com.annp.pojo;

import com.annp.pojo.Comment;
import com.annp.pojo.Orders;
import com.annp.pojo.Role;
import com.annp.pojo.Status;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-09-02T18:11:25", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> youtube;
    public static volatile SingularAttribute<Users, Integer> gender;
    public static volatile SingularAttribute<Users, Status> userstatus;
    public static volatile SingularAttribute<Users, String> facebookID;
    public static volatile SingularAttribute<Users, String> instagram;
    public static volatile SingularAttribute<Users, Date> updatedDate;
    public static volatile SetAttribute<Users, Orders> ordersSet;
    public static volatile SingularAttribute<Users, String> tokenFacbook;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SetAttribute<Users, Comment> commentSet;
    public static volatile SingularAttribute<Users, String> tiktok;
    public static volatile SingularAttribute<Users, Integer> id;
    public static volatile SingularAttribute<Users, Integer> exp;
    public static volatile SingularAttribute<Users, String> tokenGoogle;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> googleID;
    public static volatile SingularAttribute<Users, String> address;
    public static volatile SingularAttribute<Users, String> facebook;
    public static volatile SingularAttribute<Users, String> otp;
    public static volatile SingularAttribute<Users, String> avatar;
    public static volatile SingularAttribute<Users, Date> otpGeneratedTime;
    public static volatile SingularAttribute<Users, Date> createdDate;
    public static volatile SingularAttribute<Users, String> phone;
    public static volatile SingularAttribute<Users, String> fullname;
    public static volatile SingularAttribute<Users, Role> userRole;
    public static volatile SingularAttribute<Users, String> username;

}