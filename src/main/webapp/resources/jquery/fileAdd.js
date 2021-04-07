/**
 * 
 */

let count=0;

$("#add").click(function(){
	if(count < 5){
		
		let display = $("#sample").html();
		$("#files").append(diplay);
		count++;
		
	} else {
		alert("최대 5개만 가능");
	}
});

//지우기
$("#del").click(function(){
	$("#files").empty();
});

//이벤트 전달(위임)
$("#files").on("click", ".delete", function(){
	$(this).parent().remove();
	count--;
});

