var LoginController = LoginController || {};

(function($){
    LoginController = {
        initActions: function(){
            $('#cancelBtn').click(function(){
                $.ajax({
                    url: "/sh-manager/",
                    success: function(data){
                        $('body').html(data);
                    }
                });
            });
            $('#loginBtn').click(function(){
                Validator.clearErrors();
                if(LoginController.validate()){
                    $.ajax({
                        url: "/sh-manager/login/go.html;",
                        type: "POST",
                        data: {requestJson : JSON.stringify(LoginController.serializeLoginForm())},
                        success: function(responce){
                            $('body').html(responce);
                        }
                    });
                }
            });
        },

        serializeLoginForm: function(){
            var dataObj = {
                login: GlobalAction.valueAt('#loginField'),
                password: GlobalAction.valueAt('#passwordField')
            }
            return dataObj;
        },

        validate: function(){
            var isValid = true;
            if(Validator.isBlank('#loginField')){
                Validator.appendError("Email is a required field");
                isValid = false
            }
            if(Validator.isBlank('#passwordField')){
                Validator.appendError("Password is a required field");
                isValid = false;
            }
            return isValid;
        }
    };

    $(function(){
        GlobalAction.clearAllFields();
        LoginController.initActions();
    });
})($)
