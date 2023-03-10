<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
    <!-- Add the Bootstrap CSS file -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <style >
     body {
            background-color: #87C0B6;
        }
        .login-container {
            max-width: 500px;
            margin: auto;
            margin-top: 100px;
            background-color: #fff;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.1);
        }
        .login-header {
            text-align: center;
            margin-bottom: 40px;
        }
        .login-header h1 {
            color: #555;
            font-size: 36px;
            font-weight: 400;
            margin-bottom: 10px;
        }
        .login-header p {
            font-size: 16px;
            color: #999;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-control {
            border-radius: 30px;
            padding: 20px;
            font-size: 16px;
            color: #555;
            background-color: #f5f5f5;
            border: none;
            box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, 0.1);
        }
        .form-control:focus {
            box-shadow: none;
        } .btn-login {
            background-color: #00b894;
            border-color: #00b894;
            color: #fff;
            padding: 15px 30px;
            font-size: 16px;
            font-weight: bold;
            border-radius: 30px;
            width: 100%;
            max-width: 200px;
            display: block;
            margin: auto;
        }
        .btn-login:hover {
            background-color: #00a885;
            border-color: #00a885;
            color: #fff;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <div class="login-header">
            <h1>Login</h1>
            <p>Please enter your credentials to login</p>
        </div>
        <form method="post" action="LoginServlet">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Username" name="username" required>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="Password" name="password" required>
            </div>
            <button class="btn btn-lg btn-login" type="submit">Login</button>
        </form>
    </div>
    <!-- Add the Bootstrap JS file -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>