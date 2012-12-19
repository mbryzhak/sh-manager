var Validator = Validator || {}

Validator.isBlank = function (target) {
    if($(target).val() == ""){
        return true;
    }
};

Validator.appendError = function (message) {
    $('.ui-state-error').append(message + "<br>");
    $('.error').removeClass('hidden');
};

Validator.clearErrors = function () {
    $('.ui-state-error').empty();
    $('.error').addClass('hidden');
};
