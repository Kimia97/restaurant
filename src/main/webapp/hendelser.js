/**
 * Created by Kimia on 20.09.2017.
 */
$(document).ready(function () {
    $('#order').click(function () {
        $.ajax({
            url: 'rest/order',
            type: 'POST',
            data: JSON.stringify({
                    customerid: $("#customerid").val(),
                    guests: $("#guests").val(),
                    appetizer: $("#appetizer").val(),
                    mainCourse: $("#maincourse").val(),
                    dessert: $("#dessert").val(),
                    amountDrink: $("#amountdrink").val(),
                    drink: ""}),
                contentType: 'application/json; charset=utf-8',
                dataType: 'json',
                success: function (result) {
                    alert("You have successfully ordered a table")
                    console.log(result)
                },
                error: function (result) {
                    console.log(result);
                }
        })
    })
});
