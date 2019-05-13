
$("#dl").click(function(){
    layui.use('layer', function(){
        var layer = layui.layer;

        layer.open({
            type:1,
            shade: [0.8, '#393D49'],
            area: '500px',
            skin: 'demo-class',
            move: false,
            title:'登陆',
            anim: 6,
            content: $('#box'),
            end:function(){
                $("#box").hide();
            }

        });


    });
    $("#log").click(function(){

        var name = $('input[name="username"]').val();
        if(name==""){
            layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>名字不能为空');
            return false;
        }

        var name = $("#lname").val();
        var pwd = $("#lpwd").val();
        $.ajax({
            url:"user/login",
            type:"post",
            data:{"userLoginName":name,"userLoginPwd":pwd},
            dataType:"json",
            success:function(data){
                if(data==1){
                    $("#dl").css("display","none");
                    $("#uname").css("display","block");
                    /* $("#cancel").css("display","block"); */
                    //处理名字的加载
                    layer.msg('<i class="layui-icon layui-icon-face-smile" style="font-size: 30px; color: #00FFFF"></i>登录成功');
                    layer.closeAll('page');
                    // location.href="Q_show.jsp";
                    window.parent.location.replace(location.href);
                }else{
                    $("#dl").css("display","block");
                    $("#uname").css("display","none");
                    $("#lpwd").val("");
                    layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>登录失败或账号未激活');
                }
            }
        });

    });
});

$("#reg").click(function(){
    layui.use('layer', function(){
        var layer = layui.layer;
        layer.open({
            type:1,
            shade: false,
            area: '500px',
            maxmin: true,
            title:'注册',
            content: $('#register'),
            cancel: function(index, layero){
                if(confirm('确定要关闭么')){ //只有当点击confirm框的确定时，该层才会关闭
                    $("#cuname").val("");
                    $("#cphone").val("");
                    $("#cemail").val("");
                    $("#cpwd").val("");
                    layer.close(index);
                }
                return false;
            },end:function(){
                $("#register").hide();
            }
        });


    });
    var timestamp=new Date().getTime();
    $("#cuname").val(timestamp);
    $("#regs").click(function(){
        var reg = /^1[3|4|5|7|8][0-9]{9}$/;
        var phone = $('input[id="cphone"]').val();
        if(phone==""){
            layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>手机号不能为空');
            return false;
        }
        if(reg.test(phone)){

        }else{
            layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>手机号格式不正确');
            $('input[id="cphone"]').val("");
            return false;
        }
        var em = /^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$/;
        var email = $("#cemail").val();
        if(em.test(email)){

        }else{
            layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>邮箱格式错误');
            return false;
        }
        if(email==""){
            layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>邮箱不能为空');
            return false;
        }
        var pwd = $("#cpwd").val();
        var qpwd = $("#zpwd").val();
        if(pwd!=qpwd){
            layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>两次密码不一致');
            return false;
        }
        //1 首先将需要的数据拼接成json对象
        var json={"userTel":$("#cphone").val(),"userEmail":$("#cemail").val(),"userLoginName":$("#cuname").val(),"userLoginPwd":$("#cpwd").val()};
        $.post("user/save",json,function(data){
            if(data==1){
                layer.msg('<i class="layui-icon layui-icon-face-smile" style="font-size: 30px; color: #00FFFF"></i>注册成功');
                layer.closeAll('page');
                window.parent.location.replace(location.href);

            }else{

                layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>注册失败');
            }
        },"json");

    });
});
$("#wjma").click(function(){
    layui.use('layer', function(){
        var layer = layui.layer;

        layer.open({
            type:1,
            shade: false,
            area: '500px',
            maxmin: true,
            title:'忘记密码',
            content: $('#wj'),
            anim: 2,
            end:function(){
                $("#wj").hide();
            }

        });

        $("#qrx").click(function(){
            var pwd = $("#cpwd").val();
            var qpwd = $("#zpwd").val();
            if(pwd!=qpwd){
                layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>两次密码不一致');
                return false;
            }
            var json = {"phone":$("#cphone").val(),"cpwd":$("#cpwd").val()};
            $.post("login_upda",json,function(data){
                if(data==1){
                    layer.msg('<i class="layui-icon layui-icon-face-smile" style="font-size: 30px; color: #00FFFF"></i>修改成功');
                    layer.closeAll('page');
                    // window.parent.location.replace(location.href);
                }else{

                    layer.msg('<i class="layui-icon layui-icon-face-cry" style="font-size: 30px; color: red"></i>手机号不正确修改失败');
                }
            },"text");
        })
    });
});
