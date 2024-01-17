              <%-- 
    Document   : Login
    Created on : Jan 4, 2023, 7:48:07 PM
    Author     : notur
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="<%= request.getContextPath()%>/css/login.css">

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
                                            <h4 class="mt-1 mb-5 pb-1">Administrator Login</h4>
                                        </div>

                                        <form action="<%= request.getContextPath()%>/LoginServlet" method="POST">
                                            <c:if test="${not empty error_message}">
                                                <div class="alert alert-danger" role="alert">
                                                    ${error_message}
                                                </div>
                                            </c:if>
                                            <div class="form-outline mb-4">
                                                <label class="form-label" for="form2Example11">Username</label>
                                                <input type="text" id="form2Example11" class="form-control" name="username"
                                                       placeholder="Enter Username or Email" />

                                            </div>

                                            <div class="form-outline mb-4">
                                                <label class="form-label" for="form2Example22">Password</label>
                                                <input type="password" id="form2Example22" class="form-control" placeholder="Enter Password" name="password"/>

                                            </div>

                                            <div class="text-center pt-1 mb-5 pb-1">
                                                <button name="EmployeeLogin" class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" type="submit">Login</button>
                                                
                                              
                                                
                                                      
    </a>
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
