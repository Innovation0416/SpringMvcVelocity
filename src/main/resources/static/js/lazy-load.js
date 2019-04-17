var startRowNo = 0;
var category = "TEST";

$(function() {
	 getData();
}); 

function getData(){
	var comment ="";
            $.ajax({
                type : "post",
                url : "/ssm/doScroll",
                dataType : "json",
                data: {
                	"items":startRowNo,
                	"category":category
                },
                success : function(data) {
                    $.each(data,function(i,array){
                    	comment += "  <div class='card'>        ";
                    	comment += "  	<div class='blurring dimmable image'>        ";
                    	comment += "  			<div class='ui dimmer'>        ";
                    	comment += "  				<div class='content'>        ";
                    	comment += "  					<div class='center'>        ";
                    	comment += "  						<div class='ui inverted button'>Add Friend</div>        ";
                    	comment += "  					</div>        ";
                    	comment += "  				</div>        ";
                     	comment += "  			</div>        ";
                    	comment += "  			<img src='"+array.img_path+"'>        ";
                    	comment += "  		</div>        ";
                    	comment += "  		<div class='content'>        ";
                    	comment += "  			<a class='header'>"+array.brand+"</a>        ";
                    	comment += "  			<div class='meta'>        ";
                    	comment += "  				<span class='date'        ";
                    	comment += "  					style='overflow: hidden; text-overflow: ellipsis; display: -webkit-box; -webkit-line-clamp: 6; -webkit-box-orient: vertical;'>  ";
                    	comment += "  					"+array.discription+"</span>        ";
                    	comment += "  			</div>        ";
                    	comment += "  		</div>        ";
                    	comment += "  		<div class='extra content'>        ";
                    	comment += "  			<a>  <i class='users icon'></i>        ";
                    	comment += "  				"+array.category+"        ";
                    	comment += "  			</a>        ";
                    	comment += "  		</div>        ";
                     	comment += "  	</div>        ";
                      }); 
                    
                    $("#dataList").append(comment); // 
                }
            });
        
            startRowNo+=30;
}

$(window).scroll(function(){
	　　var scrollTop = $(this).scrollTop();
	　　var scrollHeight = $(document).height();
	　　var windowHeight = $(this).height();
	　　if(scrollTop + windowHeight == scrollHeight){
	　　　　 getData();
	　　}
});

function changeCategory(newCategory){
    startRowNo = 0;
    $("#dataList").html("");
	category=newCategory;
	getData();
}
