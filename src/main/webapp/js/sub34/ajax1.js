
$("#button1").click(function(){
	$.ajax("/sub34/link1");
})

$("#button2").click(function(){
	$.ajax("/sub34/link2");
})

$("#button3").click(function(){
	$.ajax("/sub34/link3?name=son");
})

$("#button4").click(function(){
	$.ajax("/sub34/link4?address=seoul");
})

$("#button5").click(function(){
	$.ajax("/sub34/link5?name=손&age=22");
})

$("#button6").click(function(){
	$.ajax("/sub34/link6?food=자장면&price=6500")
})

$("#button7").click(function(){
	$.ajax("/sub34/link7?address=seoul&name=park&age=33")
})

$("#button8").click(function(){
	$.ajax("/sub34/link8?price=18000&product=책&category=도서")
})