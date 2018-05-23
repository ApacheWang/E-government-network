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
		
        <script language="javascript">
           function bianmindianhuaDel(id)
           {
               if(confirm('您确定删除吗？'))
               {
                   window.location.href="<%=path %>/bianmindianhuaDel.action?id="+id;
               }
           }
           
           function bianmindianhuaAdd()
           {
                 var url="<%=path %>/admin/bianmindianhua/bianmindianhuaAdd.jsp";
                 //var n="";
                 //var w="480px";
                 //var h="500px";
                 //var s="resizable:no;help:no;status:no;scroll:yes";
				 //openWin(url,n,w,h,s);
				 window.location.href=url;
           }
       </script>
	</head>

	<body leftmargin="2" topmargin="2" background='<%=path %>/img/allbg.gif'>
			<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
				<tr bgcolor="#E7E7E7">
					<td height="14" colspan="4" background="<%=path %>/img/tbg.gif">&nbsp;便民电话&nbsp;</td>
				</tr>
				<tr align="center" bgcolor="#FAFAF1" height="22">
					<td width="25%">电话名称</td>
					<td width="25%">电话号码</td>
					<td width="25%">操作</td>
		        </tr>	
				<s:iterator value="#request.bianmindianhuaList" id="bianmindianhua">
				<tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='red';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
					<td width="25%" bgcolor="#FFFFFF" align="center">
						<s:property value="#bianmindianhua.name"/>
					</td>
					<td width="25%" bgcolor="#FFFFFF" align="center">
					    <s:property value="#bianmindianhua.dianhua"/>
					</td>
					<td width="25%" bgcolor="#FFFFFF" align="center">
						<a href="#" onclick="bianmindianhuaDel(<s:property value="#bianmindianhua.id"/>)" class="pn-loperator">删除</a>
					</td>
				</tr>
				</s:iterator>
			</table>
			
			<table width='98%'  border='0'style="margin-top:8px;margin-left: 5px;">
			  <tr>
			    <td>
			      <input type="button" value="添加" style="width: 80px;" onclick="bianmindianhuaAdd()" />
			    </td>
			  </tr>
		    </table>
	</body>
</html>
