<html>
<head>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="/js/jquery-3.1.1.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <meta/>
    <style>
        a {
            text-decoration: none;
        }
    </style>
    <script>
        $(function () {
            $("#b1").click(function () {
                $.ajax({
                            url: "/getPage",
                            type: "POST",
                            data: "name=lisan",
                            success: function (ss) {
                                alert(ss);
                            },
                        }
                );
            });
        })
    </script>
    <script>
        $(function () {

            $("#b2").click(
                    function () {
                      var id=$("#id").val();
                      var name=$("#name").val();
                      var pwd=$("#pwd").val();
                      var sex=$("input[name='classify']:checked").val();

                        $.ajax({
                                    url: "/getPage",
                                    type: "POST",
                                    data: "name=lisan",
                                    success: function (ss) {
                                        alert(ss);
                                    },
                                }
                        );

                    }
            );
        })
    </script>

</head>
<body>
<table border="1px" align="center">
    <tr>
        <th width="400px">姓名</th>
        <th width="400px">性别</th>
        <th width="400px">专业</th>
        <th width="400px">分数</th>

    </tr>
    <tr>
        <th width="400px">${student.name}</th>
    <#if "${student.sex}"==1>
        <th width="400px">男</th>
    </#if>
    <#if "${student.sex}"==0>
        <th width="400px">女</th>
    </#if>
        <th width="400px">${student.cname}</th>
        <th width="400px">${student.score}</th>
    </tr>
</table>
<br>
<br>
<button id="b1">新增用户</button>
<br>

<!-- 按钮触发模态框 -->
<button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal">
    新增
</button>
<button class="btn btn-primary btn-md" data-toggle="modal" data-target="#myModal2">
    删除
</button>

<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">

        <div class="modal-content">
            <div class="modal-header">

                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    模态框（Modal）标题
                </h4>
            </div>
            <div class="modal-body">
                <table class="table table-hover">
                    <tr>
                        <td class="col-md-2">编号：</td>
                        <td class="col-md-4"><input type="text" name="id" id="id"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name" id="name"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="text" name="price" id="pwd"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>性别：</td>
                        <td><input type="radio" name="classify"  value="1" /> 男</td>
                        <td><input type="radio" name="classify"  value="2" >女</td>
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
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">

        <div class="modal-content">
            <div class="modal-header">

                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    模态框（Modal）标题
                </h4>
            </div>
            <div class="modal-body">
                <table class="table table-hover">
                    <tr>
                        <td class="col-md-2">222：</td>
                        <td class="col-md-4"><input type="text" name="id" id="id"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>姓名：</td>
                        <td><input type="text" name="name" id="name"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>密码：</td>
                        <td><input type="text" name="price" id="pwd"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>性别：</td>
                        <td><input type="radio" name="classify"  value="1" /> 男</td>
                        <td><input type="radio" name="classify"  value="2" >女</td>
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
</body>
<h3></h3>
</html>