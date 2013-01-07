var LoginController = LoginController || {};

(function($){
    LoginController = {
        initActions: function(){
            $('#cancelBtn').click(function(){
                $.ajax({
                    url: "/sh-manager/",
                    success: function(data){
                        $('body').html(data);
    //                alert("Load was performed");
                    }
    //        }).done(function ( data ) {
    //                if( console && console.log ) {
    //                    console.log("Redirect to main");
    //                }
    //            });
                });
            });
            $('#loginBtn').click(function(){
                Validator.clearErrors();
                if(LoginController.validate()){
                    $.ajax({
                        url: "/sh-manager/login/go.html;",
                        type: "POST",
                        data: {requestJSON : JSON.stringify(LoginController.serializeLoginForm())},
                        success: function(data){
                            console.log("Success");
                        },
                        error: function(){
                            console.log("Error logging in");
                        },
                        dataType: 'json'
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
