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

<s:property value="username" />追加内容入力<br /><br />

<s:form action="entryexec" >
<table class="table">
<tr>
<td><input type="text" name="todoStr1" value="" id="entryexec_todoStr1"/></td>
<td><input type="text" name="todoStr2" value="" id="entryexec_todoStr2"/></td>
<td><input type="text" name="todoStr3" value="" id="entryexec_todoStr3"/></td>
<td><input type="text" name="todoStr4" value="" id="entryexec_todoStr4"/></td>
<td><input type="text" name="todoStr5" value="" id="entryexec_todoStr5"/></td>
</tr>
</table>
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
</tr>
<s:iterator value="DeviceList">
<tr>
  <td><s:property value="deviceid" /></td>
  <td><s:property value="devicenm" /></td>
  <td><s:property value="os" /></td>
  <td><s:property value="office" /></td>
</tr>
</s:iterator>
</table>
<s:submit value="Finish"/>
</s:form>

</body>
</html>