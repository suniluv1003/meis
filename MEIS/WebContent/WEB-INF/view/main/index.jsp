<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script src="./js/jquery-1.11.0.min.js"></script>
<script language="javascript">
function doLogin()
{		
	var data = $("#frLogin").serialize();	
	$.ajax({
		url:'http://localhost:8080/MEIS/login/doLogin.mf',
		dataType:'json',
		type:'post',
		data: data,
		async:false,
		error:function(){
			alert('could found service');
		},
		success:function(data){
			alert(data.ajaxResult.success);
			if(data.ajaxResult.success == true)
			{				
				$(location).attr("href",'${rdir}');
			}else
			{				
				alert(data.res.err);
				
			}
		}
	});
}
</script>
<style type="text/css">
.bt1 {
	background-image: url('./img/idx_bt1.png');
}
.bt2 {
	background-image: url('./img/idx_bt2.png');
}
</style>

<title>Insert title here</title>
</head>
<body>
<form id="frLogin">
<table style="width:100%;margin-top:0;margin-bottom:0;margin-left:0;margin-right:0;"> 
	<tr>
		<td></td><td></td><td></td>		
	</tr>
	<tr>
		<td style="width:20%"></td>
		<td style="width:20%"><img src="./img/idx_top.png"/></td>
		<td></td>		
	</tr>
	<tr style="height:160px">
		<td style="width:20%"></td>
		<td style="width:20%"> 
			<table style="width:100%;margin-top:0;margin-bottom:0;margin-left:0;margin-right:0;">
			<tr> 
				<td style="width:50%;height:160px" class="bt1" valign="top"></td>		 	 
				<td style="width:50%;height:160px" class="bt2" valign="top">
  					<table width="100%;margin-top:0;margin-bottom:0;margin-left:0;margin-right:0;">
  					<tr style="height:30px"><td width="10%"></td><td></td><td></td><td></td><td></td></tr> 
  					<tr><td width="10%"></td><td width="25%">아이디</td>
  											 <td width="10%"><input type="text" name="userId" id="password" style="width:80px"/></td>
  											 <td rowspan="2">
  											 <a href="javascript:doLogin();"><img src="./img/btn_login.gif"/></a>
  											 </td>
  											 <td></td></tr>
  					<tr><td width="10%"></td><td width="25%">비밀번호</td>
  											 <td width="10%"><input type="password" name="password" id="password" style="width:80px"/></td>
  											 <td></td><td></td></tr>
  					<tr><td width="10%"></td><td></td><td></td><td></td><td></td></tr>  
  					</table>
				</td>  
			</tr>
			</table>  
		</td>
		<td></td>
	</tr> 
</table> 
</form>
</body>
</html>