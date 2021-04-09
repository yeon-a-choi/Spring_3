/**
 * js로 값을 가져올 때는 무조건 value로 값 불러오기!
 */
// 아이디 글자 수 비교
let id = document.getElementById("id");
let idResult = document.getElementById("idResult");
let message = "6글자 미만입니다.";
let c = "r1"

id.addEventListener("blur", function(){
	
	
	
	if(id.value.length > 5){
		message = "6글자 이상입니다.";
		c = "r2";
		idCheckResult = true;
	} else{
		message = "6글자 미만입니다.";
		c = "r1";
		idCheckResult=false;
	}
	
	console.log(idResult);
	
	idResult.innerText = message;
	idResult.setAttribute("class", c);
});


/* --------------------------------------- */
// 비밀번호/비밀번호확인 글자 수 비교

let pw = document.getElementById("pw");
let pw2 = document.getElementById("pw2");
let pwResult = document.getElementById("pwResult");
let message2 = "8글자 미만입니다.";
let color = "r1";


//비밀번호 비교
pw.addEventListener("blur", function(){
		if(pw.value.length > 7){
			message2 = "8글자 이상입니다.";
			color = "r2";
		} else{
			message2 = "8글자 미만입니다.";
			color = "r1";
		}
		
		pwResult.innerText = message2;
		pwResult.setAttribute("class", color);
});

/* ---------------------------------------- */
// 비밀번호가 바뀌면 실행하는 이벤트
//비밀번호 바뀌기
pw.addEventListener("change", function(){
	if(pw.value!="" & pw2.value!=""){
		if(pw.value != pw2.value){
			pw2.value = "";
			alert('비밀번호가 같지 않습니다!');
		}
	}
});


/* -------------- 위와 함께 쓰임 ----------------- */
// 비밀번호 두개 값 비교

pw2.addEventListener("blur", function(){
	if(pw.value != pw2.value){
		alert('비밀번호가 같지 않습니다!');
		pw2.value = "";
	}
});


/* ---------------------------------------- */
// 강제 이벤트 발생(submit, focus)
// 내가 한 코드

let btn = document.getElementById("btn");
let name = document.getElementById("name");
let phone = document.getElementById("phone");
let email = document.getElementById("email");

//이메일 인지 아닌지 확인하려 했으나 실패
/*
.toString
let emailNum = email.lastIndexOf('@');
let emailCheck = email.substring(emailNum);*/

//console.log(emailNum);

btn.addEventListener("click", function(){
	//조건이 만족하면 서버로 보내고 만족하지 않으면 보내지않음.
	let frm = document.getElementById("frm");
	
	
	if(id.value == "" || id.value.length<6){
		alert("id를 입력하지않았거나, id가 6글자보다 작습니다.");
		//focus를 사용해서 입력하지 않았거나, 올바르지 않은 정보 입력 시 해당 input칸으로 이동
		id.focus();
	} else if(pw.value == ""){
		alert("pw를 입력하지않았습니다!");
		pw.focus();
	} else if(name.value == ""){
		alert("name을 입력하지않았습니다!");
		name.focus();
	} else if(phone.value == ""){
		alert("phone을 입력하지않았습니다!");
		phone.focus();
	  // || emailNum == -1
	} else if(email.value == ""){
		alert("email을 입력하지않았거나, 올바르지않은 이메일주소입니다!");
		email.focus();
	} else if(id.value != "" && id.value.length>5 && pw.value != "" && name.value != "" && phone.value != "" && email.value != ""){
		//db로 값 넘기기 위해선 주석해제
		frm.submit(); 
	}
		
		//test용 alert
		//alert('회원가입 가능!');
	
});

let idCheckResult = false; // id check 결과

//ID 확인
$("#id").blur(function(){
	let id = $("#id").val();
	$.get("./memberIdCheck?id="+id, function(result){
		result = result.trim();
		let str = "사용가능한 ID 입니다."
		
		if(result='0'){
			str = "중복 ID 입니다.";
		}
		
		$("#idCheckResult").html(str);
	});
});



/* ------------------- 위에 이어서 --------------------- */
//강사님 코드
//let idCheckResult = false; //id check 결과
//let pwCheckResult = false; //pw check 결과
//let pwEqualResult = false; //pw equal 결과
//let etcResult = false;	   //name, email, phone 결과

//로 변수를 선언해서 값 넣어서 결과를 내셨음.
