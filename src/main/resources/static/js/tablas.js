$('#marcos').DataTable({
			"language": {
				"emptyTable":			"No hay datos disponibles en la tabla.",
				"info":		   		"Del _START_ al _END_ de _TOTAL_ ",
				"infoEmpty":			"Mostrando 0 registros de un total de 0.",
				"infoFiltered":			"(filtrados de un total de _MAX_ registros)",
				"infoPostFix":			"",
				"lengthMenu":			"Mostrar _MENU_ registros",
				"loadingRecords":		"Cargando...",
				"processing":			"Procesando...",
				"search":			"Buscar:",
				"searchPlaceholder":		"Dato para buscar",
				"zeroRecords":			"No se han encontrado coincidencias.",
				"paginate": {
					"first":			"Primera",
					"last":				"Última",
					"next":				">>",
					"previous":			"<<"
				},
				"aria": {
					"sortAscending":	"Ordenación ascendente",
					"sortDescending":	"Ordenación descendente"
				}
			},
			"lengthMenu":		[[5, 10, 20, 25, 50, -1], [5, 10, 20, 25, 50, "Todos"]],
			"iDisplayLength":	5,
			"columnDefs": [{width: "10px","orderable": false,targets: 1}]
		});




$('#profesorado').DataTable({
	"language": {
		"emptyTable":			"No hay datos disponibles en la tabla.",
		"info":		   		"Del _START_ al _END_ de _TOTAL_ ",
		"infoEmpty":			"Mostrando 0 registros de un total de 0.",
		"infoFiltered":			"(filtrados de un total de _MAX_ registros)",
		"infoPostFix":			"",
		"lengthMenu":			"Mostrar _MENU_ registros",
		"loadingRecords":		"Cargando...",
		"processing":			"Procesando...",
		"search":			"Buscar:",
		"searchPlaceholder":		"Dato para buscar",
		"zeroRecords":			"No se han encontrado coincidencias.",
		"paginate": {
			"first":			"Primera",
			"last":				"Última",
			"next":				">>",
			"previous":			"<<"
		},
		"aria": {
			"sortAscending":	"Ordenación ascendente",
			"sortDescending":	"Ordenación descendente"
		}
	},
	"lengthMenu":		[[5], [5]],
	"iDisplayLength":	5,
	"columnDefs": [ {targets: [3], width: "10px","orderable": false}]
});






$('#corto').DataTable({
	"language": {
		"emptyTable":			"No hay datos disponibles en la tabla.",
		"info":		   		"Del _START_ al _END_ de _TOTAL_ ",
		"infoEmpty":			"Mostrando 0 registros de un total de 0.",
		"infoFiltered":			"(filtrados de un total de _MAX_ registros)",
		"infoPostFix":			"",
		"lengthMenu":			"Mostrar _MENU_ registros",
		"loadingRecords":		"Cargando...",
		"processing":			"Procesando...",
		"search":			"Buscar:",
		"searchPlaceholder":		"Dato para buscar",
		"zeroRecords":			"No se han encontrado coincidencias.",
		"paginate": {
			"first":			"Primera",
			"last":				"Última",
			"next":				">>",
			"previous":			"<<"
		},
		"aria": {
			"sortAscending":	"Ordenación ascendente",
			"sortDescending":	"Ordenación descendente"
		}
	},
	"lengthMenu":		[[5], [5]],
	"iDisplayLength":	5,
	"columnDefs": [ {targets: [2], width: "10px","orderable": false}]
});





