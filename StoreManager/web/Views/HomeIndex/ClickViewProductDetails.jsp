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
        <title>Shop Item - Start Bootstrap Template</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="<%= request.getContextPath()%>/assetsForProductDetails/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="<%= request.getContextPath()%>/cssForProductDetails/styles.css" rel="stylesheet" />
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
        <!-- Product section-->
        <section class="py-5">
             <c:if test="${username!=null}">
                               <form action="<%= request.getContextPath()%>/cartForCustomer" method="post">
                                   <input type="text" hidden name="getCustomerUsername" value="${username}"/>
                          </c:if>
                           <c:if test="${username==null}">
                               <form action="<%= request.getContextPath()%>/ProductPageController" method="post">
                          </c:if>
            <div class="container px-4 px-lg-5 my-5">
                <div class="row gx-4 gx-lg-5 align-items-center">
                    <div class="col-md-6"><img class="card-img-top mb-5 mb-md-0" src="${product.getProduct_img()}" width="700px" height="400px" alt="..." /></div>
                    <div class="col-md-6">
                       
                        <h1 class="display-5 fw-bolder">${product.getProduct_name()}</h1>
                        <div class="fs-5 mb-5">
                           <input type="number" name="proId" value="${product.getProduct_id()}"hidden>
                            <span><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${product.getPrice()}" /> VNĐ</span>
                        </div>
                        <p class="lead">${product.getDescription()}</p>
                        <div class="d-flex">
                            <input class="form-control text-center me-3" id="inputQuantity" type="num" name="proQuantity" min="1" value="1" style="max-width: 3rem" />
                            <button class="btn btn-outline-dark flex-shrink-0" type="submit">
                                <i class="bi-cart-fill me-1"></i>
                                Add to cart
                            </button>
                        </div>
                    </div>
                </div>
            </div>
                       </form>  
                        
        </section>
        <!-- Related items section-->
        <section class="py-5 bg-light">
            <div class="container px-4 px-lg-5 mt-5">
                <h2 class="fw-bolder mb-4">Related products</h2>
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                    
                    
                    <% int count =0;%>
                      <c:forEach items="${someProduct}" var="list" > 
                           <%count++;%>
                          <% if(count<5){%>  
                          
                          <c:if test="${username!=null}">
                               <form action="<%= request.getContextPath()%>/cartForCustomer" method="post">
                                   <input type="text" hidden name="getCustomerUsername" value="${username}"/>
                          </c:if>
                           <c:if test="${username==null}">
                               <form action="<%= request.getContextPath()%>/ProductPageController" method="post">
                          </c:if>
                          
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Sale badge-->
                            <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
                            <!-- Product image-->
                            <a href="<%= request.getContextPath()%>/ClickViewProductDetailsController?productID=${list.getProduct_id()}"><img class="card-img-top" src="${list.getProduct_img()}"  width="450" height="200" alt="..." /></a>
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder"> <a style="text-decoration: none;" href="<%= request.getContextPath()%>/ClickViewProductDetailsController?productID=${list.getProduct_id()}">${list.getProduct_name()}</a></h5>
                                    <!-- Product price-->
                                   <input type="number" name="proId" value="${list.getProduct_id()}"hidden>
                                   <input type="number" name="proQuantity" value="1"hidden>
                                  <fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${list.getPrice()}" /> VNĐ 
                                  
                                </div>
                            </div>
                            <!-- Product actions-->
                            <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                <div class="text-center"><button class="btn btn-outline-dark mt-auto" href="#">Add to cart</button></div>
                            </div>
                        </div>
                    </div>
                     </form>  
                       <%}%>  
                     </c:forEach>
                    
                   
                </div>
            </div>
        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2022</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="<%= request.getContextPath()%>/jsForProductDetails/scripts.js"></script>
    </body>
</html>
