<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<div style="width:800px;margin:auto;">
		<fieldset>
			<legend>Register</legend>
			<form action="./user/register" method="POST">
				name: <input type="text" name="name"/>
				sex: <input type="text" name="sex"/>
				age: <input type="number" min="0" max="110" name="age"/>
				<input type="submit" value="register"/>
			</form>
		</fieldset>
	</div>
</body>
</html>