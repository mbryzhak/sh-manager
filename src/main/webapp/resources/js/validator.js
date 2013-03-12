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
        },

        validateNumber: function (evt) {
            var theEvent = evt || window.event;
            var key = theEvent.keyCode || theEvent.which;
            key = String.fromCharCode( key );
            var regex = /[^a-zA-Z,]/;
            if( !regex.test(key) ) {
                theEvent.returnValue = false;
                if(theEvent.preventDefault) theEvent.preventDefault();
            }
        }
    }
})($)
