var Rates = Rates || {};

(function($){
    Rates = {
        updateSensorRates: function (rateNumber) {
            Rates.showProgressBar();
            $.ajax({
                url: "/sh-manager/updateRates?rateNumber=" + rateNumber.toString(),
                type: "POST",
                dataType: "json",
                data: {requestJson: JSON.stringify(Rates.serializeRates())},
                statusCode:{
                    400: function() { //SC_BAD_REQUEST
                        Rates.showErrorUpdateMsg();
                        Rates.hideSuccessfulUpdateMsg();
                    },
                    200: function() { //SC_OK
                        Rates.showSuccessfulUpdateMsg();
                        Rates.hideErrorUpdateMsg();
                    }
                }
            }).always(function(){
                Rates.hideProgressBar();
            });
        },

        serializeRates: function () {
            var dataObj = {
                sensor1: GlobalAction.isEmpty('#sensor1') ? '0' : GlobalAction.valueAt('#sensor1'),
                sensor2: GlobalAction.isEmpty('#sensor2') ? '0' : GlobalAction.valueAt('#sensor2'),
                sensor3: GlobalAction.isEmpty('#sensor3') ? '0' : GlobalAction.valueAt('#sensor3'),
                sensor4: GlobalAction.isEmpty('#sensor4') ? '0' : GlobalAction.valueAt('#sensor4'),
                sensor5: GlobalAction.isEmpty('#sensor5') ? '0' : GlobalAction.valueAt('#sensor5')
            }
            return dataObj;
        },

        validateRates: function () {
            for(var i=1; i<6; i++ ) {
                if(GlobalAction.isEmpty("#sensor" + i.toString())){
                    return false;
                }
            }
            return true;
        },

        showErrorUpdateMsg: function () {
            $('#rateUpdateError').removeClass("hidden");
        },

        hideErrorUpdateMsg: function () {
            $('#rateUpdateError').addClass("hidden");
        },

        showSuccessfulUpdateMsg: function () {
            $('#rateUpdateSuccess').removeClass("hidden");
        },

        hideSuccessfulUpdateMsg: function () {
            $('#rateUpdateSuccess').addClass("hidden");
        },

        showProgressBar: function () {
            $('#rateProgress').removeClass('hidden');
        },

        hideProgressBar: function () {
            $('#rateProgress').addClass('hidden');
        },

        initActions: function () {
            $('#rateUpdateSuccess').find('button').click(function(){
                $('#rateUpdateSuccess').addClass("hidden");
            });
            $('#rateUpdateError').find('button').click(function(){
                $('#rateUpdateError').addClass("hidden");
            });
            $('#updateAllRates').unbind().bind("click", function() {
                Rates.updateSensorRates(0);
            });
        }
    };

    $(function(){
        Rates.initActions();
    })
})($)