<%--
  Created by IntelliJ IDEA.
  User: d
  Date: 2017/6/30
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <script type="text/javascript" src="jquery-3.2.1.js"></script>
    <script>
        function Login() {
            var id =$("#input").serialize();
            //$.param(id);//设置list 蛇皮date格式
            $.ajax({
                url: "LoginCheck.action",
                type: "POST",
                data: id,
                dataType: "json",
                success: function (data) {
                    if (data.checkResult){
                        $("#message").html(" <p style='color: green'>该用户名存在</p>");
                    }
                    else  $("#message").html(" <p style='color: red '>该用户名不存在</p>");
                }
            });
        }
        function print(){
            $("#message").html(" <p ></p>");
            $("#login_states").html(" ");
            $("#username").html("");
            $("#age").html("");
        }
        function Login_info() {
            $.ajax({
                url: "LoginInfo.action",
                type: "POST",
                data: {'admin.adminId':$('#input').val(),'admin.adminPassword':$('#pass').val()},
                dataType: "json",
                success: function (data) {
                    if(data.admin!=null) {

                        $("#login_states").html("Login Success 登录成功 ");
                        $("#username").html("登录名： "+data.admin.adminId);
                        $("#age").html("登录人年龄： "+data.admin.adminAge);
                    }
                    else {
                        $("#login_states").html("Login Fail 登录失败 ");
                        $("#username").html("");
                        $("#age").html("");
                    }
                }
            });
        }
    </script>
    <style type="text/css">
      #content{
        float: left;
        position:relative;
        left: 500px;
        }
    </style>
    <title>AjaxJSON1</title>

  </head>
  <body>
  <div id="content">
  <table id="login_table">
    <tr><td><input type="text" value="" name="admin.adminId" id="input" onblur="Login()" onkeydown="print()"></td>
         <td><p id="message"></p></td>
    </tr>
    <tr><td><input type="password" value="" name="admin.adminPassword" id="pass"></td>
      <td><button  id="Login_button" onclick="Login_info()">点击登录</button></td>
    </tr>

  </table>
  <table>
    <tr><td id="login_states"></td></tr>
    <tr> <td id="username"></td></tr>
    <tr> <td id="age"></td></tr>
  </table>
  </div>
  </body>
</html>
