
$("#btn1").click(function() {
	const obj = {
		name: "강백호",
		age: "32"
	}

	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
})

$("#btn2").click(function() {
	const obj = {
		name: "손흥민",
		emil: "son@son.com",
		score: 99.99,
		married: false
	}
	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	})
})

$("#btn3").click(function() {
	const data = {
		name: "태웅",
		hobby: [
			"독서",
			"농구",
			"음악감상"
		]
	};
	$.ajax("/sub36/link3", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
})

$("#btn4").click(function() {
	const list = {
		phone: [
			"아이폰",
			"갤럭시",
			"샤오미"
		]
	};
	$.ajax("/sub36/link4", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(list)
	})
})

$("#btn5").click(function() {
	const data = {
		title: "java",
		publisher: "한빛",
		writer: {
			name: "정대만",
			age: 44
		}
	}
	$.ajax("/sub36/link5", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
})

$("#btn6").click(function() {
	const data = {
		city: "Seoul",
		price: 230000,
		etc: {
			name: "박지성",
			email: "jisung@jisung.com",
			score: 99.08,
			married: true
		}
	}
	$.ajax("/sub36/link6", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
})

$("#btn7").click(function(){
	const data = [
	{
		name: "이강인",
		age: 22
	},
	{
		name: "손흥민",
		age: 32
	},
	{
		name: "박지성",
		age: 36 
	}
	]
	$.ajax("/sub36/link7", {
		method:"post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
})
//////////////////////////////////////////////////
$("#btn8").click(function(){
	const name = $("#inputName").val();
	const age = $("#inputAge").val();
	
	const data = {
		name: name,
		age: age
	}
	$.ajax("/sub36/link1", {
		method: "post",
		contentType:"application/json",
		data:JSON.stringify(data)
	})
})


$("#btn9").click(function(){
  const name = $("#inputName2").val();
  const email = $("#inputEmail").val();
  const score = $("#inputScore").val();
  //const married = document.querySelector("#inputMarried2").checked;
  const married = $("#inputMarried2").is(":checked");
  
  
  /*let married = false;
  if($("#checkYes").prop("checked")) {
    married = true;
  }*/
  
  const data = {
    name: name,
    email: email,
    score: score,
    married: married
  }
  
  $.ajax("/sub36/link2", {
    method: "post",
    contentType: "application/json",
    data: JSON.stringify(data)
  });
});

















