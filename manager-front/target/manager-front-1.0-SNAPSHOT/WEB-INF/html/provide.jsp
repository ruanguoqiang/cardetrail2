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

<div id="wrapper">
    <%@include file="top.jsp"%>
    <%@include file="left.jsp"%>

<%--
    <%@include file="main.jsp"%>
--%>
    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Dashboard</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12 col-md-12 ">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a href="javascript:;" onclick="datadel()" class="btn btn-danger " style="margin-left: 10px">
                            <i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
                        <a class="btn btn-primary " style="margin-left: 20px" onclick="admin_role_add('添加角色','admin-role-add')" href="javascript:;">
                            <i class="Hui-iconfont">&#xe600;</i> 添加角色</a>
                    </div>
                </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
                            <thead>
                            <tr>
                                <th>选项</th>
                                <th>序号</th>
                                <th>姓名</th>
                                <th>地址</th>
                                <th>联系电话</th>
                                <th width="70">操作</th>
                            </tr>
                            </thead>
                        </table>
        <%--                <input id="Pname"></input>
                        <input id="Padddr"></input>
                        <input id="Ptel"></input>--%>
                        <div id="morris-area-chart"></div>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->


            </div>
            <!-- /.col-lg-8 -->
            <div class="col-lg-6 col-md-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <i class="fa fa-bell fa-fw"></i> Notifications Panel
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="list-group">
                            <a href="#" class="list-group-item">
                                <i class="fa fa-comment fa-fw"></i> New Comment
                                <span class="pull-right text-muted small"><em>4 minutes ago</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                <span class="pull-right text-muted small"><em>12 minutes ago</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-envelope fa-fw"></i> Message Sent
                                <span class="pull-right text-muted small"><em>27 minutes ago</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-tasks fa-fw"></i> New Task
                                <span class="pull-right text-muted small"><em>43 minutes ago</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                <span class="pull-right text-muted small"><em>11:32 AM</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-bolt fa-fw"></i> Server Crashed!
                                <span class="pull-right text-muted small"><em>11:13 AM</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-warning fa-fw"></i> Server Not Responding
                                <span class="pull-right text-muted small"><em>10:57 AM</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-shopping-cart fa-fw"></i> New Order Placed
                                <span class="pull-right text-muted small"><em>9:49 AM</em>
                                    </span>
                            </a>
                            <a href="#" class="list-group-item">
                                <i class="fa fa-money fa-fw"></i> Payment Received
                                <span class="pull-right text-muted small"><em>Yesterday</em>
                                    </span>
                            </a>
                        </div>
                        <!-- /.list-group -->
                        <a href="#" class="btn btn-default btn-block">View All Alerts</a>
                    </div>
                    <!-- /.panel-body -->
                </div>


            </div>
            <!-- /.col-lg-4 -->
        </div>
        <!-- /.row -->
    </div>
  <!-- /#page-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="../smart-static/js/jquery/1.9.1/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../smart-static/js/bootstrap.js"></script>
<script src="../smart-static/js/jquery.dataTables.js"></script>
<script src="../smart-static/layer/2.4/layer.js"></script>
<!-- Metis Menu Plugin JavaScript -->
<script  src="../smart-static/datatables-plugins/dataTables.bootstrap.js"></script>
<script src="../smart-static/metisMenu/metisMenu.js"></script>

<!-- Morris Charts JavaScript -->
<%--
<script src="../smart-static/chart/raphael/raphael.js"></script>
<script src="../smart-static/chart/morrisjs/morris.js"></script>
<script src="../smart-static/chart/morrisjs/morris-data.js"></script>
--%>

<!-- Custom Theme JavaScript -->
<script src="../smart-static/js/sb-admin-2.js"></script>

<script type="text/javascript">
    $(function() {
      //  getProvide();

        $("#dataTables-example").dataTable({
            serverSide: true,//开启服务器模式
            "processing": true,//加载显示提示
            "ajax": {
                url: "/provide/getProvideList",
                type: "get",
                dataType: "json",
                data: { "searchKey": ""},
            },
            "columns": [
                {
                    "data": null,
                    render: function (data, type, row, meta) {
                        return "<input name=\"checkbox\" value=\"" + row.id + "\" type=\"checkbox\" value=\"\">";
                    }
                },
                {
                    "data": "pno",
                    render: function (data, type, row, meta) {
                        return "<input type=\"button\" value=\"" + data + "\" onclick=\"member_show('用户详情')\" >"
                    }
                },
                {"data":"pname"},
                {"data":"padddr"},
                {"data":"ptel"},
                {
                    "data": null,
                    render: function (data, type, row, meta) {
                        return "<a style=\"text-decoration:none;margin-left:5px\" class=\"ml-5\" onClick=\"admin_role_edit('角色编辑','admin-role-edit',"+row.id+")\" href=\"javascript:;\" title=\"编辑\"><i class=\"\glyphicon glyphicon-wrench\"></i></a> <a style=\"text-decoration:none;margin-left:10px\" class=\"ml-15\" onClick=\"admin_role_del(this,"+row.id+")\" href=\"javascript:;\" title=\"删除\"><i class=\"\glyphicon glyphicon-remove-circle\"></i></a>";
                    }
                }
            ],
            "aaSorting": [[ 2, "desc" ]],//默认第几个排序
            "bStateSave": false,//状态保存
            language: {
                url: '/smart-static/datatables/Chinese.json'
            },
        });
    });

    function  getProvide() {
      $.ajax({
          url:"/provide/getProvide",
          type:"get",
          dataType:"json",
          data:{Pno:"1"},
          success:function (data) {
              layer.alert("开始");
              $("#Pname").val(data.pname);
              $("#Padddr").val(data.padddr);
              $("#Ptel").val(data.ptel);
          },
          error:function(XMLHttpRequest){
              layer.alert('数据处理失败! 错误码:'+XMLHttpRequest.status,{title: '错误信息',icon: 2});
          }
      })
    };
    
    function member_show(title) {
        layer.alert(title);
    }
</script>

</body>

</html>


