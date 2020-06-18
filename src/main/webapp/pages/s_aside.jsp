<%--
  Created by IntelliJ IDEA.
  User: zhan
  Date: 2020/3/23
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<!-- Main Sidebar Container -->
<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="${pageContext.request.contextPath}/pages/index3.html" class="brand-link">
        <img src="${pageContext.request.contextPath}/pages/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
             style="opacity: .8">
        <span class="brand-text font-weight-light">毕设管理系统</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
                <img src="${pageContext.request.contextPath}/pages/dist/img/user1-128x128.jpg" class="img-circle elevation-2" alt="User Image">
            </div>
            <div class="info">
                <a href="${pageContext.request.contextPath}/pages/#" class="d-block">${sessionScope.user.sname}</a>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                <!-- Add icons to the links using the .nav-icon class
                     with font-awesome or any other icon font library -->
                <li class="nav-item has-treeview menu-open">
                    <a href="${pageContext.request.contextPath}/pages/#" class="nav-link ">
                        <i class="nav-icon fas fa-tree"></i>
                        <p>
                            开题管理
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/pages/s_index.jsp" class="nav-link ">
                                <i class="far fa-circle nav-icon"></i>
                                <p>确定选题</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/pages/s_upload.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>上传开题报告</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/clazz/advice" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>查看开题成绩</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item has-treeview ">
                    <a href="${pageContext.request.contextPath}/pages/#" class="nav-link ">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            中期管理
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/clazz/advice" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>指导意见</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/pages/s_upload.jsp" class="nav-link ">
                                <i class="far fa-circle nav-icon"></i>
                                <p>上传中期报告</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/clazz/advice" class="nav-link ">
                                <i class="far fa-circle nav-icon"></i>
                                <p>查看中期成绩</p>
                            </a>
                        </li>

                    </ul>
                </li>
                <li class="nav-item has-treeview ">
                    <a href="${pageContext.request.contextPath}/pages/#" class="nav-link ">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            后期管理
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/pages/s_upload.jsp" class="nav-link ">
                                <i class="far fa-circle nav-icon"></i>
                                <p>上传论文</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/clazz/advice" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>查看总成绩</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="${pageContext.request.contextPath}/pages/s_remark.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>老师评语</p>
                            </a>
                        </li>
                    </ul>
                </li>
                

            </ul>
        </nav>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
</aside>

<script src="${pageContext.request.contextPath}/pages/plugins/jquery/jquery.min.js"></script>
