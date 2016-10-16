$(document).ready(function () {
    $.ajax({
        url: "api/members/list",
        type: "GET"
    }).success(function (data) {
        var tbody = $('#reservations tbody'),
                props = ["id", "age", "eyeColor", "name", "email", "friends"];
        $.each(data, function (i, member) {
            var tr = $('<tr>');
            $.each(props, function (i, prop) {
                $('<td>').html(member[prop]).appendTo(tr);
            });
            tbody.append(tr);

        });


    });
});