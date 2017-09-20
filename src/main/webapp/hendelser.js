/**
 * Created by Kimia on 20.09.2017.
 */

$(document).ready(function () {
    $('#order').click(function () {
        $.ajax({
            url: 'rest/order',
            type: 'POST',
            data: JSON.stringify({
                name: $("#name").val(),

            })
        })
    })
})
