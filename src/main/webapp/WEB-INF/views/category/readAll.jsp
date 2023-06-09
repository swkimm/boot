<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<h1>메뉴 목록</h1>
	
	<form action="/category/addMenu">
		<input type="submit" value="메뉴 추가"/>
	</form>
	<br />
	<form action="/category/deleteMenu">
		<input type="submit" value="메뉴 삭제"/>
	</form>
	<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>메뉴 이름</th>
				<th>소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${categoryList }" var="read">
			<tr>
				<td>${read.categoryId }</td>
				<td>${read.categoryName }</td>
				<td>${read.description }</td>
			</tr>
			</c:forEach>
		</tbody>
		<hr />
	
	</table>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>