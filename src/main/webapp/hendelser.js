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
                drink: $(".checkbox").change(function () {
                    alert($('#'))
                })


            })
        })
    })
});
