<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>更新英雄</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    更新英雄：<br>
    <form action="UpdateHeroServlet" method="post">
    请输入要更新英雄的ID：<input type="text" name="id"><br>
    
    英雄名：<input type="text" name="name"><br>
   血条量： <input type="text" name="xietiao"><br>
    伤害值：<input type="text" name="damage"><br>
    <input type="submit" value="提交"><br>
    </form>
  </body>
</html>
