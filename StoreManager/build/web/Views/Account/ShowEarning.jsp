<%-- 
    Document   : Manager
    Created on : Feb 2, 2023, 8:00:11 AM
    Author     : notur
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.EmployeeDAO"%>
<%@page import="Model.Customer"%>
<%@page import="Model.Employee"%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Dashboard</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

        <!-- Custom fonts for this template-->
        <link href="<%= request.getContextPath()%>/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="<%= request.getContextPath()%>/css/sb-admin-2.min.css" rel="stylesheet">

    </head>

    <body id="page-top">
    
            <!-- Page Wrapper -->
            <div id="wrapper">

                <!-- Sidebar -->
                <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                    <!-- Sidebar - Brand -->
                     <c:if test="${role==1}">
                             <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath()%>/AdminController?username=${username}">
                          
                        </c:if>
                                 <c:if test="${role==0}">
                             <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath()%>/EmployeeController?username=${username}">
                          
                        </c:if>
                                 <div class="sidebar-brand-icon rotate-n-15">
                            <i class="fas fa-laugh-wink"></i>
                        </div>



                        <div class="sidebar-brand-text mx-3">Admin ${username}</div>

                    </a>

                    <!-- Divider -->
                    <hr class="sidebar-divider my-0">

                    <!-- Nav Item - Dashboard -->
                    <li class="nav-item active">
                         <c:if test="${role==1}">
                             <a class="nav-link" href="<%= request.getContextPath()%>/AdminController?username=${username}">
                          
                        </c:if>
                                 <c:if test="${role==0}">
                             <a class="nav-link" href="<%= request.getContextPath()%>/EmployeeController?username=${username}">
                          
                        </c:if>
                      
                            <i class="fas fa-fw fa-tachometer-alt"></i>
                            <span>Dashboard</span></a>
                    </li>

                    <!-- Divider -->
                    <hr class="sidebar-divider">

                    <!-- Heading -->
                    <div class="sidebar-heading">
                        Interface
                    </div>

                    
                    <c:if test="${role==1}">
                        
                     
                    <!-- Nav Item - Pages Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                           aria-expanded="true" aria-controls="collapseTwo">
                            <i class="fas fa-dollar-sign"></i>
                            <span>Doanh Thu</span>
                        </a>
                        <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Doanh Thu</h6>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/salaryController">Đơn Hàng</a>
                              
                            </div>
                        </div>
                    </li>
                    
                     <!-- Nav Item - Utilities Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilitiesStore"
                           aria-expanded="true" aria-controls="collapseUtilities">
                            <i class="fas fa-user"></i>
                            <span>Quản Lý Cửa Hàng</span>
                        </a>
                        <div id="collapseUtilitiesStore" class="collapse" aria-labelledby="headingUtilities"
                             data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Đơn Hàng</h6>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/StoreController" >Xem Cửa Hàng</a>
                      

                            </div>
                        </div>
                    </li>
                    

                    <!-- Nav Item - Utilities Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                           aria-expanded="true" aria-controls="collapseUtilities">
                            <i class="fas fa-user"></i>
                            <span>Quản Lý Tài khoản</span>
                        </a>
                        <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities"
                             data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Account</h6>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/EmployeeList" >Nhân Viên</a>
                      

                            </div>
                        </div>
                    </li>
                    
                    </c:if>
                    
                    
                    
                    
                    
                    
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwoSP"
                           aria-expanded="true" aria-controls="collapseTwo">
                            <i class="fas fa-eye"></i>
                            <span>Quản Lý Sản Phẩm</span>
                        </a>
                        <div id="collapseTwoSP" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Sản Phẩm</h6>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/ProductList">Product</a>
                                  <a class="collapse-item" href="<%= request.getContextPath()%>/CategoryController">Category</a>
                                  
                                
                              
                            </div>
                        </div>
                    </li>
                    
                    
                    <!-- Nav Item - Utilities Collapse Menu -->
                    <li class="nav-item">
                        <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilitiesDH"
                           aria-expanded="true" aria-controls="collapseUtilities">
                            <i class="fas fa-user"></i>
                            <span>Quản Lý Đơn Hàng</span>
                        </a>
                        <div id="collapseUtilitiesDH" class="collapse" aria-labelledby="headingUtilities"
                             data-parent="#accordionSidebar">
                            <div class="bg-white py-2 collapse-inner rounded">
                                <h6 class="collapse-header">Đơn Hàng</h6>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/orderController" >Đơn Hàng Chờ</a>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/successOrderController" >Đơn Hàng Đã Xử Lý</a>

                            </div>
                        </div>
                    </li>

                    
                     
                    
                    <!-- Divider -->
                    <hr class="sidebar-divider">

                  

                    


                   

                 

                </ul>
                <!-- End of Sidebar -->

                <!-- Content Wrapper -->
                <div id="content-wrapper" class="d-flex flex-column">

                    <!-- Main Content -->
                    <div id="content">

                        <!-- Topbar -->
                        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                         

                            <!-- Topbar Navbar -->
                            <ul class="navbar-nav ml-auto">

                                <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                                <li class="nav-item dropdown no-arrow d-sm-none">
                                    <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <i class="fas fa-search fa-fw"></i>
                                    </a>
                                    <!-- Dropdown - Messages -->
                                    <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                                         aria-labelledby="searchDropdown">
                                        <form class="form-inline mr-auto w-100 navbar-search">
                                            <div class="input-group">
                                                <input type="text" class="form-control bg-light border-0 small"
                                                       placeholder="Search for..." aria-label="Search"
                                                       aria-describedby="basic-addon2">
                                                <div class="input-group-append">
                                                    <button class="btn btn-primary" type="button">
                                                        <i class="fas fa-search fa-sm"></i>
                                                    </button>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                </li>

                             


                                <div class="topbar-divider d-none d-sm-block"></div>

                                <!-- Nav Item - User Information -->
                                <li class="nav-item dropdown no-arrow">
                                    <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <span class="mr-2 d-none d-lg-inline text-gray-600 small">${username}</span>
                                        <img class="img-profile rounded-circle"
                                             src="<%= request.getContextPath()%>/img/undraw_profile.svg">
                                    </a>
                                    <!-- Dropdown - User Information -->
                                    <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                         aria-labelledby="userDropdown">
                                     <a class="dropdown-item" href="<%= request.getContextPath()%>/ProfileController?ManagerUsername=${username}">
                                            <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                                            Profile
                                        </a>
                                        
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                            <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                            Logout
                                        </a>
                                    </div>
                                </li>

                            </ul>

                        </nav>
                        <!-- End of Topbar -->

                        <!-- Begin Page Content 
                        

                        

                        <!--Customer -->
                        <div class="container-fluid" id="listCustomer" style="display: block"  >
                            
                            <h1>Báo Cáo Doanh Thu Khách Hàng</h1>
                            <h3>Doanh Thu Theo Tháng: <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalSalaryOrderMonth}"/> VNĐ</h3>
                            <h3>Doanh Thu Theo Ngày:  <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalSalaryOrderDaily}" /> VNĐ</h3>
                             <div class="row">
                            <div class="col-3">
                               
                            </div>

                            <div class="col-9">
                                <form action="<%= request.getContextPath()%>/salaryController" method="post"> 
                                    <div class="row"> 
                                         
                                        <div class="col-7"> 
                                            <div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Search Order</span>
  <input type="month" class="form-control" name="searchString"  aria-describedby="basic-addon1">
