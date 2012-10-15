var buttonsListener = buttonsListener || {};

(function($){
    buttonsListener = {
        cleanUpFields: function(form){
            $(form).find(':input').each(function(){
                switch (this.type){
                    case 'text':
                    case 'password':
                        $(this).val('');
                        break;
                }
            });
        },
        cleanUpErrors: function(target){
            $('.ui-state-error').empty();
            $('.error').addClass('hidden');
        },
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
                buttonsListener.cleanUpErrors();
                if(isBlank('#loginField')){
                    $('.ui-state-error').append("Email is a required field<br>");
                    $('.error').removeClass('hidden');
                }
                if(isBlank('#passwordField')){
                    $('.ui-state-error').append("Password is a required field<br>");
                    $('.error').removeClass('hidden');
                }
            });
        },
        init: function(){
            buttonsListener.cleanUpFields("#loginForm");
            buttonsListener.validate(); 
        }
    }
    $(function(){
        buttonsListener.init();
    });
})($)