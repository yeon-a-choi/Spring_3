/**
 * 
 */
// 내 코드
let btn = document.getElementById("btn");
let title = document.getElementById("title");
let contents = document.getElementById("contents");

btn.addEventListener("click", function(){
	
	let form = document.getElementById("form");
	
	if(title.value!="" && contents.value!=""){
		form.submit();	
	} else {	
		alert('title 또는 contents를 입력해주세요!');
	}
	
});

/* -------------------------------- 
//강사님 코드
let btn = document.getElementById("btn");

let writer = document.getElementById("writer");
let title = document.getElementById("title");

let check1 = writer.value == "admin";
let check2 = title.value != "";

btn.addEventListener("click", function(){
	
	if(check1 && check2){
		form.submit();
	} else{
		alert("입력사항을 확인해주세요!");
	}
	
});*/