</div>
                                        </div> 
                                        <div class="col-3"> 
                                            <button type="submit" name="submitSearch" class="btn btn-primary">Search</button>
                                        </div> 
                                    </div>
                                </form>
                            </div>

                        </div>
                            <table class="table">
                                <thead>
                                    <tr>
                                      
                                        <th scope="col">Order Id</th>
                                        
                                         <th scope="col">Order Time</th>
                                        <th scope="col">Order Status</th>
                                         
                                     
                                        
                                        
                                        <th scope="col">Total</th>
                                        <th scope="col">Details</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
  <c:forEach items="${listOrders}" var="list" >
                                 
                                        <tr>
                                           
                                            <td>${list.getOrder_id()}</td>
                                             
                                                <td>${list.getOrder_time()}</td>
                                                
                                                <c:if test="${list.getOrder_status()==2}">
                                                     <td>Thành công</td>
                                                </c:if>
                                                       <c:if test="${list.getOrder_status()!=2}">
                                                     <td>Wait</td>
                                                </c:if>
                                             
                                           
                                            <td><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${list.getTotal_price()}"/> VNĐ</td>
                                            <td><a href="<%= request.getContextPath()%>/salaryDetailsController?orderId=${list.getOrder_id()}">Xem Chi Tiết</a></td>


                                        </tr>

                                    </c:forEach>


                                </tbody>
                            </table>


                        </div>


                        <!--------------------------------- End Customer   ---------------------------------------------->

                        <div class="container-fluid" id="listCustomer" style="display: block"  >
                            
                            <h1>Báo Cáo Doanh Thu Guest</h1>
                            <h3>Doanh Thu Theo Tháng: <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalSalaryGuestOrderMonth}" /> VNÐ</h3>
                            <h3>Doanh Thu Theo Ngày:  <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalSalaryGuestOrderDaily}" /> VNÐ</h3>
                             <div class="row">
                            <div class="col-3">
                               
                            </div>

                            <div class="col-9">
                                <form action="<%= request.getContextPath()%>/salaryController" method="post"> 
                                    <div class="row"> 
                                         
                                        <div class="col-7"> 
                                            <div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Search Order</span>
  <input type="month" class="form-control" name="searchStringForGuest"  aria-describedby="basic-addon1">
