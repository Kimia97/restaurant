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
                    fromTime: $("#fromTime").val(),
                    guests: $("#guests").val(),
                    appetizer: $("#appetizer").val(),
                    mainCourse: $("#maincourse").val(),
                    dessert: $("#dessert").val(),
                    drink: $("#drink").val(),
                    amountDrink: $("#amountDrink").val(),
                }),
                contentType: 'application/json; charset=utf-8',
                dataType: 'json',
                success: function (result) {
                    alert("You have successfully ordered a table!")
                },
                error: function (result) {
                    alert("No tables available at this time, try again");
                }
        })
    })
});
