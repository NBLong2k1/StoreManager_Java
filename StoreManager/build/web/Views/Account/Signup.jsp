<%-- 
    Document   : Signup
    Created on : Jan 24, 2023, 10:16:38 PM
    Author     : lelon
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SignUp</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/login.css">

        
         <link href="<%= request.getContextPath()%>/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

  
    
        
    </head>
    <body>
        <section class=" gradient-form" style="background-color: #eee;">
            <div class="container h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-xl-10">
                        <div class="card rounded-3 text-black">
                            <div class="row g-0">
                                <div class="col-lg-6">
                                    <div class="card-body p-md-5 mx-md-4">

                                        <div class="text-center">
                                            <img src="<%= request.getContextPath()%>/img/cake-food-logo.png"
                                                 style="width: 100px;" alt="logo">
                                            <h4 class="mt-1 mb-5 pb-1">We are Team 6</h4>
                                        </div>

                                        <form action="<%= request.getContextPath()%>/RegisterController" method="post">
                                            
                                             <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-envelope fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                             
                                                    <input type="email" name="email" id="form3Example3c" class="form-control" placeholder="Enter Your Email" required />
                                                </div>
                                            </div>
                                            
                                                 <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-user fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                
                                                    <input type="text" name="username" id="form3Example3c" class="form-control" placeholder="Enter Username" required />
                                                </div>
                                            </div>
                                            

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                   
                                                    <input type="password" name="password" id="form3Example4c" class="form-control" placeholder="Enter Password" required />
                                                </div>
                                            </div>

                                            <div class="d-flex flex-row align-items-center mb-4">
                                                <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                                                <div class="form-outline flex-fill mb-0">
                                                   
                                                    <input type="password" name="rePassword" id="form3Example4cd" class="form-control" placeholder="Repeat your password" required />
                                                </div>
                                            </div>

                                            
                                            <c:if test="${not empty error_message}">
                                                <div class="alert alert-danger" role="alert">
                                                    ${error_message}
                                                </div>
                                            </c:if>
                                            
                                            <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
                                                <a  href="<%= request.getContextPath()%>/Views/Account/Login.jsp" class="btn btn-outline-danger" style="margin-right: 20px;" >I have Account !</a>
                                                 
                                                <button type="submit" name="customerRegister" class="btn btn-primary btn-lg">Register</button>
                                            </div>
                                            
                                        </form>

                                    </div>
                                </div>
                                <div class="col-lg-6 d-flex align-items-center gradient-custom-2">
                                    <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                                        <img src="<%= request.getContextPath()%>/img/cake-food-logo.png"
                                             style="" alt="logo">
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
