<%-- 
    Document   : ShoppingCart
    Created on : Mar 9, 2023, 8:55:19 AM
    Author     : notur
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
       <!-- Navigation-->
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
                    <h1 class="display-4 fw-bolder">Shopping Cart</h1>
                  
                </div>
            </div>
        </header>

   

<table class="table">
    <thead>
        <tr>

            <th scope="col">Product Name</th>

            <th scope="col">Description</th>
            <th scope="col">Image</th>
            <th scope="col">Price</th>
            <th scope="col">Quantity</th>
            <th scope="col">Edit</th>
            <th scope="col">Total</th>
        </tr>
    </thead>
    <tbody>

       
            
           <c:set var="totalPrice" value="0" />
           
          
           
            <c:forEach items="${productListCart}" var="list">
                
                
                
                        <c:set var = "salary" scope = "session" value = "${list.getKey().getPrice()*list.getValue()}"/>
     
                      <c:set var="totalPrice" value="${totalPrice + salary}" />
      
                      
                      <c:if test="${username!=null}">
                          <form action="<%= request.getContextPath()%>/EditCustomerCartController" method="post">
                     <input type="text" value="${username}" hidden name="getCustomerUsername"/>
                          </c:if>
                       <c:if test="${username==null}">
                          <form action="<%= request.getContextPath()%>/EditCookieController" method="post">
                      </c:if>
     
                        <tr>

                            <td>${list.getKey().getProduct_name()}</td>

                            <td>${list.getKey().getDescription()}</td>
                            <td><img src="${list.getKey().getProduct_img()}" width="150" height="150"></img></td>
                            <td><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${list.getKey().getPrice()}" /> VNĐ</td>
                            <td>
                                <input type="number" name="proid" min="0" value="${list.getKey().getProduct_id()}" hidden>
                                
                                
                                
                                
                                <input type="number" name="proQuantity" min="1" value="${list.getValue()}">
                               
                                
                                
                            </td>
                            <td>

                                <button type="submit" name="saveEditProduct" class="btn btn-sm btn-primary">Save</button>

                                
                                <c:if test="${username!=null}">
                          <a href="<%=request.getContextPath()%>/EditCustomerCartController?deleteID=${list.getKey().getProduct_id()}&&getCustomerUsername=${username}" class="btn btn-sm btn-danger">Delete</a>
                              
                      </c:if>
                       <c:if test="${username==null}">
                           <a href="<%=request.getContextPath()%>/EditCookieController?deleteID=${list.getKey().getProduct_id()}" class="btn btn-sm btn-danger">Delete</a>
                              
                      </c:if>
                                
                            
                            
                            
                            </td>
                                            <td><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${salary}" /></td>
                        </tr>
                         </form>

               </c:forEach>
         
     
    </tbody>
</table>    

<div style="margin-right:100px;">


<h3 style="float:right;color:red">Tổng: <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalPrice}" /> VNĐ</h3>

<c:if test="${totalPrice>0}">
    
    <c:if test="${username==null}">
        <a href="<%= request.getContextPath()%>/checkoutShoppingController" class="btn btn-success" style="float:right;margin-right:35px;">Thanh Toán</a>
    </c:if>
         <c:if test="${username!=null}">
        <a href="<%= request.getContextPath()%>/checkoutCustomerShoppingController?getCustomerUsername=${username}&&totalPrice=${totalPrice}" class="btn btn-success" style="float:right;margin-right:35px;">Thanh Toán</a>
    </c:if>
     
    
</c:if>
    <c:if test="${totalPrice<=0}">
    <a href="<%= request.getContextPath()%>/ProductPageController" class="btn btn-success" style="float:right;margin-right:35px;">Mua Thêm</a>

</c:if>
 
</div>


         
       
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="<%= request.getContextPath()%>/jsForHomePage/scripts.js"></script>
    </body>
</html>
