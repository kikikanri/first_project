<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン</title>
</head>
<body>

<s:actionerror />
<s:form action="login" >
<s:textfield label="ユーザーID" name="userid"  />
<s:password label="パスワード" name="password" />
<s:submit value="ログイン" />
</s:form>

<a href="<s:url action="usrentryexec" />">新規ユーザー</a><br />

</body>
</html>