<%--
  Created by IntelliJ IDEA.
  User: sjj
  Date: 2015/10/24 0024
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>单点</title>

  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="../smart-static/css/bootstrap.min.css">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-md-4 col-md-offset-4">
      <div class="login-panel panel panel-default">
        <div class="panel-heading">
          <h3 class="panel-title">Please Sign In</h3>
        </div>
        <div class="panel-body">
           <form:form action="/login" method="post"  role="form">
          <div class="form-group">
          <label for="username"> 用户名:</label>
        <input type="text" class="form-control" id="username" name="username" placeholder="Enter FirstName:abc"/>
         <input type="hidden" name="backUrl" value="${backUrl}" >
         </div>
         <div class="form-group">
         <label for="password">密码:</label>
         <input type="text" class="form-control" id="password" name="password" placeholder="Enter Password:123"/>
        </div>
         <div class="checkbox">
           <label>
              <input name="remember" type="checkbox" value="Remember Me">Remember Me
          </label>
       </div>
           <div class="form-group">
          <button type="submit"  class="btn btn-lg btn-success btn-block">登录</button>
        </div>
         </form:form>
        </div>
      </div>
    </div>
 </div>
</div>


<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="../smart-static/js/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../smart-static/js/bootstrap.min.js"></script>
</body>
</html>
