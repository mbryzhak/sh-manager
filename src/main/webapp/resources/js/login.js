var LoginController = LoginController || {};

LoginController.initActions = function(){
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
                url: "sh-manager/login.htm",
                type: "POST",
                data: {requestJSON : JSON.stringify(LoginController.serializeLoginForm())},
                success: function(data){
                    Console.log("Success");
                },
                error: function(){
                    Console.log("Error logging in");
                },
                dataType: 'json'
            });
        }
    });
};

LoginController.serializeLoginForm = function(){
    var dataObj = {
        login: GlobalAction.valueAt('#loginField'),
        password: GlobalAction.valueAt('#passwordField')
    }
    return dataObj;
};

LoginController.validate = function(){
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
};

LoginController.init = function() {
    GlobalAction.clearAllFields();
    LoginController.initActions();
}();
