var Validator = Validator || {};

(function($){
    Validator = {
        isBlank: function (target) {
            if($(target).val() == ""){
                return true;
            }
        },

        appendError: function (message) {
            $('.ui-state-error').append(message + "<br>");
            $('.error').removeClass('hidden');
        },

        clearErrors: function () {
            $('.ui-state-error').empty();
            $('.error').addClass('hidden');
        }
    }
})($)
