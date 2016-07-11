<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>

<head>

<link rel="stylesheet" type="text/css" href="resources/css/homes.css" />

<title>発送指示確認画面</title>

<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>

<body  bgcolor="#FFD5EC">

<c:forEach items="${list}" var="obj">
<form:form modelAttribute="FormModel">


<div id="site-box2">

     <div id = "title2"><h2>発送指示確認画面</h2></div>
     <div id = "com1"><h4>品番:</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>発注数:</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>郵便番号:</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>住所1(都道府県):</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>住所2(市区町村、番地):</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>住所3(建物名、アパート名など):</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>電話番号:</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>
     <div id = "com1"><h4>発注者:</h4></div>
     <div id = "com2"><h4>（入力された値が入ります）</h4></div>

<input type="hidden" name="id" value="${id}">

     <div id = "com3"><input type="submit" value="発送開始"></div>
     <div id = "com4"><input type="button" value="発注確認"></div>
     <div id = "com4"><input type="button" value="進捗確認"></div>
     <div id = "com4"><input type="button" value="発送内容変更"></div>
</div>


</form:form>
</c:forEach>

</body>
</html>