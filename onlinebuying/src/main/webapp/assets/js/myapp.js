
	
	
	
	$(function(){
	
		//Solving Active Menu Problem
		switch(menu){
		
		case'About us':
			$('#about').addClass('active');
			break;
		case'Contact us':
			$('#contact').addClass('active');
			break;
			
		case'ListOfProducts':
			$('#ListOfProducts').addClass('active');
			break;
		default:
			if (menu == "home")
				break;
			$('#ListOfProducts').addClass('active');
			$('#a_'+menu).addClass('active')
		break;
			
//		case'About us':
//			$('#about').addClass('active');
//			break;
//		
		
		
		}
	

	
		//Execute below table only we have this table
		var $table = $('#productListTable');
		if($table.length){ 
			
							var jasonUrl = '';
							if(window.categoryId == ''){
								
								jasonUrl=window.contextRoot + '/json/data/all/products';
							
								
							}
							else if(window.categoryId == 1){
								jasonUrl=window.contextRoot + '/json/data/category/1/products';
							
								
							}
							else if(window.categoryId == '3'){
								jasonUrl=window.contextRoot + '/json/data/category/3/products';
							
								
							}
			
			
			
							$table.DataTable({
							lengthMenu : [ [ 3, 5, 10, -1 ],[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
							pageLength : 5,
							ajax :{
								url : jasonUrl,
								dataSrc : ''
							},
							
							columns: [
								{
									data : 'code',
									bSortable : false,
									mRender : function(data, type, row) {

										return '<img src="' + window.contextRoot
												+ '/res/images/' + data
												+ '.jpg" class="dataTableImg"/>';

									}
								},
								
										{
											data: 'name'
										},
								
										{
											data: 'brand'
										},

										{
											data: 'unitPrice',
											mRender : function(data, type, row) {
													return '&#8377;' + data
												}
										},
										{
											data: 'quantity',
												mRender : function(data,type,row){
													
													if(data<1){
														
														return '<span style="color:red">Out Of Stock!</span>';
													}
													return data;
												}
										},
										{
											data: 'id',
											bSortable: false,
												mRender : function(data, type, row) {
													var str ='';
													str += '<a href="'+window.contextRoot+ '/show/'+data+'/listofproducts" class="btn btn-primary"><span  class="glyphicon glyphicon-eye-open"></span>Look</a> &#160;';
													
													if(row.quantity < 1){
														
														str += '<a href="javascript:void(0)" class="btn btn-success disabled"><strike>Cart</strike></a>';
														
													}
													else{
														
														str += '<a href="'+window.contextRoot+ '/cart/add/'+data+'/listofproducts" class="btn btn-success">Cart</a>';
													}
													
													
													//str += '<a href="'+window.contextRoot+ '/cart/add/'+data+'/listofproducts" class="btn btn-success">Cart</a>';
													return str;
												}
												
										}
							]
								
							});
							
		}
	
});
