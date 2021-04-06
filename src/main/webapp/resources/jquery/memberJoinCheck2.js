/**
 * 
 */

$("#btn").click(function(){
	
	if($("#all").prop("checked")){
		location.href="./memberJoin";
	}else{
		alert("약관 동의는 필수 입니다.");
	}
	
});

$("#all").click(function(){
	let check = $("#all").prop("checked");
	
	$(".check").prop("checked", check);
	
});


$(".check").each(function(){
	$(".check").click(function(){
		
		let result = true;
		
		$(".check").each(function(){
			
			if(!$(this).prop("checked")){
				result = false;
			}
			
		});
		
		$("#all").prop("checked", result);
		
	});
	
});