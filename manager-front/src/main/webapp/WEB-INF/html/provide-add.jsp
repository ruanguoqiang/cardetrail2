<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <!-- datatables -->
    <link href="../smart-static/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">
                        <form role="form" id="formProvide"  name="formProvide">
                            <div class="form-group">
                                <label for="pname" class="control-label">序号:</label>
                                <input type="text" class="form-control" id="pno" name="pno">
                            </div>
                            <div class="form-group">
                                <label for="pname" class="control-label">供应商姓名:</label>
                                <input type="text" class="form-control" id="pname" name="pname">
                            </div>
                            <div class="form-group">
                                <label for="pname" class="control-label">供应商地址:</label>
                                <input  type="text" class="form-control" id="padddr" name="padddr" placeholder="Enter text">
                            </div>
                            <div  class="form-group">
                                <label for="ptel" class="control-label">联系电话:</label>
                                <input type="text" name="ptel" class="form-control" id="ptel"/>
                            </div>

                            <button type="submit" class="btn btn-default" onclick="addProvide()">添加</button>
                            <button type="reset" class="btn btn-default">重置</button>
                        </form>
                    </div>
                    <!-- /.col-lg-6 (nested) -->

                    <!-- /.col-lg-6 (nested) -->
                </div>
                <!-- /.row (nested) -->
            </div>
            <!-- /.panel-body -->
        </div>


        <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
</div>

<!-- jQuery -->
<script src="../smart-static/js/jquery/1.9.1/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../smart-static/js/bootstrap.js"></script>
<script src="../smart-static/js/jquery.dataTables.js"></script>
<script src="../smart-static/js/jquery.serializejson.js"></script>
<script src="../smart-static/layer/2.4/layer.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script  src="../smart-static/datatables-plugins/dataTables.bootstrap.js"></script>
<script src="../smart-static/metisMenu/metisMenu.js"></script>
<script src="../smart-static/js/jquery.dataTables.js"></script>
<script src="../smart-static/jquery.validation/1.14.0/jquery.validate.js"></script>
<script src="../smart-static/jquery.validation/1.14.0/messages_zh.js"></script>



<!-- Custom Theme JavaScript -->
<script src="../smart-static/js/sb-admin-2.js"></script>

<script type="text/javascript">
    function addProvide(){
    $("#formProvide").validate({
        rules:{
            pname:{
                required:true,
                minlength:1,
                maxlength:20,
              //  remote: "/provide/pname"
            },
        },
        messages: {
            pname: {
                remote: "该角色名已被使用"
            }
        },
        onkeyup:false,
        focusCleanup:false,
        success:"valid",
        submitHandler:function(form){
            var obj= JSON.stringify($('#formProvide').serializeJSON());
            $.ajax({
                url: "/provide/insertProvide",
                type: "POST",
                data:obj,
                contentType: "application/json",
                dataType:"json",
                success: function(data) {
                    if(data.message=="success"){
                        parent.refresh();
                        parent.msgSuccess("添加成功!");
                        var index = parent.layer.getFrameIndex(window.name);
                        parent.layer.close(index);
                    }else{
                        layer.alert(data.message, {title: '错误信息',icon: 2});
                    }
                },
                error:function(XMLHttpRequest) {
                 //   layer.close(index);
                    layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status+' 错误信息:'+JSON.parse(XMLHttpRequest.responseText).message,{title: '错误信息',icon: 2});
                }
            });
        }
    });
    }
</script>
</body>
</html>
