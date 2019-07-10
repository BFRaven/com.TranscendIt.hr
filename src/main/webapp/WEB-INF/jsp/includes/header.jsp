<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>

    <%--        FAVICON TRANSCEND ICON--%>


    <%--        JQUERY TODO:check for support of min.js --%>
    <c:url value="/webjars/jquery/3.4.1/jquery.min.js" var="jquery" />
    <script src="${jquery}"></script>

    <%--        BOOSTRAP--%>
    <c:url value="/webjars/bootstrap/4.3.1/js/bootstrap.min.js" var="bootstrapJS"/>
    <script src="${bootstrapJS}"></script>
    <%--            <c:url value="/webjars/bootstrap/4.3.1/css/bootstrap.min.css" var="bootstrapCSS"/>--%>
    <%--                <link href="${bootstrapCSS}" rel="stylesheet" media="screen" />--%>
    <%--                BOOTSWATCH--%>
    <%--            TODO: make sure to get resolved, added the two dots before the directory--%>
    <c:url value="/static/css/bootswatch_paper.css" var="bootstrapCSS"/>
    <link href="${bootstrapCSS}" rel="stylesheet" media="screen" />
    <%--        CUSTOM JS--%>
    <%--            TODO: make sure to get resolved--%>
    <c:url value="/static/js/common.js" var="common" />
    <script src="${common}"></script>
    <%--        CUSTOM CSS--%>
    <c:url value="/static/css/transcendengineer.css" var="boostrapCUSTOM" />
    <link href="${boostrapCUSTOM}" rel="stylesheet" media="screen"/>

    <title>Transcend IT HR App</title>


</head>

<body>















