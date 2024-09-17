(function ($) {
  "use strict";

	$(document).ready(function() {
		$('#data-table-basic').DataTable({
      columnDefs: [
        { width: "15%", targets: 2 }
      ],
      order: [[1, "asc"]]
    });
	});
})(jQuery);
