<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib   prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   	
     <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
     <spring:url var="css" value="/res/css"/>
     
     
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
		
						<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
						    <div class="container">
						      <a class="navbar-brand" id="home" href="${contextRoot}/home">HOME</a>
						      
						    </div>
						  </nav>
			
 			 <!-- Page Content -->
  				<div class="content">
					
						<div class="container">
							<div class="row">
								<div class="col-xs-12">
									<div class="jumbotron jumbotron-fluid">
										<h1>${errorTitle}</h1>
										<hr/>
										<blockquote style="word-wrap:break-word">
											${errorDescription}
										
										</blockquote>									
									
									</div>
								
								</div>
							
							</div>
						
						</div>  			
	  			</div>
			  
			
	 	</div> 
</body>

</html>