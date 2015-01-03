<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TodoList</title>
</head>
<body>

<s:property value="username" />さんのToDo管理<br /><br />

<s:form action="entryexec" >
<s:textfield name="todoStr" label="ToDo" size="50"/>
<s:submit value="Add TODO"/>
</s:form>
<s:actionmessage  />

<s:form action="finish" >
<s:iterator value="TodoList">
  <s:checkboxlist list="top" listKey="ID" name="todoid" listValue="todo" theme="simple" /><br>
</s:iterator>
<s:submit value="Finish"/>
</s:form>

</body>
</html>