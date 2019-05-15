var counter = 0;
$(function() {
	$('.add-item').click(function() {
		var flyElm = $('.itemDetail').clone().css('opacity', '0.8');
		flyElm.css({
			'z-index' : 9000,
			'display' : 'block',
			'position' : 'absolute',
			'top' : $('.itemDetail').offset().top + 'px',
			'left' : $('.itemDetail').offset().left + 'px',
			'width' : $('.itemDetail').width() + 'px',
			'height' : $('.itemDetail').height() + 'px'
		});
		$('body').append(flyElm);
		flyElm.animate({
			top : $('.shopping-cart').offset().top,
			left : $('.shopping-cart').offset().left,
			width : 2,
			height : 2,
		}, 600, function() {
			flyElm.remove();
		});
		counter += 1;
		var w1 = '<div class="subscripts">' + counter + '</div>'
		$('.counter').html(w1);
	});
});