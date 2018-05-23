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
    <style type="text/css">
        .Header {CLEAR: both; DISPLAY: block; FLOAT: left; BACKGROUND-IMAGE: url(<%=path %>/img/reservation01.jpg); WIDTH: 972px; POSITION: relative; HEIGHT: 110px}
        .Header .HeaderTop {HEIGHT: 70px}
    </style>
    <script type="text/javascript">
        function liuyanAll()
        {
                 var url="<%=path %>/liuyanAll.action";
			     window.open(url,"_blank");
        }
    </script>
  </head>
  
  <body>
	 <div align="center" class="Wrapper">
		 <div class="Header">
				<div class="HeaderTop">
				    <br/>
				    <font size="22px;">库尔勒市经济技术开发区电子政务网站</font>
				</div>
				<div id="Menu" class="Menu">
					<div id="fstMenu" class="fstMenu"></div>
					<div class="secMenu">
						<span id="secMenu0" class="secMenu-center">
						     <a href="<%=path %>/qiantai/default.jsp">首页</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <a href="<%=path %>/lingdaoxinxiangAll.action">领导信箱</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <a href="<%=path %>/biaogexiazaiAll.action">表格下载</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <a href="<%=path %>/zhengwuAll.action">政务公开</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
						     <a href="<%=path %>/bianmindianhuaAll.action">便民电话</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onclick="liuyanAll()">留言板</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a target="_blank" href="<%=path %>/login.jsp">进入后台</a>
						</span>
					</div>
				</div>
		    </div>
        </div>	
  </body>
</html>
