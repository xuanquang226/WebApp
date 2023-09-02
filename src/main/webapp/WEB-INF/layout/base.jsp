<%-- 
    Document   : base
    Created on : Jul 19, 2023, 5:35:15 PM
    Author     : phuan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>
            <tiles:insertAttribute name="title"/>
        </title>
        <link href="<c:url value="https://res.cloudinary.com/dkmug1913/image/upload/v1687075781/WebApp/iconshop_uxsy3a.png" />" rel="shortcut icon"/>
        <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet"/>
        <link href="<c:url value="/resources/css/user.css" />" rel="stylesheet"/>
        <link href="<c:url value="/resources/css/responsive.css" />" rel="stylesheet"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.1.js"></script>
        <script src="https://momentjs.com/downloads/moment.min.js"></script>
    </head>
    <body>
        <div id="main">
            <tiles:insertAttribute name="header"/>
            <tiles:insertAttribute name="content"/>
            <tiles:insertAttribute name="footer"/>
        </div>
        <a id="backtop" href="#main" class="gototop fa-solid fa-circle-chevron-up" style="display: none;"></a>

        <script src="<c:url value="/resources/js/product.js" />"></script>
        <script src="<c:url value="/js/cart.js" />"></script>
        <script src="<c:url value="/resources/js/comment.js" />"></script>
        <script src="<c:url value="/resources/js/stats.js" />"></script>
        <script src="<c:url value="/resources/js/index.js" />"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
    </body>
</html>
