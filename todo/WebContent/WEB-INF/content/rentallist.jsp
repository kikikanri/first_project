<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">

<title>貸出し機器管理画面</title>

<script type="text/javascript">
<!--
function check(){

	if(window.confirm('処理を実行しますがよろしいですか？')){
		return true;
	}else{
		return false;
	}
}
// -->
</script>

</head>
<body>

<h2><img src="img/logo.gif" />貸出し機器管理画面</h2>
<br /><br />

<font color="red"><s:actionerror /></font>

<div class="container">
<table class="table">
<tr>
<td>利用者</td>
<td>持ち出し日</td>
<td>返却予定日</td>
<td>端末</td>
<td></td>
</tr>
<tr>
<form action="rentryexec" onSubmit="return check()">
<td><input type="text" name="user" /></td>
<td><input type="date" name="takeoutdate" /></td>
<td><input type="date" name="schedulereturndate" /></td>
<td>

<select name="deviceid" id="deviceid">
	<c:forEach var="dev" items="${DeviceList}">
	<option value="${dev.deviceid}" >${dev.deviceid}(${dev.devicenm})</option>
	</c:forEach>
</select>

</td>
<td><input type="submit" value="これから借ります！(未実装)"/></td>
</form>

</tr>
</table>

</div>

<div class="container">
<table class="table">
<tr>
<td>NO</td>
<td>利用者</td>
<td>持ち出し日</td>
<td>返却予定日</td>
<td>端末ID</td>
<td>端末名</td>
<td>返却日</td>
<td></td>
</tr>
<s:iterator value="ResourceList" status="st">
<tr>
<form action="rupdateexec" onSubmit="return check()">
  <td><s:property value="no" /></td>
  <input type="hidden" name="no" value="<s:property value="no" />">
  <td><s:property value="user" /></td>
  <td><s:property value="takeoutdate" /></td>
  <td><s:property value="schedulereturndate" /></td>
  <td><s:property value="deviceid" /></td>
  <td><s:property value="devicenm" /></td>
  <td><input type="date" name="returndate" value="<s:property value="returndate" />"></td>
  <td><input type="submit" value="返却日を登録する(未実装)"/></td>
</form>
<form action="rdeleteexec" onSubmit="return check()">
  <input type="hidden" name="no" value="<s:property value="no" />">
  <td><input type="submit" value="削除する(未実装)"/></td>
</form>
</tr>
</s:iterator>
</table>
</div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>


</body>
</html>