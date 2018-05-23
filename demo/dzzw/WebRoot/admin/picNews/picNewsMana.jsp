<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="pragma" content="no-cache" />
		<meta http-equiv="cache-control" content="no-cache" />
		<meta http-equiv="expires" content="0" />
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
		<meta http-equiv="description" content="This is my page" />

		<link rel="stylesheet" type="text/css" href="<%=path %>/css/base.css" />
		
		<script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
        <script language="javascript">
           function picNewsAdd()
           {
              var url="<%=path %>/admin/picNews/picNewsAdd.jsp";
              window.location.href=url;
           }
           
           function picNewsDetail(picNewsId)
           {
                 var url="<%=path %>/picNewsDetail.action?picNewsId="+picNewsId;
                 var n="";
                 var w="480px";
                 var h="500px";
                 var s="resizable:no;help:no;status:no;scroll:yes";
				 openWin(url,n,w,h,s);
           }
           function down1(fujianPath,fujianYuashiMing)
           {
               var url="<%=path %>/updown/updown.jsp?fujianPath="+fujianPath+"&fujianYuashiMing="+fujianYuashiMing;
		       url=encodeURI(url); 
               url=encodeURI(url); 
               window.open(url,"_self");
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="5" background="<%=path %>/img/tbg.gif">&nbsp;新闻动态&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="20%">标题</td>
					<td width="20%">发布时间</td>
					<td width="20%">图片</td>
					<td width="20%">内容</td>
					<td width="20%">操作</td>
		        </tr>	
				<s:iterator value="#request.picNewsList" id="picNews">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#picNews.picNewsTitle"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<s:property value="#picNews.picNewsDate"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <img src="<%=path %>/<s:property value="#picNews.fujian"/>" width="80" height="80"/>
					</td>
					<td bgcolor="#FFFFFF" align="center">
					    <a href="#" onclick="picNewsDetail(<s:property value="#picNews.picNewsId"/>)" class="pn-loperator">查看内容</a>
					</td>
					<td bgcolor="#FFFFFF" align="center">
						<a class="pn-loperator" href="<%=path %>/picNewsDel.action?picNewsId=<s:property value="#picNews.picNewsId"/>">删除</a>
					</td>
				</tr>
				</s:iterator>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="添加新闻" style="width: 80px;" onclick="picNewsAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
