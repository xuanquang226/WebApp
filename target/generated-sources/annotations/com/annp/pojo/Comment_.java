package com.annp.pojo;

import com.annp.pojo.Comment;
import com.annp.pojo.Product;
import com.annp.pojo.Users;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-10T15:39:56", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Comment.class)
public class Comment_ { 

    public static volatile SingularAttribute<Comment, Date> createdDate;
    public static volatile SingularAttribute<Comment, Product> productid;
    public static volatile SingularAttribute<Comment, Integer> dislike;
    public static volatile SingularAttribute<Comment, Integer> likeCount;
    public static volatile SingularAttribute<Comment, Integer> id;
    public static volatile SingularAttribute<Comment, Date> updatedDate;
    public static volatile SingularAttribute<Comment, Comment> reply;
    public static volatile SingularAttribute<Comment, Users> userid;
    public static volatile SingularAttribute<Comment, String> content;

}