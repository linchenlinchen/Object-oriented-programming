import id = require("./Identify")
namespace Information{
    var index:number = 3
    console.log("Id_student_number information "+index)
}
namespace other{
    var index:number = 30;
    console.log("Id_student_number other "+index)
}
export class Id_student_number implements id.Identify{
    public print(){
        var message:string = "Id_student_number is printed."
        console.log(message);
    }
}