import id = require("./Identify")
namespace Information{
    var index:number = 2
    console.log("Id_number information "+index)
}
namespace other{
    var index:number = 20;
    console.log("Id_number other "+index)
}
export class Id_number implements id.Identify{
    public print(){
        var message:string = "Id_number is printed."
        console.log(message);
    }
}