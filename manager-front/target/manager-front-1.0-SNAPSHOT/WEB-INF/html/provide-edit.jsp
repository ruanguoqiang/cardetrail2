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
            <div class="panel-heading">
                Basic Form Elements
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">
                        <form role="form">
                            <div class="form-group">
                                <label>Text Input</label>
                                <input class="form-control" id="name" name="name">
                            </div>
                            <div class="form-group">
                                <input class="form-control" id="address" name="address" placeholder="Enter text">
                            </div>
                            <button type="submit" class="btn btn-default">Submit Button</button>
                            <button type="reset" class="btn btn-default">Reset Button</button>
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
  var P_id=$(parent.P_id);
  var P_name=$(parent.P_name);
  $.ajax({
      url:"/provide/provideEdit",
      type:"get",
      data:{pId:P_id,pName:P_name},
      dataType:"json",
      success:function(data){
          if (data.success==true){
              alert("成功")
              $(".name").val(data.data.pName);
          }
      }
  })
</script>
</body>
</html>
