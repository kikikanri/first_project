<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<link rel="stylesheet" href="/resources/demos/style.css" />

<title>貸出し機器管理画面</title>

<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1/i18n/jquery.ui.datepicker-ja.min.js"></script>
<script>
$(function() {
  $.datepicker.setDefaults( $.datepicker.regional[ "ja" ] );
  $( "#datepicker1" ).datepicker();
  $( "#datepicker2" ).datepicker();
});
</script>

<script src="js/bootstrap.min.js"></script>

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
<td><input type="date" id="datepicker1" name="takeoutdate" /></td>
<td><input type="date" id="datepicker2" name="schedulereturndate" /></td>
<td>

<select name="deviceid" id="deviceid">
	<c:forEach var="dev" items="${DeviceList}">
	<option value="${dev.deviceid}" >${dev.deviceid}(${dev.devicenm})</option>
	</c:forEach>
</select>

</td>
<td><input type="submit" value="これから借ります"/></td>
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
<td>返却予定日▼</td>
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
  <td><s:date name="takeoutdate" format="yyyy/MM/dd" /></td>
  <td><s:date name="schedulereturndate" format="yyyy/MM/dd" /></td>
  <td><s:property value="deviceid" /></td>
  <td><s:property value="devicenm" /></td>
  <td><input type="date" name="returndate" value="<s:date name="returndate" format="yyyy/MM/dd" />"></td>
  <td><input type="submit" value="返却日を登録する"/></td>
</form>
<form action="rdeleteexec" onSubmit="return check()">
  <input type="hidden" name="no" value="<s:property value="no" />">
  <td><input type="submit" value="削除する"/></td>
</form>
</tr>
</s:iterator>
</table>
</div>




</body>
</html>