var LoginController = LoginController || {};

(function($){
    LoginController = {
        initActions: function(){
            $('#cancelBtn').click(function(){
                GlobalAction.clearAllFields();
                Validator.clearErrors();
            });
            $('#loginBtn').click(function(){
                Validator.clearErrors();
//                LoginController.validate();
            });
        },
//
//        serializeLoginForm: function(){
//            var dataObj = {
//                login: GlobalAction.valueAt('#loginField'),
//                password: GlobalAction.valueAt('#passwordField')
//            }
//            return dataObj;
//        },

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
