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

        <title>SB Admin 2 - Dashboard</title>
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
                    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="<%= request.getContextPath()%>/AdminController?username=${username}">
                        <div class="sidebar-brand-icon rotate-n-15">
                            <i class="fas fa-laugh-wink"></i>
                        </div>



                        <div class="sidebar-brand-text mx-3">${username}</div>

                    </a>

                    <!-- Divider -->
                    <hr class="sidebar-divider my-0">

                    <!-- Nav Item - Dashboard -->
                    <li class="nav-item active">
                        <a class="nav-link" href="<%= request.getContextPath()%>/AdminController?username=${username}">
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
                                <a class="collapse-item" href="<%= request.getContextPath()%>/ListCustomer" >Khách Hàng</a>

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
                                <a class="collapse-item" href="<%= request.getContextPath()%>/orderCustomerController" >Đơn Hàng  Chờ</a>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/successCustomerOrderController" >Đơn Hàng Đã Xử Lý</a>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/orderController" >Đơn Hàng Guest </a>
                                <a class="collapse-item" href="<%= request.getContextPath()%>/successOrderController" >Đơn Hàng Guest Đã Xử Lý</a>

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
                                        <a class="dropdown-item" href="<%= request.getContextPath()%>/ProfileController?ManagerUsername=${username}&&Role=${role}">
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
                        <div class="container-fluid" id="listCustomer" style="display: none"  >
                            <h1>List Customer</h1>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">#</th>
                                        <th scope="col">Full Name</th>
                                        <th scope="col">Username</th>
                                        <th scope="col">Email</th>
                                        <th scope="col">Phone</th>
                                        <th scope="col">History</th>
                                        <th scope="col">Edit</th>
                                    </tr>
                                </thead>
                                <tbody>
<%
                           int cusCount=1;
                           %>

                                    <c:forEach items="${cusList}" var="list" >
                                 
                                        <tr>
                                            <td><%=cusCount++%></td>
                                            <td>${list.getCustomer_name()}</td>
                                            <td>${list.getUsername()}</td>
                                            <td>${list.getEmail()}</td>
                                            <td>${list.getPhone()}</td>
                                              <td><a href="LoginServlet?CusId=${list.getCustomer_id()}">View History</a></td>
                                            <td><a href="LoginServlet?CusId=${list.getCustomer_id()}">Edit</a></td>

                                        </tr>

                                    </c:forEach>



                                </tbody>
                            </table>


                        </div>


                        <!--------------------------------- End Customer   ---------------------------------------------->


                        <!--Begin DashBoard -->
                        <div class="container-fluid" id="mainDashboard" style="display: block" >

                            <!-- Page Heading -->
                           

                            <!-- Content Row -->
                            <div class="row">

                                <!-- Earnings (Monthly) Card Example -->
                                <div class="col-xl-3 col-md-6 mb-4">
                                    <div class="card border-left-primary shadow h-100 py-2">
                                        <div class="card-body">
                                            <div class="row no-gutters align-items-center">
                                                <div class="col mr-2">
                                                    <div class="text-xs font-weight-bold text-primary text-uppercase mb-1">
                                                        <a href="<%= request.getContextPath()%>/salaryController">Thu Nhập Hàng Tháng</a>            </div>
                                                    <div class="h5 mb-0 font-weight-bold text-gray-800"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${earningMonthly}" /> VNĐ
                                                       </div>
                                                </div>
                                                <div class="col-auto">
                                                    <a href="<%= request.getContextPath()%>/salaryController">  <i class="fas fa-calendar fa-2x text-gray-300"></i></a>
                                                   
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <!-- Earnings (Monthly) Card Example -->
                                <div class="col-xl-3 col-md-6 mb-4">
                                    <div class="card border-left-success shadow h-100 py-2">
                                        <div class="card-body">
                                            <div class="row no-gutters align-items-center">
                                                <div class="col mr-2">
                                                    <div class="text-xs font-weight-bold text-success text-uppercase mb-1">
                                                        <a href="<%= request.getContextPath()%>/salaryController">Thu Nhập Hàng Ngày</a>         </div>
                                                    <div class="h5 mb-0 font-weight-bold text-gray-800">
                                                    
                                                       <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${earningDaily}" /> VNĐ
                                                    </div>
                                                </div>
                                                <div class="col-auto">
                                                     <a href="<%= request.getContextPath()%>/salaryController">   <i class="fas fa-dollar-sign fa-2x text-gray-300"></i></a>
                                                   
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                                     
                                                     
                                 <div class="col-xl-3 col-md-6 mb-4">
                                    <div class="card border-left-danger shadow h-100 py-2">
                                        <div class="card-body">
                                            <div class="row no-gutters align-items-center">
                                                <div class="col mr-2">
                                                    <div class="text-xs font-weight-bold text-danger text-uppercase mb-1">
                                                        <a href="<%= request.getContextPath()%>/salaryController">Khách Hàng (Tháng)</a>            </div>
                                                    <div class="h5 mb-0 font-weight-bold text-gray-800">  <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalCustomer}" /> VNĐ</div>
                                                </div>
                                                <div class="col-auto">
                                                    <a href="<%= request.getContextPath()%>/salaryController">  <i class="fas fa-calendar fa-2x text-gray-300"></i></a>
                                                   
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                                    
                                                    <div class="col-xl-3 col-md-6 mb-4">
                                    <div class="card border-left-warning shadow h-100 py-2">
                                        <div class="card-body">
                                            <div class="row no-gutters align-items-center">
                                                <div class="col mr-2">
                                                    <div class="text-xs font-weight-bold text-warning text-uppercase mb-1">
                                                        <a href="<%= request.getContextPath()%>/salaryController">Khách Hàng Guest (Tháng)</a>            </div>
                                                    <div class="h5 mb-0 font-weight-bold text-gray-800"> <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalGuest}" /> VNĐ</div>
                                                </div>
                                                <div class="col-auto">
                                                    <a href="<%= request.getContextPath()%>/salaryController">  <i class="fas fa-calendar fa-2x text-gray-300"></i></a>
                                                   
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                                     

                                

                            </div>

                            <!-- Content Row -->

                            <div class="row">

                                <!-- Area Chart -->
                                <div class="col-xl-12 col-lg-12">
                                    <div class="card shadow mb-4">
                                        <!-- Card Header - Dropdown -->
                                        <div
                                            class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                            <h6 class="m-0 font-weight-bold text-primary">Earnings Overview</h6>
                                            
                                        </div>
                                        <!-- Card Body -->
                                         <div class="card-body">
                                            <div class="chart-area">
                                                <canvas id="myAreaChart"></canvas>
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                
                            </div>

                           

                        </div>
                        <!-- /.container-fluid     End DashBoard-->


                      

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
       
        <script src="<%= request.getContextPath()%>/js/demo/chart-pie-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
   
    
        <script>
            
            // Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = 'Nunito', '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#858796';

