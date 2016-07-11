<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

<link rel="stylesheet" type="text/css" href="resources/css/homes.css" />
<title>更新確認画面</title>
<script
 src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
</head>
<body>

<div id="site-box">

<div id="site-box1">

<div id = "title"><h2>Menu</h2></div>

<br>
     <h4><input type="button" value="発注登録"></h4>
     <h4><input type="button" value="進捗確認"></h4>
     <h4><input type="button" value="部品注文"></h4>
     <h4><input type="button" value="発送準備"></h4>
</div>


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


     <div id = "com9"><h4>この内容で更新してもよろしいでしょうか？</h4></div>
     <div id = "com9"><h4><input type="button" value="更新">
     <input type="button" value="戻る"></h4></div>
</div>
</div>
</body>
</html>