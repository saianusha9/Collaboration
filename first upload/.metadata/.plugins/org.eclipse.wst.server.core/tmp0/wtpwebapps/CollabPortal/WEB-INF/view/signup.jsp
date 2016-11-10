<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Signup</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Majestic Login Form Widget Responsive, Login form web template,Flat Pricing tables,Flat Drop downs  Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href='//fonts.googleapis.com/css?family=Muli:400,300,300italic,400italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Comfortaa:400,300,700' rel='stylesheet' type='text/css'>
<link href="<c:url value='resources/css/animate-custom.css'/>" rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='resources/css/style.css'/>" rel="stylesheet" type="text/css" media="all" />
</head>
<body>	
<h1 class="w3ls"></h1>			
<div id="container_demo" >
    <a class="hiddenanchor" id="toregister"></a>
    <a class="hiddenanchor" id="tologin"></a>
    <div id="wrapper">
        <div id="login" class="animate form">
			<form  action="#" method="post" autocomplete="on"> 
                <h2>Signup</h2> 
                <p> 
					<label for="username" class="uname" ><span><i>Username</i></span></label>
                    <input id="username" name="username" required="required" type="text" placeholder="Username"/>
                </p>
				<p> 
					<label for="username" class="uname" ><span><i>Email</i></span></label>
                    <input id="username" name="username" required="required" type="text" placeholder="Email"/>
                </p>
                <p> 
                    <label for="password" class="youpasswd"><span><i>Your password</i></span></label>
                    <input id="password" name="password" required="required" type="password" placeholder="Password" /> 
                </p>
				<p> 
					<label for="username" class="uname" ><span><i>DOB</i></span></label>
                    <input id="username" name="username" required="required" type="text" placeholder="Date of birth"/>
                </p>
				<p> 
					<label for="username" class="uname" ><span><i>Skills</i></span></label>
                    <input id="username" name="username" required="required" type="text" placeholder="Skills"/>
                </p>
                <p class="keeplogin"> 
					<input type="checkbox" id="brand" value="">
					<label for="brand"><span></span> Remember me?</label>
				</p>
                <p class="login button"> 
                    <input type="submit" value="Login" /> 
				</p>
            </form>
        </div>
	</div>
</div>  
</body>
</html>
