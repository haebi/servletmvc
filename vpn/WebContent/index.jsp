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
<p>Servlet MVC ���� ������ �Դϴ�. ID/PW (qqq/www) �Դϴ�.</p>
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
<p>�α��� ���̵� : <c:out value="${id}" /></p>
<p><a href="logout">Logout</a></p>
<hr />
	</c:otherwise>
	
</c:choose>

<p></p>
<p>/login (post, ���� ����)</p>
<p><a href="auth/mypage">auth/mypage</a> (�α��� �� �̵� ����)</p>
<p><a href="listdata">listdata</a></p>
<hr />

</body>
</html>