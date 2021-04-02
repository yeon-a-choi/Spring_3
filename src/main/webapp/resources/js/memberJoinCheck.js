/**
 * 
 */


let all = document.getElementById("all");
let check = document.getElementsByClassName("check");
const btn =  document.getElementById("btn");


btn.addEventListener("click", function(){
	if(all.checked){
		//이 주소로 이동
		location.href="./memberJoin"; //주소창에 직접 치고 가는 것, GET
		
	}else{
		alert("약관 동의는 필수 입니다.");
	}
});


all.addEventListener("click", function(){
	for(let ch of check){
		//전체동의 체크하면 모두 체크되게
		ch.checked = all.checked;
	}
});


for(let ch of check){
	
	ch.addEventListener("click", function(){
		
		let result = true;
		
		for(let c of check){
			if(!c.checked){
				result = false;
				break;
			}		
			
		}
		all.checked = result;
	});
}


/*
function check(){
	//alert("check");
	
	let result = true;
	
	
	//let check = document.getElementsByClassName("check");
	//let all = document.getElementById("all");
	
	for(ch of check){
	
		//checked의 값이 false와 같다면
		if(!ch.checked){
			result = false;
			alert("no check!");
			break;
		}
	}
	
	console.log(result);
	all.checked = result;

}*/