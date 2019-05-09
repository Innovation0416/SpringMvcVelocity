var startRowNo = 0;
var category = 'TEST';

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
                	if(null != data && "" != data){
	                    $.each(data,function(i,array){
	                    	comment += "	<div class='am-u-sm-6' style='padding-top:1em;'>                        			  ";
	                    	comment += "		<a href='"+array.link+"'> <img src='"+array.img_path+"' width='100%' height='200px;'>			  ";
	                    	comment += "		</a>                                                                			  ";
	                    	comment += "		<div class='myProduct-content'>                                     			  ";
	                    	comment += "			<h3 class='myProduct-title'>                                    			  ";
	                    	comment += "				<a href='#'>"+array.brand+"</br>"+array.category+"</a>                                 			  ";
	                    	comment += "			</h3>                                                           			  ";
	                    	comment += "			<div class='myProduct-Price'>                                   			  ";
	                    	comment += "				"+array.price_off+" <span>"+array.price+"</span>                                  			  ";
	                    	comment += "			</div>                                                          			  ";
	                    	comment += "		</div>                                                              			  ";
	                    	comment += "	</div>                                                                  			  ";
	                    });
	                    $("#dataList").append(comment);
                	} else {
                		$(window).off('scroll');
                	}
                }
            });
     startRowNo+=30;
}

$(window).on('scroll',function(){
	　　var scrollTop = $(this).scrollTop();
	　　var scrollHeight = $(document).height();
	　　var windowHeight = $(this).height();
	  console.log(scrollHeight - scrollTop - windowHeight);
	　　if(scrollHeight - scrollTop - windowHeight < 700){
	　　　　 getData();
	　　}
});

function changeCategory(newCategory){
	event.stopPropagation();
    startRowNo = 0;
    $("#dataList").html("");
	category = newCategory;
	getData();
}
