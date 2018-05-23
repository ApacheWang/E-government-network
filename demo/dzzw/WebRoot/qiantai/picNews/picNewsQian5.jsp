<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
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
      <table cellspacing="1" width="100%">
          <tr>
              <s:iterator value="#request.picNewsList" id="picNews" status="sta">
                  <td align="center">
                     <a href="<%=path %>/picNewsDetailQian.action?picNewsId=<s:property value="#picNews.picNewsId"/>">     
                     <img width="140" height="110" src="<%=path %>/<s:property value="#picNews.fujian"/>"/></a>
                     <br>
                     <s:property value="#picNews.picNewsTitle"/>
                  </td>
              </s:iterator>
          </tr>
      </table>
  </body>
</html>
