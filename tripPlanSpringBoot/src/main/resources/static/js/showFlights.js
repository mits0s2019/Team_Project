$(document).ready(function () {

    function testAjax(handleData) {
        $.ajax({
            type: "GET",
            url: "returnFlights",
            dataType: "json",
            success: function (data) {
                handleData(data);
            }
        });
    }
    ;
    
    testAjax(function (obj) {
        console.log(obj);
       const places= obj.Places;
       const carriers= obj.Carriers;
       const quotes= obj.Quotes;
       const routes= obj.Routes;
       

    });

});

