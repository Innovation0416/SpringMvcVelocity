function requestItemDetails(id){
	var id = id;
	$.ajax({
        type : "post",
        url : "/ssm/doRequestItemDetalis",
        dataType : "json",
        data: {
        	"id":id
        },
        success : function(data) {
        }
    });
}