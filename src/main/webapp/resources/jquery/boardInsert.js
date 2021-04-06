/**
 * 
 */

$("#btn").click(function(){
/*	let title = $("#title").val().length != 0;
	let writer = $("#writer").val().length != 0;
	let contents = $("#contents").val().length != 0;*/

	let result = true;

	$(".myCheck").each(function(s1, s2){
		console.log(s1);
		console.log($(s2).val());
		console.log($(this).val());
		
		if($(this).val() == ""){
			result = false;
		}
		
		
	});
	
	
	if(result){
		$("#form").submit();
	} else {
		alert("빈칸이 존재합니다!");
	}
	
	
});