<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>タイトル</title>

</head>

  <frameset cols="28%,72%">
    <frame src="menu" name="menu">
    <frame src="toppage2" name="toppage2">
  </frameset>
  <frameset cols="28%,72%">
    <frame src=menu name="menu">
    <frame src=inquiry name="toppage2">
  </frameset>
  <frameset cols="28%,72%">
    <frame src=menu name="menu">
    <frame src=update name="toppage2">
  </frameset>
  <frameset cols="28%,72%">
    <frame src=menu name="menu">
    <frame src=up_fail name="toppage2">
  </frameset>
  <frameset cols="28%,72%">
    <frame src=menu name="menu">
    <frame src=ud_suc name="toppage2">
  </frameset>
</html>