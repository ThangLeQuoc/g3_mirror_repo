define([
        'jquery'
    ],
    function ($) {
        'use strict';

        var module;

        var ID_PREFIX = '_order';

        var _orderIds = [];
        var _orderItems = {};

        module = {
            processOrder: processOrder,
            getOrder: getOrder
        };

        function processOrder(orderId, orderItem) {
            if (orderId) {
                var idIdx = _orderIds.indexOf(orderId);
                if (idIdx >= 0) {
                    $.extend(true, _orderItems[orderId], orderItem);
                }
            }
            else {
                var lastId;
                var lastIdx = 0;
                if (_orderIds.length > 0) {
                    lastId = _orderIds[_orderIds.length - 1];
                    lastIdx = parseInt(lastId.split(ID_PREFIX).join(''));
                }
                var _orderId = ID_PREFIX + (lastIdx + 1);
                _orderIds.push(_orderId);
                _orderItems[_orderId] = $.extend(true, {}, orderItem);
                return _orderId;
            }
        }

        function getOrder(orderId, isFailSafe, isLastAdded) {
            var _orderId = orderId;
            if (isLastAdded) {
                _orderId = _orderIds[_orderIds.length - 1];
                return $.extend(true, {_orderId: _orderId}, _orderItems[_orderId]);
            }
            var isExist = _orderIds.some(function (_orderId) {
                return (_orderId === orderId);
            });
            _orderId = orderId;
            if (!isExist) {
                if (isFailSafe){
                    _orderId = _orderIds[_orderIds.length - 1];
                    return $.extend(true, {_isOrderExist: isExist, _orderId: orderId}, _orderItems[_orderId]);
                }
                else {
                    throw new Error('Invalid orderId + ' + orderId);
                }
            }
        }

        return module;
    }
);
