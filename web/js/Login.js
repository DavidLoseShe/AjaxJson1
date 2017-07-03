/**
 * Created by d on 2017/7/2.
 */
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
    alert("oo");
    $.ajax({
        url: "LoginInfo.action",
        type: "POST",
        data: {'admin.adminId':$('#input').val(),'admin.adminPassword':$('#pass').val()},
        dataType: "json",
        success: function (data) {
            $("#jsonDemo").html("ppppppppp");
            if(data.admin!=null) {
                $("#login_states").html("Login Success 登录成 ");
                $("#username").html("登录名： "+data.admin.adminId);
                $("#age").html("登录人年龄： "+data.admin.adminAge);
            }
            else {
                $("#login_states").html("Login Fail 登录失 ");
                $("#username").html("");
                $("#age").html("");
            }
        }
    });
}
function queryActivityTable() {
    $("#table_title").html("");
    $("#table_f").html("");
    $("#table_content").html("");
    $.getJSON("LoginActivityTable.action", function (data) {

            $("#table_title").html("<th>acivityId</th>"
                +"<th>acitvityName</th>"
                +"<th>activityFirstDate</th>"
                +"<th>activityAddress</th>");
        $("#table_f").html("表单信息");
        $.each(data.activityList,function(i,value){

                $("#table_content").append("<tr>"
                    +"<td>"+value.activityId+"</td>"
                    +"<td>"+value.activityName+"</td>"
                    +"<td>"+value.activityFristDate+"</td>"
                    + "<td>"+value.activityAddress+"</td></tr>");
            });
});
}