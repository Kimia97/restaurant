/**
 * Created by Kimia on 21.09.2017.
 */
$(document).ready(function () {
    getOrders();
    setInterval(reloadOrders, 10000);

    function reloadOrders() {
        $('#live-panel').DataTable().ajax.reload();
    }
    function getOrders() {
        $('#live-panel').DataTable({
            ajax: {
                url: 'rest/order',
                dataSrc: ''
            },
            columns: [
                {data: 'name'},
                {data: 'customerid'},
                {data: 'guests'},
                {data: 'appetizer'},
                {data: 'mainCourse'},
                {data: 'dessert'},
                {data: 'drink'},
                {data: 'amountDrink'}
            ]
        })
    }

    $("#delete").click(function () {
        $.ajax({
            url: 'rest/order/' + $("#deleteId").val(),
            type: 'DELETE',
            success: function(result) {
                $('#live-panel').DataTable().ajax.reload();
            }
        });
    });
});
