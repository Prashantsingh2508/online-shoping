<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   	
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
     <spring:url var="css" value="/res/css"/>
     <spring:url var="js" value="/res/js"/>
     <spring:url var="images" value="/res/images"/>
     <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>


<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>Online Shopping-${title}</title>
  <script>
  
  window.menu='${title}';
	window.contextRoot='${contextRoot}';
  </script>

  <!-- Bootstrap core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">
  
  <!-- Bootstrap readable Theme CSS
    <link href="${css}/bm.css" rel="stylesheet"> -->
    
      
  <!-- Data Table  Bootstrap -->
  <link href="${css}/dataTables.bootstrap4.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="${css}/shop-homepage.css" rel="stylesheet">

  
 

</head>

<body>

		<div class="wrapper">
  			<!-- Navigation -->
  
			  <%@include file="./shared/navbar.jsp" %>
  
  
 			 <!-- Page Content -->
  				<div class="content">
  					<c:if test="${userClickHome == true}">
  
	 					 <%@include file="home.jsp"%>
	  
  					</c:if>
    			<!-- When User Click aboutus -->
  				<c:if test="${userClickAbout == true }">
  
	  					<%@include file="about.jsp"%>
	  
  				</c:if>
  
     			<!-- When User Click ContactUs -->
  					<c:if test="${userClickContact == true}">
  
	 					 <%@include file="contact.jsp"%>
	  
  					</c:if>
	  
	  				<c:if test="${userClickAllProducts == true or  userClickCategoryProducts == true}">
  
	 					 <%@include file="listproducts.jsp"%>
	  
  					</c:if>
	  
	  				<!-- Load only user click show product -->
	  				<c:if test="${userClickShowProduct == true}">
  
	 					 <%@include file="singleProduct.jsp"%>
	  
  					</c:if>
	  
	  
	  
	  
	  
	  			</div>
	  
	  
				  
			  <!-- /.container/// Footer start from here 
			   <%@include file="./shared/footer.jsp" %>-->
			  <!-- Footer -->
			
			
			  <!-- Bootstrap core JavaScript -->
			  <script src="${js}/jquery.min.js"></script>
			  <script src="${js}/bootstrap.bundle.min.js"></script>
			  
			  <!-- JQUERY DATA TABLE -->
			  	  <script src="${js}/jquery.dataTables.js"></script>
			  	  
			  	  	  <!-- JQUERY bootstrap js DATA TABLE -->
			  	  	  	  <script src="${js}/dataTables.bootstrap4.js"></script>
			  
			  <!-- self coded Javascrpit -->
				 <script src="${js}/myapp.js"></script>
	 	</div> 
</body>

</html>