<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>会员商城登录页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Charisma, a fully featured, responsive, HTML5, Bootstrap admin template.">
<meta name="author" content="Muhammad Usman">

<!-- The styles -->
<link id="bs-css" href="<%=request.getContextPath()%>/statics/css/bootstrap-cerulean.css" rel="stylesheet">
<script type="text/javascript">
    var path = '<%=request.getContextPath()%>'
</script>
<style type="text/css">
body {
	padding-bottom: 40px;
}

.sidebar-nav {
	padding: 9px 0;
}
</style>
<link href="<%=request.getContextPath()%>/statics/css/bootstrap-responsive.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/statics/css/charisma-app.css" rel="stylesheet">
<link href="<%=request.getContextPath()%>/statics/css/jquery-ui-1.8.21.custom.css" rel="stylesheet">
<link href='<%=request.getContextPath()%>/statics/css/fullcalendar.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/fullcalendar.print.css' rel='stylesheet' media='print'>
<link href='<%=request.getContextPath()%>/statics/css/chosen.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/uniform.default.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/colorbox.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/jquery.cleditor.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/jquery.noty.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/noty_theme_default.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/elfinder.min.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/elfinder.theme.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/jquery.iphone.toggle.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/opa-icons.css' rel='stylesheet'>
<link href='<%=request.getContextPath()%>/statics/css/uploadify.css' rel='stylesheet'>

<!-- The HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

<!-- The fav icon -->
<link rel="shortcut icon" href="<%=request.getContextPath()%>/statics/img/favicon.ico">

</head>

<body>
	<div class="container-fluid" id="app">
		<div class="row-fluid">

			<div class="row-fluid">
				<div class="span12 center login-header">
					<h2>欢迎来到SLSaleSystem</h2>
				</div>
				<!--/span-->
			</div>
			<!--/row-->

			<div class="row-fluid">
				<div class="well span5 center login-box">
					<div class="alert alert-info">请输入你的账号与密码</div>
					<div class="form-horizontal">
						<fieldset>
							<div class="input-prepend" title="账号" data-rel="tooltip">
								<span class="add-on"><i class="icon-user"></i></span>
								<input autofocus class="input-large span10" name="loginCode" id="loginCode" type="text" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="密码" data-rel="tooltip">
								<span class="add-on"><i class="icon-lock"></i></span>
								<input class="input-large span10" name="password" id="password" type="password" />
							</div>
							<div class="clearfix"></div>
							<p id="msg">*账号密码不能为空</p>
							<div class="clearfix"></div>

							<p class="center span5">
								<button type="button" class="btn btn-primary">登录</button>
							</p>
						</fieldset>
					</div>
				</div>
				<!--/span-->
			</div>
			<!--/row-->
		</div>
		<!--/fluid-row-->

	</div>
	<!--/.fluid-container-->

	<!-- jQuery -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-transition.js"></script>
	<!-- alert enhancer library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-alert.js"></script>
	<!-- modal / dialog library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-modal.js"></script>
	<!-- custom dropdown library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-dropdown.js"></script>
	<!-- scrolspy library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-scrollspy.js"></script>
	<!-- library for creating tabs -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-tab.js"></script>
	<!-- library for advanced tooltip -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-tooltip.js"></script>
	<!-- popover effect library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-popover.js"></script>
	<!-- button enhancer library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-button.js"></script>
	<!-- accordion library (optional, not used in demo) -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-collapse.js"></script>
	<!-- carousel slideshow library (optional, not used in demo) -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-carousel.js"></script>
	<!-- autocomplete library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-typeahead.js"></script>
	<!-- tour library -->
	<script src="<%=request.getContextPath()%>/statics/js/bootstrap-tour.js"></script>
	<!-- library for cookie management -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.cookie.js"></script>
	<!-- calander plugin -->
	<script src='<%=request.getContextPath()%>/statics/js/fullcalendar.min.js'></script>
	<!-- data table plugin -->
	<script src='<%=request.getContextPath()%>/statics/js/jquery.dataTables.min.js'></script>

	<!-- chart libraries start -->
	<script src="<%=request.getContextPath()%>/statics/js/excanvas.js"></script>
	<script src="<%=request.getContextPath()%>/statics/js/jquery.flot.min.js"></script>
	<script src="<%=request.getContextPath()%>/statics/js/jquery.flot.pie.min.js"></script>
	<script src="<%=request.getContextPath()%>/statics/js/jquery.flot.stack.js"></script>
	<script src="<%=request.getContextPath()%>/statics/js/jquery.flot.resize.min.js"></script>
	<!-- chart libraries end -->

	<!-- select or dropdown enhancer -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.chosen.min.js"></script>
	<!-- checkbox, radio, and file input styler -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.uniform.min.js"></script>
	<!-- plugin for gallery image view -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.colorbox.min.js"></script>
	<!-- rich text editor library -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.cleditor.min.js"></script>
	<!-- notification plugin -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.noty.js"></script>
	<!-- file manager library -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.elfinder.min.js"></script>
	<!-- star rating plugin -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.raty.min.js"></script>
	<!-- for iOS style toggle switch -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.iphone.toggle.js"></script>
	<!-- autogrowing textarea plugin -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.autogrow-textarea.js"></script>
	<!-- multiple file upload plugin -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.uploadify-3.1.min.js"></script>
	<!-- history.js for cross-browser state change on ajax -->
	<script src="<%=request.getContextPath()%>/statics/js/jquery.history.js"></script>
	<!-- application script for Charisma demo -->
	<script src="<%=request.getContextPath()%>/statics/js/charisma.js"></script>

	<!-- local js -->
	<script src="<%=request.getContextPath()%>/statics/localjs/login.js"></script>
</body>
</html>