function number_format(number, decimals, dec_point, thousands_sep) {
  // *     example: number_format(1234.56, 2, ',', ' ');
  // *     return: '1 234,56'
  number = (number + '').replace(',', '').replace(' ', '');
  var n = !isFinite(+number) ? 0 : +number,
    prec = !isFinite(+decimals) ? 0 : Math.abs(decimals),
    sep = (typeof thousands_sep === 'undefined') ? ',' : thousands_sep,
    dec = (typeof dec_point === 'undefined') ? '.' : dec_point,
    s = '',
    toFixedFix = function(n, prec) {
      var k = Math.pow(10, prec);
      return '' + Math.round(n * k) / k;
    };
  // Fix for IE parseFloat(0.55).toFixed(0) = 0;
  s = (prec ? toFixedFix(n, prec) : '' + Math.round(n)).split('.');
  if (s[0].length > 3) {
    s[0] = s[0].replace(/\B(?=(?:\d{3})+(?!\d))/g, sep);
  }
  if ((s[1] || '').length < prec) {
    s[1] = s[1] || '';
    s[1] += new Array(prec - s[1].length + 1).join('0');
  }
  return s.join(dec);
}

// Area Chart Example
var ctx = document.getElementById("myAreaChart");
var myLineChart = new Chart(ctx, {
  type: 'line',
  data: {
    labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
    datasets: [{
      label: "Earnings",
      lineTension: 0.3,
      backgroundColor: "rgba(78, 115, 223, 0.05)",
      borderColor: "rgba(78, 115, 223, 1)",
      pointRadius: 3,
      pointBackgroundColor: "rgba(78, 115, 223, 1)",
      pointBorderColor: "rgba(78, 115, 223, 1)",
      pointHoverRadius: 3,
      pointHoverBackgroundColor: "rgba(78, 115, 223, 1)",
      pointHoverBorderColor: "rgba(78, 115, 223, 1)",
      pointHitRadius: 10,
      pointBorderWidth: 2,
           
                  
   
      data:  [   <c:forEach items="${totalEachMonth}" var="months">  ${months}, </c:forEach> ],
    }],
  },
  options: {
    maintainAspectRatio: false,
    layout: {
      padding: {
        left: 10,
        right: 25,
        top: 25,
        bottom: 0
      }
    },
    scales: {
      xAxes: [{
        time: {
          unit: 'date'
        },
        gridLines: {
          display: false,
          drawBorder: false
        },
        ticks: {
          maxTicksLimit: 7
        }
      }],
      yAxes: [{
        ticks: {
          maxTicksLimit: 5,
          padding: 10,
          // Include a dollar sign in the ticks
          callback: function(value, index, values) {
            return 'VNÐ ' + number_format(value);
          }
        },
        gridLines: {
          color: "rgb(234, 236, 244)",
          zeroLineColor: "rgb(234, 236, 244)",
          drawBorder: false,
          borderDash: [2],
          zeroLineBorderDash: [2]
        }
      }],
    },
    legend: {
      display: false
    },
    tooltips: {
      backgroundColor: "rgb(255,255,255)",
      bodyFontColor: "#858796",
      titleMarginBottom: 10,
      titleFontColor: '#6e707e',
      titleFontSize: 14,
      borderColor: '#dddfeb',
      borderWidth: 1,
      xPadding: 15,
      yPadding: 15,
      displayColors: false,
      intersect: false,
      mode: 'index',
      caretPadding: 10,
      callbacks: {
        label: function(tooltipItem, chart) {
          var datasetLabel = chart.datasets[tooltipItem.datasetIndex].label || '';
          return datasetLabel + ': VNÐ ' + number_format(tooltipItem.yLabel);
        }
      }
    }
  }
});

            
        </script>
    
    
    
    
    </body>


</html>
