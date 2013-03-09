var Rates = Rates || {};

(function($){
    Rates = {
        updateSensorRates: function (rateNumber) {
            $('#updateAllRates').click(function () {
                Rates.showProgressBar();
                $.ajax({
                    url: "/sh-manager/updateRates?rateNumber=" + rateNumber.toString(),
                    type: "POST",
                    data: {requestJson: JSON.stringify(Rates.serializeRates())}
                }).success(function() {
                    Rates.showSuccessfulUpdateMsg();
                }).error(function() {
                    Rates.showErrorUpdateMsg();
                }).always(function(){
                    Rates.hideProgressBar();
                });
            });
        },

        serializeRates: function () {
            var dataObj = {
                sensor1: GlobalAction.valueAt('#sensor1'),
                sensor2: GlobalAction.valueAt('#sensor2'),
                sensor3: GlobalAction.valueAt('#sensor3'),
                sensor4: GlobalAction.valueAt('#sensor4'),
                sensor5: GlobalAction.valueAt('#sensor5')
            }
            return dataObj;
        },

        showErrorUpdateMsg: function () {
            $('#rateUpdateError').removeClass("hidden");
        },

        showSuccessfulUpdateMsg: function () {
            $('#rateUpdateSuccess').removeClass("hidden");
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
        }
    };

    $(function(){
        Rates.initActions();
    })
})($)