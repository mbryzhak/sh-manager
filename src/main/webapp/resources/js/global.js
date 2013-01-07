var GlobalAction = GlobalAction || {};

(function($){
    GlobalAction = {
        clearAllFields: function (form) {
            $(form).find(':input').each(function(){
                switch (this.type){
                    case 'text':
                    case 'password':
                        $(this).val('');
                        break;
                }
            });
        },

        valueAt: function (target) {
            return $(target).val();
        }
    }
})($)
