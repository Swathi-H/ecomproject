<script type="text/javascript" src="${js}/productajax.js"></script>
<div class="container-fluid">
	<div class="row">
		<div class="col-sm-1"></div>
		<div class="col-sm-10">
		<div class="row">
		<div class="col-sm-2"></div>
		<div class="col-sm-8">
		<c:if test="${added==true}">
		<div class="alert alert-success alert-dismissable">
  <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  <strong>Success!</strong> Added to cart
</div>
</c:if>
		</div>
		<div class="col-sm-2"></div>
		
		</div>
			<table class="table table-hover" id="producttable">
				<thead>
					<tr>
						<th>Product Name</th>
						<th>Product Price</th>
						<th>Image</th>
						<th></th>
						<th></th>
						<th></th>
						
					</tr>
				</thead>
				<tfoot>
					<tr>
						<th>Product Name</th>
						<th>Product Price</th>
						<th>Image</th>
						<th></th>
						<th></th>
						<th></th>
					</tr>
				</tfoot>

			</table>
		</div>
		<div class="col-sm-1"></div>
	</div>
</div>