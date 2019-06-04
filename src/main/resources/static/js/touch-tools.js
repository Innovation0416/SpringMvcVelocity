$(window).on('touchmove', function() {
		$('#amz-go-top').stop().animate({
			opacity : "0.3"
		}, 1);
		$('#side-bar').stop().animate({
			opacity : "0.3"
		}, 1);
		$('#myCart').stop().animate({
			opacity : "0.3"
		}, 1);
		$('.subscripts').stop().animate({
			opacity : "0.3"
		}, 1);
	});
	$(window).on('touchend', function() {
		$('#amz-go-top').stop().animate({
			opacity : "0.8"
		}, 500);
		$('#side-bar').stop().animate({
			opacity : "0.8"
		}, 500);
		$('#myCart').stop().animate({
			opacity : "0.8"
		}, 500);
		$('.subscripts').stop().animate({
			opacity : "0.8"
		}, 500);
	});