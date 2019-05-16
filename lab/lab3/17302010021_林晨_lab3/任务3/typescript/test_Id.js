"use strict";
exports.__esModule = true;
var id_number = require("./Id_number");
var id_student_number = require("./Id_student_number");
function printNumber(printNumber) {
    printNumber.print();
}
printNumber(new id_number.Id_number);
printNumber(new id_student_number.Id_student_number);
