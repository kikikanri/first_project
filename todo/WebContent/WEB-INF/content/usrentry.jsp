<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ユーザー登録</title>
</head>
<body>

<s:actionerror />
<s:actionmessage />

<s:form action="usrentryexec" >
<s:textfield label="ユーザーID" name="userid"  />
<s:password label="パスワード" name="password" />
<s:textfield label="ユーザー名" name="username" />
<s:submit value="登録" />
</s:form>

<a href="<s:url action="login"/>">ログイン</a><br />

</body>
</html>