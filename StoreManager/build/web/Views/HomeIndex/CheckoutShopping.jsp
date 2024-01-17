<%-- 
    Document   : BuyProductShopping
    Created on : Mar 9, 2023, 2:20:00 PM
    Author     : notur
--%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
    <section class="h-100 h-custom" style="background-color: #eee;">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col">
              <div class="card">
                <div class="card-body p-4">
      
                  <div class="row">
      
                    <div class="col-lg-7">
                      <h5 class="mb-3"><a href="#!" class="text-body"><i
                            class="fas fa-long-arrow-alt-left me-2"></i>Continue shopping</a></h5>
                      <hr>
      
                      <div class="d-flex justify-content-between align-items-center mb-4">
                        <div> 
                          <p class="mb-1">Shopping cart</p>
                          <p class="mb-0">You have ${numberProduct} items in your cart</p>
                        </div>
                      
                      </div>
       <c:set var="totalPrice" value="0" />
                       <!-- Product Start-->
                          
                       <c:forEach items="${productListCart}" var="list" >  
                            
                            <c:set var = "salary" scope = "session" value = "${list.getKey().getPrice()*list.getValue()}"/>
     <c:set var="totalPrice" value="${totalPrice + salary}" />
                      <div class="card mb-3">
                        <div class="card-body">
                          <div class="d-flex justify-content-between">
                            <div class="d-flex flex-row align-items-center">
                              <div>
                                <img
                                  src="${list.getKey().getProduct_img()}"
                                  class="img-fluid rounded-3" alt="Shopping item" style="width: 65px;">
                              </div>
                              <div class="ms-3">
                                <h5>${list.getKey().getProduct_name()}</h5>
                                <p class="small mb-0">${list.getKey().getDescription()}</p>
                              </div>
                            </div>
                            <div class="d-flex flex-row align-items-center">
                              <div style="width: 50px;">
                                <h5 class="fw-normal mb-0">${list.getValue()}</h5>
                              </div>
                              <div style="width: 80px;">
                                <p class="mb-0">$${salary}</p>
                              </div>
                              <a href="#!" style="color: #cecece;"><i class="fas fa-trash-alt"></i></a>
                            </div>
                          </div>
                        </div>
                      </div>
                      </c:forEach>
                     
                      <!-- Product End -->
                      <a href="<%= request.getContextPath()%>/ShoppingCartController">Back To Cart</a>
                    </div>
                    <div class="col-lg-5">
      
                      <div class="card bg-warning text-white rounded-3">
                        <div class="card-body">
                          <div class="d-flex justify-content-between align-items-center mb-4">
                            <h5 class="mb-0">Card details</h5>
                            <img src="https://mdbcdn.b-cdn.net/img/Photos/Avatars/avatar-6.webp"
                              class="img-fluid rounded-3" style="width: 45px;" alt="Avatar">
                          </div>
      
                          <a href="#!" type="submit" class="text-white"><i
                              class="fab fa-cc-mastercard fa-2x me-2"></i></a>
                          <a href="#!" type="submit" class="text-white"><i
                              class="fab fa-cc-visa fa-2x me-2"></i></a>
                          <a href="#!" type="submit" class="text-white"><i
                              class="fab fa-cc-amex fa-2x me-2"></i></a>
                          <a href="#!" type="submit" class="text-white"><i class="fab fa-cc-paypal fa-2x"></i></a>
      
                          <form action="<%= request.getContextPath()%>/checkoutShoppingController" method="post" class="mt-4">
                            <div class="form-outline form-white mb-4">
                                  <label class="form-label" for="typeName">Họ Và Tên</label>
                                  <input type="text" required="" id="typeName" name="guestName" class="form-control form-control-lg" siez="17"
                                placeholder="Họ Và Tên" />
                             
                            </div>
                           <div class="form-outline form-white mb-4">
                                  <label class="form-label" for="typeName">Email</label>
                              <input type="email" required id="typeName" name="guestEmail" class="form-control form-control-lg" siez="17"
                                placeholder="Enter email" />
                             
                            </div>
                            <div class="form-outline form-white mb-4">
                                  <label class="form-label" for="typeName">Số Điện Thoại</label>
                              <input type="number" required id="typeName" name="guestPhone" class="form-control form-control-lg" siez="17"
                                placeholder="Số Điện Thoại" />
                             
                            </div>
                               <div class="form-outline form-white mb-4">
                                  <label class="form-label" for="typeName">Địa Chỉ</label>
                              <input type="text" id="typeName" required name="guestAddress" class="form-control form-control-lg" siez="17"
                                placeholder="Địa Chỉ" />
                             
                            </div>
                              
                              <div class="form-outline form-white mb-4">
                                  <label class="form-label" for="typeName">Ghi Chú</label>
                              <input type="text" id="typeName"  name="guestNote" class="form-control form-control-lg" siez="17"
                                placeholder="Ghi Chú" />
                             
                            </div>
                             <div class="form-outline form-white mb-4">
                                
                <div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="deliveryWay" id="inlineRadio1" value="0">
  <label class="form-check-label" for="inlineRadio1">Nhận tại cửa hàng</label>
</div>
<div class="form-check form-check-inline">
  <input class="form-check-input" type="radio" name="deliveryWay" id="inlineRadio2" value="1">
  <label class="form-check-label" for="inlineRadio2">Giao hàng</label>
</div>

                                 
                             
                            </div>
      
                            
      
                          
      
                          <hr class="my-4">
      
                          <div   class="d-flex justify-content-between">
                            <p hidden class="mb-2">Subtotal</p>
                            <p hidden class="mb-2"> 0 VNĐ</p>
                          </div>
      
      
                          <div class="d-flex justify-content-between mb-4">
                            <p class="mb-2">Total(Incl. taxes)</p>
                            <input  type="text" hidden name="getTotalPrice"value="${totalPrice}">
                            <h4 class="mb-2"><fmt:formatNumber type = "number" maxFractionDigits = "3" value = "${totalPrice}" /> VNĐ</h4>
                          </div>
      
                          <button type="submit" name="submitCheckoutOrder" class="btn btn-info btn-block btn-lg">
                            <div class="d-flex justify-content-between">
                          
                              <span>Checkout <i class="fas fa-long-arrow-alt-right ms-2"></i></span>
                            </div>
                          </button>
                                </form>
                        </div>
                      </div>
      
                    </div>
      
                  </div>
      
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>


</body>
</html>