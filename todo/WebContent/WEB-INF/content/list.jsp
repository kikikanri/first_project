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
<tr>
<td><input type="text" name="deviceid" /></td>
<td><input type="text" name="devicenm" /></td>
<td><input type="text" name="os" /></td>
<td><input type="text" name="office" /></td>
<td><input type="text" name="other1" /></td>
</tr>
</table>

<s:submit value="機器を追加します"/>
</s:form>

<s:actionmessage  />

<table class="table">
<tr>
<td>端末NO</td>
<td>端末名称</td>
<td>OS名</td>
<td>OFFICEバージョン</td>
<td>備考</td>
<td></td>
<td></td>
</tr>
<s:iterator value="DeviceList">
<tr>
<s:form action="updateexec" >
  <td><input type="text" name="deviceid" value="<s:property value="deviceid" />"></td>
  <td><input type="text" name="devicenm" value="<s:property value="devicenm" />"></td>
  <td><input type="text" name="os" value="<s:property value="os" />"></td>
  <td><input type="text" name="office" value="<s:property value="office" />"></td>
  <td><input type="text" name="other1" value="<s:property value="other1" />"></td>
  <td><input type="submit" value="変更する"/></td>
</s:form>
<s:form action="deleteexec" >
  <td><input type="hidden" name="deviceid" value="<s:property value="deviceid" />"></td>
  <td><input type="submit" value="削除する"/></td>
</s:form>
</tr>
</s:iterator>
</table>

</body>
</html>