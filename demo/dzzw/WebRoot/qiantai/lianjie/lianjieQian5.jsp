<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gonggaoQian5.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript">
	   function op(url)
	   {
	      window.open(url);
	   }
	</script>

  </head>
  
  <body>
      <table width="100%">
	     <s:iterator value="#request.lianjieList" id="lianjie">
	          <tr>
	             <td align="left"><a href="#" onclick="op('<s:property value="#lianjie.url"/>')"><s:property value="#lianjie.name"/></a></td>
	          </tr>
	     </s:iterator>
	  </table>
  </body>
</html>
