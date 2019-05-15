var startRowNo = 0;
var category = 'TEST';
var sex = 1;

$(function() {
    var paramCategory = GetRequest();
    if (!$.isEmptyObject(paramCategory)) {
    	category = paramCategory['category'];
    	sex = paramCategory['sex'];
    	if (sex == 2){
    		$('#men').removeClass('am-active');
    		$('#women').addClass('am-active');
    		$('#menPage').removeClass('am-active am-in');
    		$('#womenPage').addClass('am-active am-in');
    	}
    }
	 getData();
}); 

function changeSex(newSex) {
	startRowNo = 0;
	if(newSex == 1) {
		$("#dataList").html("");	
	}
	if(newSex == 2) {
		$("#dataList2").html("");
	}
	sex = newSex;
	getData();
}

function getData(){
	var comment ="";
            $.ajax({
                type : "post",
                url : "/ssm/doScroll",
                dataType : "json",
                data: {
                	"items":startRowNo,
                	"category":category,
                	"sex":sex
                },
                success : function(data) {
                	if(null != data && "" != data){
	                    $.each(data,function(i,array){
	                    	comment += "	<div class='am-u-sm-6' style='padding-top:1em;'>                        			         	 ";
	                    	if (array.stock == 0) {
	                    		comment += "  	<div class='img-box'>       																 ";
	                    	}
	                    	comment += "			<a href='/ssm/doGetItemDetails' onclick='requestItemDetails(&apos;"+array.id+"&apos;)'>  ";
	                    	comment += "				<img src='"+array.img_path+"' width='100%' height='200px;'> 				         ";
	                    	if (array.stock == 0) {
	                    		comment += "  			<div class='mask'>sold out</div>       												 ";
	                    	}
	                    	comment += "			</a>                                                                			         ";
	                    	if (array.stock == 0) {
	                    		comment += "  	</div>       																				 ";
	                    	}
	                    	comment += "		<div class='myProduct-content'>                                     			             ";
	                    	comment += "			<h3 class='myProduct-title'>                                    			             ";
	                    	comment += "				<a href='#'>"+array.brand+"</br>"+array.category+"</a>                               ";
	                    	comment += "			</h3>                                                           			             ";
	                    	comment += "			<div class='myProduct-Price'>                                   			             ";
	                    	comment += "				"+array.price_off+" <span>"+array.price+"</span>                                     ";
	                    	comment += "			</div>                                                          			             ";
	                    	comment += "		</div>                                                              			             ";
	                    	comment += "	</div>                                                                  			             ";
	                    });
	                    if (sex==1) {
	                    	$("#dataList").append(comment);
	                    }
	                    if (sex==2) {
	                    	$("#dataList2").append(comment);
	                    }
                	} else {
                		$(window).off('scroll');
                		$(window).off('touchmove');
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
    $("#dataList2").html("");
    if (newCategory != null) {
    	category = newCategory;
    }
	getData();
}
