<%@page import="service.FlightServiceImple"%>
<%@page import="service.FlightService"%>
<%@page import="dto.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="flight" class="dto.Flight" scope="session" ></jsp:useBean>    
    
 <%
 		if(session.getAttribute("uname") == null){
			response.sendRedirect("login.jsp?error_msg=Login Again!!!");
		}
	
 	int flightId = Integer.parseInt(request.getParameter("flightId"));
	FlightService flightService = new FlightServiceImple();
 	Flight f1 = flightService.getDetail(flightId);
 %>


<!DOCTYPE html>
<html>
<head>
    <title>Modify-Flights</title>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    />
    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
      integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
      crossorigin="anonymous"
    />
    <script
      src="https://kit.fontawesome.com/0ff6456f25.js"
      crossorigin="anonymous"
    ></script>
    <style>
      body {
        
        background-repeat: no-repeat;
        background-size: cover;
      }

      .img {
        width: 50vh;
        height: 50vh;
        margin-left: 16%;
        margin-top: 40%;
      }

      #icn {
        font-size: 25px;
        margin: 19px;
        color: white;
        cursor: pointer;
      }

      .mobileShow {
        display: inline;
      }

      /* Smartphone Portrait and Landscape */
      @media only screen and (min-device-width: 320px) and (max-device-width: 580px) {
        .mobileShow {
          display: inline;
        }
      }

      .mobileHide {
        display: inline;
      }

      /* Smartphone Portrait and Landscape */
      @media only screen and (min-device-width: 320px) and (max-device-width: 580px) {
        .mobileHide {
          display: none;
        }
      }
    </style>
  </head>
<body>
	<nav
      class="navbar navbar-expand fixed-top text-light navbar-dark bg-dark justify-content-between"
    >
      <div class="nav navbar-nav">
        <!--<a class="nav-item nav-link active" href="#">
          <i class="fa fa-home" aria-hidden="true"></i> Home</a
        >-->
      </div>
      <div class="nav navbar-nav" style="font-family: cursive; font-size: 25px">
        <b> BABA AIRLINES &#9992 </b>
      </div>
      <div class="nav navbar-nav">
         <a class="nav-item nav-link active" href="logout.jsp"><button class="btn btn-danger">Logout</button></a>
      </div>
    </nav>
    
    <div class="container-fluid justify-content-center bg-light align-items-center">
    <div class="row justify-content-center align-items-center my-5">
        <div class="col-10 align-items-center mt-5">
            <div class="dash-header">
                <div class="dash-title">
                    <h1>Update Flight</h1>
                </div>
            </div>
            <div class="text-danger" style='font-size: 15;text-align: center;' >
					<%=(request.getParameter("error_msg")!=null)? request.getParameter("error_msg"):"" %>
					</div>
            <br><br>
            <div class="blog-form">
                <form action="flight_update_Done.jsp" method="post">
                <div class="form-group form-row">
                        <label class="col-md-3"> </label>
                        <div class="col-md-9" style="display:none;">
                        
                            <input type="text" name="flightId" class="form-control" value=<%= flightId %>
                                required>                      
                        </div>
                    </div>
                    <div class="form-group form-row">
                        <label class="col-md-3">Source </label>
                        <div class="col-md-9">
                        
                            <input type="text" name="source" class="form-control" value=<%= f1.getSource() %>
                                required>                      
                        </div>
                    </div>
                    
                    <div class="form-group form-row">
                        <label class="col-md-3">Destination </label>
                        <div class="col-md-9">
                            <input type="text" name="destination" class="form-control" value=<%=f1.getDestination() %>
                                required>                      
                        </div>
                    </div>
                    
                    <div class="form-group form-row">
                        <label class="col-md-3">Date <span class="required"></span></label>
                        <div class="col-md-9">
                            <input type="date" name="date" class="form-control" value=<%= f1.getDate() %>
                                required>                      
                        </div>
                    </div>
                    
                    <div class="form-group form-row">
                        <label class="col-md-3">Time <span class="required"></span></label>
                        <div class="col-md-9">
                            <input type="time" name="time" class="form-control" value=<%= f1.getTime() %>
                                required>                      
                        </div>
                    </div>
                    
                    <div class="form-group form-row">
                        <label class="col-md-3">No of Seats Economy Class </label>
                        <div class="col-md-9">
                            <input type="number" name="seatsEconomy" class="form-control" value=<%= f1.getSeatsEconomy() %>
                                required>                      
                        </div>
                    </div>

                    <div class="form-group form-row">
                        <label class="col-md-3">No of Seats Business Class </label>
                        <div class="col-md-9">
                            <input type="number" name="seatsBuisness" class="form-control" value=<%= f1.getSeatsBuisness() %>
                                required />
                        </div>
                    </div>
                    
                    <div class="form-group form-row">
                        <label class="col-md-3">Economy Class Fare (Rs)</label>
                        <div class="col-md-9">
                            <input type="text" name="amountEconomy" class="form-control" value=<%= f1.getAmountEconomy() %>
                                required />
                        </div>
                    </div>
                    
                     <div class="form-group form-row">
                        <label class="col-md-3">Business Class Fare (Rs)</label>
                        <div class="col-md-9">
                            <input type="text" name="amountBuisness" class="form-control" value=<%= f1.getAmountBuisness() %>
                                required />
                        </div>
                    </div>
                           
                    <div class="form-group form-row">
                        <label class="col-md-3"></label>
                        <div class="col-md-9">
                            <input type="hidden">
                            <button type="submit"  class="btn btn-primary">Save</button>
                          	<button   class="btn btn-danger" onclick="manageFlight.jsp">Cancel</button>
                        </div>
                                          
                        
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
    <footer class="page-footer font-small bg-dark text-light fixed-bottom">
      <div class="footer-copyright text-center">Created by : SUPER30</div>
      <!-- Copyright -->
      <div class="footer-copyright text-center">
        © 2020 Copyright:
        <a href="https://mdbootstrap.com/"> CDAC</a>
      </div>
      <!-- Copyright -->
    </footer>
</body>
</html>