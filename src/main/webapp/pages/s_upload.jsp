<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>AdminLTE 3 | Dashboard</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Tempusdominus Bbootstrap 4 -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- JQVMap -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/jqvmap/jqvmap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/dist/css/adminlte.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/daterangepicker/daterangepicker.css">
  <!-- summernote -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/pages/plugins/summernote/summernote-bs4.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
  <script type="text/javascript"
          src="${pageContext.request.contextPath}/pages/dist/js/jquery/jquery.js"></script>
  <script type="text/javascript">
  </script>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

  <!-- Navbar -->
  <jsp:include page="header.jsp"/>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <jsp:include page="s_aside.jsp"/>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-md-4">
            <div class="card card-secondary">
              <div class="card-header">
                <h3 class="card-title">上传开题报告</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->

                <div class="card-body">
                  <input type="file" name="fileName1" id="fileName1"><br><br>
                  <%--<input type="submit" value="上传">--%>
                </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="button" class="btn btn-secondary" onclick="sendToUser()" id="sendToUser">上传开题</button>
                </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card card-secondary">
              <div class="card-header">
                <h3 class="card-title">上传中期报告</h3>
              </div>
              <!-- /.card-header -->

                <div class="card-body">
                  <input type="file" name="fileName2" id="fileName2"><br><br>
                  <%--<input type="submit" value="上传">--%>
                </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="button" class="btn btn-secondary" onclick="sendToMid()">上传中期</button>
                </div>
            </div>
          </div>
          <div class="col-md-4">
            <div class="card card-secondary">
              <div class="card-header">
                <h3 class="card-title">上传论文</h3>
              </div>
              <!-- /.card-header -->
                <div class="card-body">
                  <input type="file" name="fileName3" id="fileName3"><br><br>
                  <%--<input type="submit" value="上传">--%>
                </div>
                <!-- /.card-body -->
                <div class="card-footer">
                  <button type="button" class="btn btn-secondary" onclick="sendToEnd()">上传论文</button>
                </div>
            </div>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  <jsp:include page="footer.jsp"/>
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/pages/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="${pageContext.request.contextPath}/pages/plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/pages/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- ChartJS -->
<script src="${pageContext.request.contextPath}/pages/plugins/chart.js/Chart.min.js"></script>
<!-- Sparkline -->
<script src="${pageContext.request.contextPath}/pages/plugins/sparklines/sparkline.js"></script>
<!-- JQVMap -->
<script src="${pageContext.request.contextPath}/pages/plugins/jqvmap/jquery.vmap.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
<!-- jQuery Knob Chart -->
<script src="${pageContext.request.contextPath}/pages/plugins/jquery-knob/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="${pageContext.request.contextPath}/pages/plugins/moment/moment.min.js"></script>
<script src="${pageContext.request.contextPath}/pages/plugins/daterangepicker/daterangepicker.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/pages/plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<!-- Summernote -->
<script src="${pageContext.request.contextPath}/pages/plugins/summernote/summernote-bs4.min.js"></script>
<!-- overlayScrollbars -->
<script src="${pageContext.request.contextPath}/pages/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/pages/dist/js/adminlte.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="${pageContext.request.contextPath}/pages/dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${pageContext.request.contextPath}/pages/dist/js/demo.js"></script>
</body>
<script>
  function sendToUser(){ //在这里进行ajax 文件上传 用户的信息
    alert("tset");
    var $file1 = $("input[name='fileName1']").val();//用户文件内容(文件)
    // 判断文件是否为空
    if ($file1 == "") {
      alert("请选择上传的目标文件! ")
      return false;
    }
    //判断文件类型,我这里根据业务需求判断的是Excel文件
    // var fileName1 = $file1.substring($file1.lastIndexOf(".") + 1).toLowerCase();
    // if(fileName1 != "xls" && fileName1 !="xlsx"){
    //   alert("请选择Execl文件!");
    //   return false;
    // }
    //判断文件大小
    var size1 = $("input[name='fileName1']")[0].files[0].size;
    if (size1>104857600) {
      alert("上传文件不能大于100M!");
      return false;
    }

    boo1 = true;
    var type = "file";
    var formData = new FormData();//这里需要实例化一个FormData来进行文件上传
    formData.append(type,$("#fileName1")[0].files[0]);
    $.ajax({
      type : "post",
      url : "/clazz/upload/begin",
      data : formData,
      processData : false,
      contentType : false,
      success : function(data){
        if (data) {
          alert("文件上传成功!");
        }else{
          alert("文件上传失败!");
        }}
    });
  }
  function sendToMid(){ //在这里进行ajax 文件上传 用户的信息
    alert("tset");
    var $file1 = $("input[name='fileName2']").val();//用户文件内容(文件)
    // 判断文件是否为空
    if ($file1 == "") {
      alert("请选择上传的目标文件! ")
      return false;
    }
    //判断文件类型,我这里根据业务需求判断的是Excel文件
    // var fileName1 = $file1.substring($file1.lastIndexOf(".") + 1).toLowerCase();
    // if(fileName1 != "xls" && fileName1 !="xlsx"){
    //   alert("请选择Execl文件!");
    //   return false;
    // }
    //判断文件大小
    var size1 = $("input[name='fileName2']")[0].files[0].size;
    if (size1>104857600) {
      alert("上传文件不能大于100M!");
      return false;
    }

    boo1 = true;
    var type = "file";
    var formData = new FormData();//这里需要实例化一个FormData来进行文件上传
    formData.append(type,$("#fileName2")[0].files[0]);
    $.ajax({
      type : "post",
      url : "/clazz/upload/mid",
      data : formData,
      processData : false,
      contentType : false,
      success : function(data){
        if (data) {
          alert("文件上传成功!");
        }else{
          alert("文件上传失败!");
        }}
    });
  }
  function sendToEnd(){ //在这里进行ajax 文件上传 用户的信息
    alert("tset");
    var $file1 = $("input[name='fileName3']").val();//用户文件内容(文件)
    // 判断文件是否为空
    if ($file1 == "") {
      alert("请选择上传的目标文件! ")
      return false;
    }
    //判断文件类型,我这里根据业务需求判断的是Excel文件
    // var fileName1 = $file1.substring($file1.lastIndexOf(".") + 1).toLowerCase();
    // if(fileName1 != "xls" && fileName1 !="xlsx"){
    //   alert("请选择Execl文件!");
    //   return false;
    // }
    //判断文件大小
    var size1 = $("input[name='fileName3']")[0].files[0].size;
    if (size1>104857600) {
      alert("上传文件不能大于100M!");
      return false;
    }

    boo1 = true;
    var type = "file";
    var formData = new FormData();//这里需要实例化一个FormData来进行文件上传
    formData.append(type,$("#fileName3")[0].files[0]);
    $.ajax({
      type : "post",
      url : "/clazz/upload/end",
      data : formData,
      processData : false,
      contentType : false,
      success : function(data){
        if (data) {
          alert("文件上传成功!");
        }else{
          alert("文件上传失败!");
        }}
    });
  }
</script>
</html>
