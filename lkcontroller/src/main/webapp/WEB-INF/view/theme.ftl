<html>

<head>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="/js/jquery-3.1.1.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta charset="UTF-8"/>
    <style>
        #tid {
            border: solid 1px;
            background-color: white;
          color: black;
        }
        a {
            text-decoration: none
        }


    </style>
    <script>
        $(function () {
            $("#b2").click(function () {
                var id=$("#id").val();
                var name=$("#name").val();
                var pwd=$("#pwd").val();
                var sex=$("input[name='classify']:checked").val();


                $.ajax({
                            url: "/update1",
                            type: "POST",
                            data: {
                                id:id,
                                name:name,
                                password:pwd,
                                sex:sex

                            },


                            success: function (ss) {
                              if(ss=="true"){alert("修改成功");
                                  window.location.reload();
                              }else{
                                  alert("修改失败");
                                  window.location.reload();
                              }


                            },
                        }
                );
            });


        })


    </script>
    <script>
        $("#myModal2").modal("hide");
        $("#myModal3").modal("hide");
        function getValues(obj1,obj2,obj3) {

            $("#id").val(obj1);
            $("#name").val(obj2);
            $("#pwd").val(obj3);
        }
        function getValue(obj) {
            $("#id2").val(obj);
        }

    </script>
    <script>
        $(function () {
             $("#b3").click(function () {

                 var id2=$("#id2").val();
                 $.ajax(
                     {
                         url:"/delUser",
                         type:"POST",
                         data:{
                         uid:id2
                          },
                         success:function (result) {
                             location.reload();
                         },
                     }
                 );


             });
        })


    </script>
    <script>
        $(function () {
          $("#b4").click(function () {
              var id=$("#id3").val();
              var name=$("#name3").val();
              var pwd=$("#pwd3").val();
              var sex=$("input[name='classify3']:checked").val();
             $.ajax(
                 {
                     url:"/addUser",
                     type:"Post",
                     data:{
                      id:id,
                      name:name,
                      password:pwd,
                      sex:sex


                     },
                      success:(function (data) {

                          location.reload();
                      }),
                     }


             );



          });



        })


    </script>

</head>
<body>
<h2 align="center">中国优秀大学生</h2>
<table id="tid" border="1px" align="center">
    <tr>
        <th width="400px">姓名</th>
        <th width="400px">性别</th>
        <th width="400px">操作</th>

    </tr>
<#list users as user>
    <tr>

        <th width="400px">
        ${user.name}
        </th>

        <#if  user.sex=1>
            <th width="400px">男</th>
        </#if>
        <#if  user.sex=0>
            <th width="400px">女</th>
        </#if>
        <th width="400px" id="tid1">

        <button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal2" onclick="getValues('${user.id}','${user.name}','${user.password}')">
                编辑
            </button>

            <button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal3" onclick="getValue(${user.id})">
                删除
            </button>
            <button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal4" >
                新增
            </button>

        </th>

    </tr>
</#list>

</table>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">

        <div class="modal-content">
            <div class="modal-header">

                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    编辑
                </h4>
            </div>
            <div class="modal-body">
                <table class="table table-hover">
                    <tr  hidden="hidden">
                        <td class="col-md-2" >编号：</td>
                        <td class="col-md-4"><input type="text" name="id" id="id" /></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name" id="name" value="" ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="price" id="pwd" value="" ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>性别：</td>
                        <td><input type="radio" name="classify"  value="1" checked="checked"  /> 男</td>
                        <td><input type="radio" name="classify"  value="0"  >女</td>
                        <td></td>

                    </tr>

                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" id="b2" name="submit" class="btn btn-primary">
                    提交更改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">

        <div class="modal-content">
            <div class="modal-header">

                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    操作提示
                </h4>
            </div>
            <div class="modal-body">
                <h5>确认要删除这条数据吧？</h5>
                <input type="text" id="id2" name="id2">


            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消
                </button>
                <button type="button" id="b3" name="submit" class="btn btn-primary">
                    确认
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal4" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">

        <div class="modal-content">
            <div class="modal-header">

                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    操作提示
                </h4>
            </div>
            <div class="modal-body">
                <table class="table table-hover">
                    <tr>
                        <td class="col-md-2" >编号：</td>
                        <td class="col-md-4"><input type="text" name="id3" id="id3" /></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name3" id="name3" value="" ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="password" name="price" id="pwd3" value="" ></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>性别：</td>
                        <td><input type="radio" name="classify3"  value="1" checked="checked"  /> 男</td>
                        <td><input type="radio" name="classify3"  value="0"  >女</td>
                        <td></td>

                    </tr>

                </table>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" id="b4" name="submit" class="btn btn-primary">
                    提交更改
                </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

</body>

</html>