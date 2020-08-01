<div class="container">

	<!--  breadcrumb -->
	
 
	<div class="row">
		<div class="col">
		<nav aria-label="breadcrumb">
			<ol class="breadcrumb">
			
				<li  class="breadcrumb-item" aria-current="page"><a href="${contextRoot}/home">Home</a></li>
				<li class="breadcrumb-item"><a href="${contextRoot}/listofproducts">&nbspAllProduct&nbsp</a></li>
				<li class="breadcrumb-item active">${product.name}</li>
				
				
				
			
			</ol>
		
		</nav>
		</div>
	
	
	
	
	</div>
	
	<div class="row">
	
		<!-- display the Product Image -->
		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">
				<img src="${images}/${product.code}.jpg" class="img-thumbnail"/>
				
			
			
			</div>
		
		</div>		
		<!-- Product Discription -->
		<div class="col-sm-8">
			<h3>${product.name}</h3>
			<hr/>
			<p>${product.description}</p>
			<hr/>
			<h4>Price:	<strong> &#8377; ${product.unitPrice} /-</strong></h4>
			<hr/>
			
			<c:choose>
				<c:when test="${product.quantity < 1}">
					<h6>Qty. Available: <span style="color:red">Out Of Stock!</span></h6>
				</c:when>
				
				<c:otherwise>
					<h6>Qty. Available ${product.quantity}</h6>
				</c:otherwise>
				
			</c:choose>
			
			
			<c:choose>
				<c:when test="${product.quantity < 1}">
					<a href="javascript:void(0)" class="btn btn-success bi bi-cart2 disabled"><strike>Add to Cart</strike></a>
				</c:when>
				
				<c:otherwise>
					<a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success bi bi-cart2">Add to Cart</a>
				</c:otherwise>
				
			</c:choose>
			
			
			
			<!--  <a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success bi bi-cart2">Add to Cart</a>-->
			<a href="${contextRoot}/listofproducts" class="btn btn-success">Back</a>
		</div>		
	
	
	</div>


</div>