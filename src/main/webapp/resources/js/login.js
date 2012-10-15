var buttonsListener = buttonsListener || {};

(function($){
    buttonsListener = {
        validate: function(){
            $('#cancelBtn').click(function(){
                $.ajax({
                    url: "/sh-manager",
                    success: function(data){
                        $('.result').html(data);
                    }
                }).done(function ( data ) {
                        if( console && console.log ) {
                            console.log("Redirect to main");
                        }
                    });
            });

            $('#loginBtn').click(function(){
                if(isBlank('#loginField')){
                    alert("loginField is required");
                }
                if(isBlank('#passwordField')){
                    alert("passwordField is required");
                }
            });
        },
        init: function(){
            buttonsListener.validate();
        }
    }
    $(function(){
        buttonsListener.init();
    });
})($)