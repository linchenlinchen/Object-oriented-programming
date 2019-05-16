import id = require("./Identify")
import id_number = require("./Id_number")
import id_student_number = require("./Id_student_number")

function printNumber(printNumber:id.Identify){
    printNumber.print();
}

printNumber(new id_number.Id_number)
printNumber(new id_student_number.Id_student_number)