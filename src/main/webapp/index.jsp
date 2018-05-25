<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
<title>添加用户</title>  
</head>  
<body>  
    <h1>添加用户</h1>  
    <form action="user/save" method="post"  >  
        	昵称<input type="text" name="nickname" />
        	<br/> 
        	密码 <input type="text" name="pwd" />
        	<br/> 
        	性别<input type="text" name="gender" />
        	<br/> 
        	金额<input type="text" name="wallet" />
        	<br/> 
        	<input type="submit" value="添加">  
    </form>
  
</body>  
</html>  