</div>
                                        </div> 
                                        <div class="col-3"> 
                                            <button type="submit" name="submitSearch" class="btn btn-primary">Search</button>
                                        </div> 
                                    </div>
                                </form>
                            </div>

                        </div>
                            <table class="table">
                                <thead>
                                    <tr>
                                      
                                        <th scope="col">Order Id</th>
                                        
                                         <th scope="col">Order Time</th>
                                        <th scope="col">Order Status</th>
                                         
                                     
                                        
                                        
                                        <th scope="col">Total</th>
                                        <th scope="col">Details</th>
                                        
                                    </tr>
                                </thead>
                                <tbody>
                      <c:forEach items="${listOrdersGuest}" var="list" >
                                 
                                        <tr>
                                           
                                            <td>${list.getOrder_id()}</td>
                                             
                                                <td>${list.getOrder_time()}</td>
                                                
                                                <c:if test="${list.getOrder_status()==2}">
                                                     <td>Thành công</td>
                                                </c:if>
                                                       <c:if test="${list.getOrder_status()!=2}">
                                                     <td>Wait</td>
                                                </c:if>
                                             
                                           
                                            <td><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${list.getTotal_price()}"/> VNĐ</td>
                                            <td><a href="<%= request.getContextPath()%>/salaryDetailsController?orderGuestId=${list.getOrder_id()}">Xem Chi Tiết</a></td>

                                        </tr>

                                    </c:forEach>


                                </tbody>
                            </table>


                        </div>

                        


                      

                    </div>
<div>
                                    
                                </div>
                    <!-- End of Main Content -->

                    <!-- Footer -->
                    <footer class="sticky-footer bg-white">
                        <div class="container my-auto">
                            <div class="copyright text-center my-auto">
                                <span>Copyright &copy; Your Website 2021</span>
                            </div>
                        </div>
                    </footer>
                    <!-- End of Footer -->

                </div>
                <!-- End of Content Wrapper -->

            </div>
            <!-- End of Page Wrapper -->

            <!-- Scroll to Top Button-->
            <a class="scroll-to-top rounded" href="#page-top">
                <i class="fas fa-angle-up"></i>
            </a>

            <!-- Logout Modal-->
            <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">×</span>
                            </button>
                        </div>
                        <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <a class="btn btn-primary" href="<%= request.getContextPath()%>/LoginServlet">Logout</a>
                        </div>
                    </div>
                </div>
            </div>

       


        <!-- Bootstrap core JavaScript    mainDashboard        -->

       



      



        <script src="<%= request.getContextPath()%>/vendor/jquery/jquery.min.js"></script>
        <script src="<%= request.getContextPath()%>/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="<%= request.getContextPath()%>/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="<%= request.getContextPath()%>/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="<%= request.getContextPath()%>/vendor/chart.js/Chart.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="<%= request.getContextPath()%>/js/demo/chart-area-demo.js"></script>
        <script src="<%= request.getContextPath()%>/js/demo/chart-pie-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>


</html>
