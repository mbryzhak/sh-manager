var Validator = Validator || {};

(function($){
    Validator = {
        isBlank: function (target) {
            if($(target).val() == ""){
                return true;
            }
        },

        appendError: function (message) {
            $('#loginError').append(message + "<br>").removeClass('hidden');
        },

        clearErrors: function () {
            $('#loginError').empty().addClass('hidden');
        }
    }
})($)
