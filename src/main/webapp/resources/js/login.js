var LoginController = LoginController || {};

(function($){
    LoginController = {
        initActions: function(){
            $('#login-btn').click(function(){
                Validator.clearErrors();
            });
        },

        validate: function(){
            var isValid = true;
            if(Validator.isBlank('#inputEmail')){
                Validator.appendError("Email is a required field");
                isValid = false
            }
            if(Validator.isBlank('#inputPassword')){
                Validator.appendError("Password is a required field");
                isValid = false;
            }
            return isValid;
        }
    };

    $(function(){
        LoginController.initActions();
    });
})($)
