var startRowNo = 0;
var category = 'news';

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
                    	comment += "  <li style='border: 1px solid #dedede;border-width: 1px 0 0 0;' class='am-g am-list-item-desced am-list-item-thumbed am-list-item-thumb-right'> ";
                    	comment += "  	<div class='am-u-sm-8 am-list-main am-fr' style='padding-left:12px;'>       ";
                    	comment += "  		<h3 class='am-list-item-hd'>        ";
                    	comment += "  			<a href='###' style='overflow: hidden; text-overflow: ellipsis; display: -webkit-box; -webkit-line-clamp: 2; -webkit-box-orient: vertical;'>"+array.discription+"</a>";
                    	comment += "  		<div class='am-list-item-text' style='vertical-align:bottom;'>"+array.price+"</div>";
                    	comment += "  	</div> ";
                    	comment += "  	<div class='am-u-sm-4 am-list-thumb am-fl'> ";
                    	comment += "  		<a href='###'> <img style='float:left;' src='"+array.img_path+"' /> ";
                    	comment += "  		</a> ";
                    	comment += "  	 </div>  ";
                    	comment += "  	</li> ";
                      }); 
                	} else {
                		$(window).off('scroll',);
                	}
                    $("#dataList").append(comment); // 
                }
            });
        
            startRowNo+=30;
}

$(window).on('scroll',function(){
	　　var scrollTop = $(this).scrollTop();
	　　var scrollHeight = $(document).height();
	　　var windowHeight = $(this).height();
	  console.log(scrollHeight - scrollTop - windowHeight);
	　　if(scrollHeight - scrollTop - windowHeight < 60){
	　　　　 getData();
	　　}
});

function changeCategory(newCategory){
    startRowNo = 0;
    $("#dataList").html("");
	category = newCategory;
	getData();
}
