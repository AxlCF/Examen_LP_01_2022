var listar = 'http://localhost:8080/api/productos/all';

$(document).ready(function () {
    cargaDatosProducts();
   

});


function cargaDatosProducts() {

    $.ajax({
        url: listar,
        type: "GET",
        datatype: "JSON",
        success: function (respuesta) {
            var myItems = respuesta;
            var valor = '';
            for (i = 0; i < myItems.length; i++) {
                valor +=
                    '<tr>' +
                    '<td>' + myItems[i].productname + '</td>' +
                    '<td>' + myItems[i].Categoryname + '</td>' +
                    '<td>' + myItems[i].unitsInStock + '</td>' +
                    '</tr > ';


            }
            $('#tbodyProducto').html(valor);
        }

    })
}
