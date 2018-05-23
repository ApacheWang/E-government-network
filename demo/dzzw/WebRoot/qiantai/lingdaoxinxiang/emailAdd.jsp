<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
	<meta http-equiv="description" content="This is my page"/>
	<link href="<%=path %>/css/Common.css" rel="stylesheet" type="text/css" />
    <link href="<%=path %>/css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
    </script>
  </head>
  
<body>
<!-- head如果图片高度不合适。请修改Common.ces里面的".Header .HeaderTop"的高度。和".Header"的高度-->
<jsp:include flush="true" page="/qiantai/inc/incTop.jsp"></jsp:include>    
<!-- head-->	
	
	
	
	
<!--body-->
<div align="center" class="Wrapper">
<div id="MainCenter" align="center" class="MainCenter">
	     <div id="navigation" class="naivgation">
				 <!-- 公告-->
				 <div class="SquarelyGreenContainer">
					<div class="top">
						<div class="bgbtop-center">
							<span><a href="">网站公告</a></span>
							<div class="WinRight"></div>
						</div>
					</div>
					<div class="Slot">
					    <s:action name="gonggaoQian5" executeResult="true"></s:action>
					</div>
				 </div>
				 <!-- 公告-->
				 <!-- 公告-->
				 <div class="SquarelyGreenContainer">
					<div class="top">
						<div class="bgbtop-center">
							<span><a href="">政府部门网站</a></span>
							<div class="WinRight"></div>
						</div>
					</div>
					<div class="Slot">
					    <s:action name="lianjieQian5" executeResult="true"></s:action>
					</div>
				 </div>
				 <!-- 公告-->
				 <!-- 日历-->
				 <div class="SquarelyGreenContainer">
					<div class="top">
						<div class="bgbtop-center">
							<span><a href="">日历表</a></span>
							<div class="WinRight"></div>
						</div>
					</div>
					<div class="Slot">
					    <jsp:include flush="true" page="/qiantai/rili/rili.jsp"></jsp:include>
					</div>
				 </div>
				 <!-- 日历-->
		 </div>
		 <div id="content" class="Sub">
				<div class="NewContainer770">
					<div class="BoxHeader">
						<div class="BoxHeader-center MarginTop10">写邮件</div>
					</div>
					<div class="Slot">
						<form action="<%=path %>/emailSend.action" name="formAdd" method="post">
							     <table width="98%" align="center" border="0" cellpadding="4" cellspacing="1" style="margin-bottom:8px">
									<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
									    <td width="15%" bgcolor="#FFFFFF" align="right">
									        收件人：
									    </td>
									    <td width="85%" bgcolor="#FFFFFF" align="left">
									        <input type="text" name="toUrl" size="30" value="<%=request.getParameter("toUrl") %>" readonly="readonly"/>
									    </td>
									</tr>
									<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
									    <td width="15%" bgcolor="#FFFFFF" align="right">
									         邮件标题：
									    </td>
									    <td width="85%" bgcolor="#FFFFFF" align="left">
									        <input type="text" name="title" size="30"/>
									    </td>
									</tr>
									<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
									    <td width="15%" bgcolor="#FFFFFF" align="right">
									         邮件内容：
									    </td>
									    <td width="85%" bgcolor="#FFFFFF" align="left">
									        <FCK:editor instanceName="content"  basePath="/fckeditor" width="500" height="200" value="请输入内容" toolbarSet="Basic">
	                                        </FCK:editor>
									    </td>
									</tr>
									<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
									    <td width="15%" bgcolor="#FFFFFF" align="right">
									        &nbsp;
									    </td>
									    <td width="85%" bgcolor="#FFFFFF" align="left">
									       <input type="submit" value="提交"/>&nbsp; 
									       <input type="reset" value="重置"/>&nbsp;
									    </td>
									</tr>
								 </table>
						</form>
                    </div>
				</div>
		 </div>
</div>
</div>
<!--body-->
	
	
	
<!--foot -->	
<div align="center" class="Wrapper">
	<div id="footer" align="center" class="Footer">
		 <jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
	</div>
</div>
<!--foot -->	
</body>
</html>
