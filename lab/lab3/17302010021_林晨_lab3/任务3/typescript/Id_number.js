"use strict";
exports.__esModule = true;
var Information;
(function (Information) {
    var index = 2;
    console.log("Id_number information " + index);
})(Information || (Information = {}));
var other;
(function (other) {
    var index = 20;
    console.log("Id_number other " + index);
})(other || (other = {}));
var Id_number = /** @class */ (function () {
    function Id_number() {
    }
    Id_number.prototype.print = function () {
        var message = "Id_number is printed.";
        console.log(message);
    };
    return Id_number;
}());
exports.Id_number = Id_number;
