<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/bootstrap.min.css" rel="stylesheet">

<title>機器一覧</title>

<script type="text/javascript">
<!--

function check(){

	if(window.confirm('送信してよろしいですか？')){ // 確認ダイアログを表示

		return true; // 「OK」時は送信を実行

	}
	else{ // 「キャンセル」時の処理

		window.alert('キャンセルされました'); // 警告ダイアログを表示
		return false; // 送信を中止

	}

}

// -->
</script>

</head>
<body>

<h2><img src="img/logo.gif" />機器管理一覧</h2>
<br /><br />


<font color="red"><s:actionerror /></font>

<div class="container">
<table class="table">
<tr>
<td>端末NO</td>
<td>端末名称</td>
<td>OS名</td>
<td>OFFICEバージョン</td>
<td>備考</td>
<td></td>
</tr>
<tr>
<form action="entryexec" onSubmit="return check()">
<td><input type="text" name="deviceid" /></td>
<td><input type="text" name="devicenm" /></td>
<td><input type="text" name="os" /></td>
<td><input type="text" name="office" /></td>
<td><input type="text" name="other1" /></td>
<td><input type="submit" value="機器を追加します"/></td>
</form>

</tr>
</table>
</div>

<div class="container">
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
<form action="updateexec" onSubmit="return check()">
  <td><s:property value="deviceid" /></td>
  <input type="hidden" name="deviceid" value="<s:property value="deviceid" />">
  <td><input type="text" name="devicenm" value="<s:property value="devicenm" />"></td>
  <td><input type="text" name="os" value="<s:property value="os" />"></td>
  <td><input type="text" name="office" value="<s:property value="office" />"></td>
  <td><input type="text" name="other1" value="<s:property value="other1" />"></td>
  <td><input type="submit" value="変更する"/></td>
</form>
<form action="deleteexec" onSubmit="return check()">
  <input type="hidden" name="deviceid" value="<s:property value="deviceid" />">
  <td><input type="submit" value="削除する"/></td>
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