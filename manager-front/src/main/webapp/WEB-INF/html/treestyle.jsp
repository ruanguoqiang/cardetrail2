<%--
  Created by IntelliJ IDEA.
  User: sjj
  Date: 2015/10/24 0024
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
  <title>树形测试</title>
  <link rel="stylesheet" href="../smart-static/zTree/v3/css/zTreeStyle/zTreeStyle.css"/>

</head>
<body>
<h3>这里是树形测试</h3>
<div>
  <ul id="treeDemo" class="ztree"></ul>
</div>

<script type="text/javascript" src="../smart-static/js/jquery/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="../smart-static/zTree/v3/js/jquery.ztree.all-3.5.js"></script>
<script type="text/javascript" src="../smart-static/layer/2.4/layer.js"></script>
<script>
    var zTreeObj;
    var setting = {
        view: {
            dblClickExpand: true,
            showLine: true,
            selectedMulti: false
        },
        data: {
            simpleData: {
                enable:true,
                idKey: "id",
                pIdKey: "pId",
                rootPId: ""
            }
        },
        async: {
            enable: true,
            url: "/itemcar/getTree",
            type: "GET",
            contentType: "application/json",
            autoParam: ["id"]
        },
        callback: {
            onAsyncSuccess: function(){
            },
            beforeClick: function(treeId, treeNode) {
                $("#name").val(treeNode.name);
                $("#id").val(treeNode.id);
                $("#sortOrder").val(treeNode.sortOrder);
                $("#remark").val(treeNode.remark);
                $("#parentId").val(treeNode.pId);
                if($("#parentId").val()==""){
                    $("#parentId").val(0);
                }
                if(treeNode.pId!=0){
                    $("#parentName").val(treeNode.getParentNode().name);
                }
                if (treeNode.isParent) {
                    isParent=true;
                    return false;
                } else {
                    isParent=false;
                    return true;
                }
            },
            onClick:function (treeId, treeNode) {
                if(!treeNode.isParent){
                  $.ajax({
                      type:"get",
                      url:"/itemcar/getTreebyId",
                      data:{id:treeNode.id},
                      dataType:"json",
                      success:function(data){

                      }
                  })
                }
            }
        }
    };
  /*  var zNodes = [
        {name:"test1", open:true, children:[
                {name:"test1_1"}, {name:"test1_2"}]},
        {name:"test2", open:true, children:[
                {name:"test2_1"}, {name:"test2_2"}]}
    ];*/
    $(document).ready(function(){
        zTreeObj = $.fn.zTree.init($("#treeDemo"), setting);
    });
</script>
</body>
</html>
