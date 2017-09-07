<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="jscode/WdatePicker.js" type="text/javascript"></script>
<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">

<title>我要预约</title>
</head>
<body>

<form action="add.html" method="post">
<br><br><br><br>
<table width="300" height="300" style="border: solid; border-color: hsla(135,59%,81%,1.00)" align="center">
    <tr style="background-color: hsla(135,59%,81%,1.00)">
      <td style="height:30px;" align="left" valign="top">微&nbsp;&nbsp;信：</td>
      <td ><input  style="width:100%; height:100%;"  type="text" name="wechat" align="left" value="test01" readonly/></td>
    </tr>
    <tr><td colspan="2"><hr/></td></tr>
    <tr style="background-color: hsla(135,59%,81%,1.00)">
      <td style="height:30px;" align="left" valign="top">您的姓名：</td>
      <td><input  style="width:100%; height:100%;" type="text" name="username" id="username" align="left"/></td>
    </tr>
    <tr style="background-color: hsla(135,59%,81%,1.00)">
      <td style="height:30px;" align="left" valign="top">联系方式：</td>
      <td><input  style="width:100%; height:100%;" type="text" name="mobile" id="mobile" align="left" placeholder="请填写手机号码"/></td>
    </tr>
    <tr style="background-color: hsla(135,59%,81%,1.00)">
      <td style="height:30px;" align="left" valign="top">预订日期：</td>
      <td><input id="d422" style="width:100%; height:100%;" class="Wdate" name="startdate" type="text" onclick="WdatePicker({minDate:'%y-%M-{%d+1}'})" placeholder="预订开始日期"/></td>
    </tr>
    <tr style="background-color: hsla(135,59%,81%,1.00)">
      <td style="height:30px;"></td>
      <td><input id="d4312" style="width:100%; height:100%;" class="Wdate" name="enddate" type="text" onclick="WdatePicker({minDate:'#F{$dp.$D(\'d422\')}',maxDate:''})" placeholder="预订结束日期"/></td>
    </tr>
    <tr >
    <td style="height:30px; background-color: hsla(135,59%,81%,1.00)" align="left" valign="top"  >是否过夜:</td>
    <td style="height:30px;background-color: hsla(160,62%,85%,1.00)">
    	<input width="20" type="radio" name="orderroom" value="1" checked>是
		<input type="radio" name="orderroom" value="2">否
    </td></tr>
    <tr>
    <td style="height:30px;background-color: hsla(135,59%,81%,1.00)"  align="left" valign="top"  >是否就餐:</td>
    <td style="height:30px;background-color:  hsla(160,62%,85%,1.00)" >
    	<input width="20" type="radio" name="repast" value="1" checked>是
		<input type="radio" name="repast" value="2">否
    </td></tr>
    <tr><td colspan="2"><hr/></td></tr>
    <tr style="background-color: hsla(135,59%,81%,1.00)">
      <td style="height:70px;" align="left" valign="top">备&nbsp;&nbsp;注：</td>
      <td><textarea style="width:100%; height:100%;" maxlength="100" rows="5" cols="21" name="remarks" id="remarks"></textarea></td>
    </tr>   
</table>
<br>
<center><input  type="submit" value="提&nbsp;交" style="background-color: hsla(135,59%,81%,1.00)" onclick="frominto()"></center>

</form>
<script src="jscode/intojs.js" type="text/javascript"></script>
</body>
</html>