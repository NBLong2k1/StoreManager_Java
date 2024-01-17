<%-- 
    Document   : ProductPage
    Created on : Mar 8, 2023, 9:30:17 PM
    Author     : notur
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Shop Homepage - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="<%= request.getContextPath()%>/assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="<%= request.getContextPath()%>/cssForHomePage/styles.css" rel="stylesheet" />
    </head>
    <body>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="<%= request.getContextPath()%>/ProductPageController">Bakery Store</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent" >
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="<%= request.getContextPath()%>/ProductPageController">Home</a></li>
                   
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">

                                <li><a class="dropdown-item" href="<%= request.getContextPath()%>/ProductPageController">Popular Items</a></li>
                             

                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Category</a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">

                                <li><a class="dropdown-item" href="<%= request.getContextPath()%>/ProductSearchController?cate=1">Birthday Cake</a></li>
                                <li><a class="dropdown-item" href="<%= request.getContextPath()%>/ProductSearchController?cate=2">Wedding Cake</a></li>
                                <li><a class="dropdown-item" href="<%= request.getContextPath()%>/ProductSearchController?cate=3">Custom Cake</a></li>
                            </ul>

                        </li>



                    </ul>
                    <div style="margin-right:100px">

                        <form class="d-flex" action="<%= request.getContextPath()%>/ProductSearchController" method="post">

                      
                              <input class="form-control me-2 " size="50" name="searchString"  type="search" placeholder="Search Product" aria-label="Search">

                           

                         <button class="btn btn-outline-success" type="submit">Search</button>
                         



                        </form>
                    </div>


                </div>
            </div>

             <c:if test="${username!=null}">
                  <div class="d-flex" style="float:right;margin-right:25px"> <a class="btn btn-outline-dark" href="<%= request.getContextPath()%>/ShowCustomerCart?customerUser=${username}"><i class="bi-cart-fill me-1"></i>Cart <span class="badge bg-dark text-white ms-1 rounded-pill"></span></a></div> 
           
                <a href="<%= request.getContextPath()%>/CustomerManager?cusUsername=${username}">Hello ${username}</a>
            </c:if>
                <c:if test="${username==null}">
                     <div class="d-flex" style="float:right;margin-right:25px"> <a class="btn btn-outline-dark" href="<%= request.getContextPath()%>/ShoppingCartController"><i class="bi-cart-fill me-1"></i>Cart <span class="badge bg-dark text-white ms-1 rounded-pill"></span></a></div> 
           
              <a href="<%= request.getContextPath()%>/Views/Account/Login.jsp" style="margin-right: 20px;" class="btn btn-outline-dark">Login</a>
       
            </c:if>
             
        </nav>
        <!-- Header-->
        <header class="bg-dark py-5">
            <div class="container px-4 px-lg-5 my-5">
                <div class="text-center text-white">
                    <h1 class="display-4 fw-bolder">Thanh Toán Thành Công</h1>
                    <p class="lead fw-normal text-white-50 mb-0">Cảm ơn bạn đã tin tưởng và ủng hộ, chúng tôi sẽ liên lạc với bạn trong thời gian sớm nhất !</p>
                    <a href="<%= request.getContextPath()%>/ProductPageController" class="btn btn-success">Mua Thêm</a>
                
                </div>
               
            </div>
        </header>
        

      

        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2022</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="<%= request.getContextPath()%>/jsForHomePage/scripts.js"></script>
    </body>
</html>

