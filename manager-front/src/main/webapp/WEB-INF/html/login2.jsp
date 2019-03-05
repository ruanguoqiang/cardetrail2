<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/16
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="../smart-static/css/bootstrap.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="../smart-static/metisMenu/metisMenu.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../smart-static/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="../smart-static/chart/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="../smart-static/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div class="cd-signin-modal js-signin-modal"> <!-- this is the entire modal form, including the background -->
    <div class="cd-signin-modal__container"> <!-- this is the container wrapper -->
        <ul class="cd-signin-modal__switcher js-signin-modal-switcher js-signin-modal-trigger">
            <li><a href="#0" data-signin="login" data-type="login">登 陆</a></li>
            <li><a href="#0" data-signin="signup" data-type="signup">注 册</a></li>
        </ul>

        <div class="cd-signin-modal__block js-signin-modal-block" data-type="login"> <!-- log in form -->
            <form class="cd-signin-modal__form" th:action="@{/login}" method="post">
                <p class="cd-signin-modal__fieldset">
                    <label class="cd-signin-modal__label cd-signin-modal__label--username cd-signin-modal__label--image-replace" for="signup-username">用户名</label>
                    <input name="username" class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border" id="signin-username" type="text" placeholder="用户名">
                </p>

                <p class="cd-signin-modal__fieldset">
                    <label class="cd-signin-modal__label cd-signin-modal__label--password cd-signin-modal__label--image-replace" for="signin-password">密码</label>
                    <input name="password"  class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border" id="signin-password" type="text" placeholder="密码">
                    <a href="#0" class="cd-signin-modal__hide-password js-hide-password">Hide</a>
                    <span class="cd-signin-modal__error">Error message here!</span>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <input name="captcha"  class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border"
                           style="width: 50%"   id="signin-capture" type="text" >

                    <a class="cd-signin-modal__hide-password" style="border-left: none" onclick="refreshCaptcha()">
                        <img  th:src="@{/kaptcha.jpg}" title="点击切换" id="kaptcha-img"/></a>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <input type="checkbox" id="remember-me" name="rememberMe"  class="cd-signin-modal__input ">
                    <label for="remember-me">Remember me</label>     <span style="display: inline-block; padding: 0 2em; background-color: #da5067;border-radius: 50em;font-size: 14px; color: #fff;" th:if="${msg}" th:utext="${msg}"></span>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <input class="cd-signin-modal__input cd-signin-modal__input--full-width" type="submit"  value="登录">
                </p>
            </form>
            <p class="cd-signin-modal__bottom-message js-signin-modal-trigger"><a href="#0" data-signin="reset">Forgot your password?</a></p>
        </div>

        <div class="cd-signin-modal__block js-signin-modal-block" data-type="signup"> <!-- sign up form -->
            <form class="cd-signin-modal__form" th:action="@{/signin}" method="post">
                <p class="cd-signin-modal__fieldset">
                    <label class="cd-signin-modal__label cd-signin-modal__label--username cd-signin-modal__label--image-replace" for="signup-username">用户名</label>
                    <input name="username" class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border" id="signup-username" type="text" placeholder="用户名">
                    <span class="cd-signin-modal__error">Error message here!</span>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <label class="cd-signin-modal__label cd-signin-modal__label--email cd-signin-modal__label--image-replace" for="signup-email">邮箱</label>
                    <input name="email" class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border" id="signup-email" type="email" placeholder="E-mail">
                    <span class="cd-signin-modal__error">Error message here!</span>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <label class="cd-signin-modal__label cd-signin-modal__label--password cd-signin-modal__label--image-replace" for="signup-password">密码</label>
                    <input  name="password" class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border" id="signup-password" type="text"  placeholder="密码">
                    <a href="#0" class="cd-signin-modal__hide-password js-hide-password">Hide</a>
                    <span class="cd-signin-modal__error">Error message here!</span>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <input type="checkbox" id="accept-terms" class="cd-signin-modal__input ">
                    <label for="accept-terms">我同意 <a href="#0">协议</a></label>
                </p>

                <!--  <p class="cd-signin-modal__fieldset">
                      <input class="cd-signin-modal__input cd-signin-modal__input&#45;&#45;full-width cd-signin-modal__input&#45;&#45;has-padding" type="button" id="signout" value="Create account">
                  </p>-->

                <p class="cd-signin-modal__fieldset">
                    <input class="cd-signin-modal__input cd-signin-modal__input--full-width" id="signout" type="submit"  value="注册">
                </p>
            </form>
        </div> <!-- cd-signin-modal__block -->

        <div class="cd-signin-modal__block js-signin-modal-block" data-type="reset"> <!-- reset password form -->
            <p class="cd-signin-modal__message">忘记了密码？请找管理员黑仔。。</p>
            <form class="cd-signin-modal__form">
                <p class="cd-signin-modal__fieldset">
                    <label class="cd-signin-modal__label cd-signin-modal__label--email cd-signin-modal__label--image-replace" for="reset-email">邮箱</label>
                    <input class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding cd-signin-modal__input--has-border" id="reset-email" type="email" placeholder="E-mail">
                    <span class="cd-signin-modal__error">Error message here!</span>
                </p>

                <p class="cd-signin-modal__fieldset">
                    <input class="cd-signin-modal__input cd-signin-modal__input--full-width cd-signin-modal__input--has-padding" type="submit" value="Reset password">
                </p>
            </form>
            <p class="cd-signin-modal__bottom-message js-signin-modal-trigger" style="bottom:-30px "><a href="#0" data-signin="login">Back to log-in</a></p>
        </div> <!-- cd-signin-modal__block -->
        <a href="#0" class="cd-signin-modal__close js-close">Close</a>
    </div> <!-- cd-signin-modal__container -->
</div> <!-- cd-signin-modal -->

<!-- jQuery -->
<script src="../smart-static/js/jquery/1.9.1/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../smart-staticjs/bootstrap.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="../smart-static/metisMenu/metisMenu.js"></script>

<!-- Morris Charts JavaScript -->
<script src="../smart-static/chart/raphael/raphael.min.js"></script>
<script src="../smart-static/chart/morrisjs/morris.min.js"></script>
<script src="../smart-static/chart/morrisjsmorris-data.js"></script>

<!-- Custom Theme JavaScript -->
<script src="../smart-static/js/sb-admin-2.js"></script>

</body>

</html>


