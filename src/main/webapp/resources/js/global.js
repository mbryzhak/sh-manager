var GlobalAction = GlobalAction || {}

GlobalAction.clearAllFields = function (form) {
    $(form).find(':input').each(function(){
        switch (this.type){
            case 'text':
            case 'password':
                $(this).val('');
                break;
        }
    });
};

GlobalAction.valueAt = function (target) {
    return $(target).val();
}