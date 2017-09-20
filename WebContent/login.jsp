<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Title</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="bs/js/bootstrap.js"></script>
<link rel="stylesheet" href="bs/css/bootstrap.css" />
<style>
#el_login {
	height: 330px;
	width: 500px;
	margin: 0 auto;
	margin-top: 30px;
	padding-top: 30px;
	border: 1px solid #eee;
	box-shadow: 2px 2px 2px #eee, -2px -2px 2px #eee;
}

.loB {
	display: block;
	width: 80%;
	height: 60px;
	margin: 20px auto;
}
</style>
</head>

<body>
	<h1>请登录系统</h1>
	<div id="el_login">
		<form action="<%=path %>/loginServlet">
			<div class="loB">
				用户名：<input type="text" class="form-control" name="username">
			</div>
			<div class="loB">
				密&nbsp;&nbsp;码：<input type="password" class="form-control"
					name="password" />
			</div>
			<div class="loB">
				<input type="submit" class="btn btn-success" value="登录" />
			</div>
		</form>
	</div>
</body>
</html>