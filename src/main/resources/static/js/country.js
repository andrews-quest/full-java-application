
$('document').ready(function(){
    $('table #editButton').on('click', function(event){
        event.preventDefault();
        var href = $(this).attr('href');

        $.get(href, function(country, status){
            $('#country_id_edit').val(country.country_id);
            $('#country_name_edit').val(country.country_name);
            $('#country_capital_edit').val(country.country_capital);
            $('#continent_edit').val(country.continent);
            $('#country_code_edit').val(country.country_code);
            $('#nationality_edit').val(country.nationality);
        });

        $('#editModal').modal();
    });
});