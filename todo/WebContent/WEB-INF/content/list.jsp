<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>機器一覧</title>
<style type="text/css">
.table {
width: 100%;
border-collapse: collapse;
}
.table th{
width: 25%;
padding: 6px;
text-align: left;
vertical-align: top;
color: #333;
background-color: #eee;
border: 1px solid #b9b9b9;
}
.table td{
padding: 6px;
background-color: #fff;
border: 1px solid #b9b9b9;
}
</style>
</head>
<body>

[アイコン]機器管理一覧<br /><br />

<s:form action="entryexec" >

<table class="table">
<tr>
<td>端末NO</td>
<td>端末名称</td>
<td>OS名</td>
<td>OFFICEバージョン</td>
<td>備考</td>
</tr>
</table>
<s:textfield name="deviceid" />
<s:textfield name="devicenm" />
<s:textfield name="os" />
<s:textfield name="office" />
<s:textfield name="other1" />

<s:submit value="機器を追加します"/>
</s:form>
<s:actionmessage  />

<s:form action="finish" >
<table class="table">
<tr>
<td>端末NO</td>
<td>端末名称</td>
<td>OS名</td>
<td>OFFICEバージョン</td>
<td>備考</td>
</tr>
<s:iterator value="DeviceList">
<tr>
  <td><s:property value="deviceid" /></td>
  <td><s:property value="devicenm" /></td>
  <td><s:property value="os" /></td>
  <td><s:property value="office" /></td>
  <td><s:property value="other1" /></td>
</tr>
</s:iterator>
</table>
<s:submit value="Finish"/>
</s:form>

</body>
</html>