<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
</head>
<body>
	<h1>전체 고객 리스트</h1>

	<table class="table">
		<thead>
			<tr>
				<th>CustomerId</th>
				<th>CustomerName</th>
				<th>ContactName</th>
				<th>Address</th>
				<th>City</th>
				<th>PostalCode</th>
				<th>Country</th>
				<th>Edit</th>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td><input type="text" values="${ customer.id}"/></td>
					<td><input type="text" values="${ customer.name}"/></td>
					<td><input type="text" values="${ customer.contactName}"/></td>
					<td><input type="text" values="${ customer.address}"/></td>
					<td><input type="text" values="${ customer.city}"/></td>
					<td><input type="text" values="${ customer.postalCode}"/></td>
					<td><input type="text" values="${ customer.country}"/></td>
					<td><button type="submit" onclick="location.href='/sub100/view'">수정하기</button></td>
				</tr>
		</tbody>

	</table>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
</body>
</html>