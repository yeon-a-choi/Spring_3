/**
 * 
 */

$(".fileDelete").click(function(){
	//fileNum
	let fileNum = $(this).attr("title");
	let obj = $(this);
	
	let check = confirm("삭제?");
	
	if(check){
	//noticeFileDelete
		$.ajax({
			url:"./fileDelete",
			type: "GET",
			data: {fileNum:fileNum},
			success:function(result){
				
				result = result.trim();
				
				if(result>0){
					alert("삭제 성공");
					$(obj).parent().remove();
					count--;
				} else {
					alert("삭제 실패")
				}
				
			}
			
		});
	}
});