<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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
	<link href="css/Common.css" rel="stylesheet" type="text/css" />
    <link href="css/sitegeneric08.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
    <script language="JavaScript" type="text/javascript">
        function down1(fujianPath,fujianYuashiMing)
           {
               var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
		       url=encodeURI(url); 
               url=encodeURI(url); 
               window.open(url,"_self");
           }
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
						<div class="BoxHeader-center MarginTop10">便民电话</div>
					</div>
					<div class="Slot">
						<table width="98%" border="0" cellpadding="2" cellspacing="1" align="center" style="margin-top:8px">
							<tr align="center" bgcolor="#FAFAF1" height="22">
								<td width="20%">表格名称</td>
								<td width="20%">表格简介</td>
								<td width="20%">附件</td>
								<td width="20%">上传时间</td>
					        </tr>	
							<s:iterator value="#request.biaogexiazaiList" id="biaogexiazai">
							<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
								<td bgcolor="#FFFFFF" align="center">
									<s:property value="#biaogexiazai.name"/>
								</td>
								<td bgcolor="#FFFFFF" align="center">
									<s:property value="#biaogexiazai.jieshao" escape="false"/>
								</td>
								<td bgcolor="#FFFFFF" align="center">
								    <a href="#" onclick="down1('<s:property value="#biaogexiazai.fujian"/>','<s:property value="#biaogexiazai.fujianYuanshiming"/>')" style="font-size: 11px;color: red"><s:property value="#biaogexiazai.fujianYuanshiming"/></a>
								</td>
								<td bgcolor="#FFFFFF" align="center">
									<s:property value="#biaogexiazai.shangchuanshijian"/>
								</td>
							</tr>
							</s:iterator>
						</table>
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
