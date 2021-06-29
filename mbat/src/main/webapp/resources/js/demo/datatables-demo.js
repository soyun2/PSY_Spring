// Call the dataTables jQuery plugin
$(document).ready(function() {
  $('#freeboardTable').DataTable({
	  order:[[0,"desc"]],
		// 표시 건수기능 숨기기
		lengthChange: false,
		// 검색 기능 숨기기
		searching: true,
		// 정렬 기능 숨기기
		ordering: true,
		// 정보 표시 숨기기
		info: false,
		// 페이징 기능 숨기기
		paging: true
	});
//  	var b = {
//  			a=10,
//  			b=20,
//  			c=function(){},
//  			d=function(){},
//  	};
});
