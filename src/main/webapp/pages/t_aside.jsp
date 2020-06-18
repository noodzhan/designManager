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
    <a href="index3.html" class="brand-link">
        <img src="${pageContext.request.contextPath}/pages/dist/img/AdminLTELogo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
             style="opacity: .8">
        <span class="brand-text font-weight-light">毕设管理系统</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user panel (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
                <img src="${pageContext.request.contextPath}/pages/dist/img/user3-128x128.jpg" class="img-circle elevation-2" alt="User Image">
            </div>
            <div class="info">
                <a href="#" class="d-block">${sessionScope.user.tname}</a>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
                <!-- Add icons to the links using the .nav-icon class
                     with font-awesome or any other icon font library -->
                <li class="nav-item has-treeview ">
                    <a href="#" class="nav-link ">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            上传题目
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="/pages/t_uploadClass.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>上传题目</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item has-treeview ">
                    <a href="#" class="nav-link ">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            开题审核
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="/t/nobegin" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>审核开题报告</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/pages/t_remark.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>提交开题意见</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/pages/t_sorces.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>提交开题成绩</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item has-treeview ">
                    <a href="#" class="nav-link ">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            中期审核
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="/t/nomid" class="nav-link ">
                                <i class="far fa-circle nav-icon"></i>
                                <p>审核中期报告</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/pages/t_remark.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>提交中期建议</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/pages/t_sorces.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>提交中期成绩</p>
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="nav-item has-treeview ">
                    <a href="#" class="nav-link ">
                        <i class="nav-icon fas fa-tachometer-alt"></i>
                        <p>
                            后期审核
                            <i class="right fas fa-angle-left"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="/t/noend" class="nav-link ">
                                <i class="far fa-circle nav-icon"></i>
                                <p>论文审核</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/pages/t_remark.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>提交论文意见</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/pages/t_sorces.jsp" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>提交答辩成绩</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/t/suggest" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>查看评语</p>
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
