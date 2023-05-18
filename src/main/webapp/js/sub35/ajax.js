$("#button1").click(function() {
	$.ajax("/sub35/link1", {method: "post"})
})

$("#button2").click(function(){
	$.ajax("/sub35/link2", {method: "post"})
})

$("#button3").click(function() {
	$.ajax("/sub35/link3", {
		method: "post", 
		data: "name=손"
		});
})

$("#button4").click(function(){
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=seoul&price=99"
	});
})

$("#button5").click(function(){
	$.ajax("/sub35/link5", {
		method:"post",
		data:"name=aaa&score=89.99&email=aaa@aa.aa"
	})
})

$("#button6").click(function(){
	$.ajax("/sub35/link6", {
		method:"post",
		data:"address=seoul&product=pizza&price=111.44"
	})
})

$("#button7").click(function(){
	const obj = {name: "son"};
	
	$.ajax("/sub35/link7", {
		method: "post",
		//data: '{"name" : "son"}',
		data: JSON.stringify(obj),
		contentType : "application/json"
	})
})

$("#button8").click(function(){
	const obj = {address:"inchen", name:"son"};
	
	$.ajax("/sub35/link8", {
		method: "post",
		//data: '{"address" : "incheon", "name" : "son"}',
		data: JSON.stringify(obj),
		contentType : "application/json"
	})
})

$("#button9").click(function(){
	const obj = {
		age:14, 
		name:"son",
		married:true
	};
	
	$.ajax("/sub35/link9", {
		method: "post",
		//data: '{"age" : 14, "name" : "son", "married" : true}',
		data:JSON.stringify(obj),
		contentType : "application/json"
	})
})

$("#button10").click(function() {
	const obj = {
		address: null,
		age: 30,
		name:"손흥민"
	};
	
	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		//data: `{"address": null, "age": 30, "name": "손흥민"}`
		data: JSON.stringify(obj)
	})
})

$("#button11").click(function() {
	const obj = {
		book: {
			title:"java",
			price:300
		},
		address:"seoul"
	}
	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		//data: `{"book": {"title": "java", "price": 300}, "address": "seoul"}`
		data: JSON.stringify(obj)
	})
})

$("#button12").click(function() {
	const data = {
		food: [
			"pizza",
			"coke",
			"coffee"		
		],
		store: "피자스쿨"
	}
	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		//data: `{"food":["pizza", "coke", "coffee"], "store": "피자스쿨"}`
		data : JSON.stringify(data)
	})
})

$("#button13").click(function() {
	
	const arr = [
			"pizza",
			"cake",
			"coffee"
		]
	
	$.ajax("/sub35/link13", {
		method:"post",
		contentType:"application/json",
		//data : `["pizza", "cake", "coffee"]`
		data : JSON.stringify(arr)
	})
})

$("#button14").click(function() {
	const obj = [
		{
			name:"강백호",
			position:"파포"
		},
		{
			name:"서태웅",
			position:"스포"
		},
		{
			name:"송태섭",
			position:"포인트가드"
		}
		
	]
	$.ajax("/sub35/link14", {
		method: "post",
		contentType: "application/json",
		data: `[{"name":"강백호", "pos":"파포"}, {"name":"서태웅", "pos":"스포"}]`
	})
})






















