<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>機器一覧</title>
</head>
<body>

<s:property value="username" />追加内容入力<br /><br />

<s:form action="entryexec" >
<s:textfield name="todoStr" label="ToDo" size="50"/>
<s:submit value="機器を追加します"/>
</s:form>
<s:actionmessage  />

<s:form action="finish" >
<s:iterator value="DeviceList">
  <s:property value="deviceid" />
  <s:property value="devicenm" />
  <s:property value="os" />
  <s:property value="office" />
  <br>
</s:iterator>
<s:submit value="Finish"/>
</s:form>

</body>
</html>