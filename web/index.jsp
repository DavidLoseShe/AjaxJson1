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
    <link  rel="stylesheet" type="text/css" href="css/Login.css"/>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="js/Login.js"></script>
    <title>AjaxJSON1</title>
  </head>
  <body>
  <div id="content">
  <table id="login_table">
    <tr>
         <td><input type="text" value="" name="admin.adminId" id="input" onblur="Login()" onkeydown="print()"></td>
         <td><p id="message"></p></td>
    </tr>
    <tr>
         <td><input type="password" value="" name="admin.adminPassword" id="pass"></td>
         <td><button  id="Login_button" onclick="Login_info()">点击登录</button></td>
    </tr>
  </table>
  <table>
    <tr><td id="login_states"></td></tr>
    <tr> <td id="username"></td></tr>
    <tr> <td id="age"></td></tr>
  </table>
  </div>

  <button type="button" class="btn btn-default btn-lg btn-block" id="button_table" onclick="queryActivityTable()">查询表格信息</button>
  <div id="table_Bootstrap">
   <div class="table-responsive">
     <table class="table">
       <caption id="table_f"></caption>
       <thead>
       <tr id="table_title">
         </tr>
       </thead>
       <tbody id="table_content">
       </tbody>
     </table>
   </div>
  </div>
  <div id="jsonDemo"></div>
  </body>
</html>
