<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="URL" class="com.haebi.config.URL" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<c:if test="${not empty datadata}">
	<ul>
		<c:forEach var="listValue" items="${datadata}">
			<li>${listValue.name}</li>
			<li>${listValue.tel}</li>
			<li>${listValue.addr}</li>
		</c:forEach>
	</ul>
</c:if>
<p><a href="<%=URL.MakeURL(request, URL.LOGIN) %>">메인</a></p>
</body>
</html>