$("[type=button]").click(function(){
	var loginCode = $("#loginCode").val();
	var password = $("#password").val();
	if(loginCode.trim() == '' || loginCode.length == 0){
		$("#loginCode").focus();
		$("#msg").css("color","red");
		$("#msg").html("账号不能为空");
		return
	}
	if(password.trim() == '' || password.length == 0){
		$("#password").focus();
		$("#msg").css("color","red");
		$("#msg").html("密码不能为空");
		return
	}
	var user = {
			loginCode : loginCode,
			password : password
	}
	$.ajax({
		url  : 'login.html',
		type : 'post',
		data : {"userStr" : JSON.stringify(user)},
		dataType : "text",
		success	 :	function(result){
			if(result == 'nodata'){
				$("#msg").html("没有数据，请重试");
			}else if(result == 'notFindUser'){
				$("#msg").html('账号或密码错误');
			}else if(result == 'error'){
				$("#msg").html('未知错误');
			}else if(result == 'success'){
				window.location.href='main.html';
			}else{
				$("#msg").html('未知异常');
			}
		}
	})
})