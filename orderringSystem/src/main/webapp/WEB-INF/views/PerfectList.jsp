<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>一覧画面</title>

</head>

<body>

	<h1>会員一覧</h1>

	<form:form modelAttribute="FormModel">
		<c:forEach items="${list}" var="obj">

			<input type="radio" name="radio" value="${obj.ID}">名前：<c:out value="${obj.氏名}"/>
			住所：<c:out value="${obj.住所}"/>電話番号：<c:out value="${obj.電話番号}"/>
			メールアドレス：<c:out value="${obj.メールアドレス}"/><br>

		</c:forEach>

			<input type="hidden" name="id" value="${id}">
			<input type="submit" value="更新or削除">
		    <input type="button" value="新規登録"
			onclick="location.href =' http://localhost:8080/names/'" />

    </form:form>

</body>

</html>