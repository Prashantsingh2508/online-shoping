<div class="container">

	<div class="row">


		<!--  Would be display Side Bar -->
		<div class="col-md-3">



			<%@include file="./shared/sidebar.jsp"%>





		</div>

		<!--  TO display Actual Products -->
		<div class="col-md-9">
		
		
			<!-- Added Bread Crumb Component -->
			<div class="row">

				<div class="col-lg-12">
					<c:if test="${userClickAllProducts==true}">
							
							<script>
							
									window.categoryId='';
		 							
							</script>
					
						<ol class="breadcrumb">

							<li class="active"><a class="nav-link" id="home"
								href="${contextRoot}/home">Home</a></li>
							<li class="active nav-link">All Products</li>


						</ol>
					</c:if>
					
					
						<c:if test="${userClickCategoryProducts==true}">
							<script>
							
									window.categoryId='${category.id}';
		 							
							</script>
					
						<ol class="breadcrumb">
							
							<li><a href="${contextRoot}/home">Home /</a></li>
						 <li class="active">Category /</li>
							<li class="active">${category.name}</li>

						</ol>
						
					</c:if>



				</div>


			</div>

			
			<div class="row">
			
				<div class="col-xs-12">
				

					<table id="productListTable" class="table table-striped table-borderd">
					
						<thead>
						
								<tr>
									
										<th></th>					
										<th>Name</th>
											<th>Brand</th>
												<th>Price</th>
													<th>Qty. Available</th>
													<th></th>
								</tr>
								
								
						
						
						
						
						
						
						</thead>
						
						
						<tfoot>
						
								<tr>
									
										<th></th>
										<th>Name</th>
											<th>Brand</th>
												<th>Price</th>
													<th>Qty. Available</th>
													<th></th>
								</tr>
						
						
						
						
						</tfoot>
					
					
					</table>				
				
				
				</div>
			
			
			</div>



		</div>





	</div>










</div>