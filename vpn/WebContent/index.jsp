<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="URL" class="com.haebi.config.URL" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Servlet MVC 연습 페이지 입니다. ID/PW (qqq/www) 입니다.</p>
<%=(String)session.getAttribute("id") %>
<c:choose>

	<c:when test="${empty id}">
<hr />
<p>LOGIN</p>
<form method="post" action="<%=URL.MakeURL(request, URL.AUTH_LOGINCTRL) %>">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td>PW</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="LOGIN"></td>
		</tr>
	</table>
</form>
<hr />
	</c:when>
	
	<c:otherwise>
<hr />
<p>로그인 아이디 : <c:out value="${id}" /></p>
<p><a href="logout">Logout</a></p>
<hr />
	</c:otherwise>
	
</c:choose>

<p></p>
<p>/login (post, 인증 수행)</p>
<p><a href="auth/mypage">auth/mypage</a> (로그인 후 이동 가능)</p>
<p><a href="listdata">listdata</a></p>
<hr />

</body>
</html>