// function itsMe(){
//     console.log('Hii')

// }


var myobj ={}

myobj.itsMe = function(){
    console.log("Hi")
}

myobj.author = 'Priya'


var ourObj={
    designer:'lakshmi',
    showDesigner:function(){
       // console.log(this.designer)
       return this.designer
    }
}

var Employee = function(employeId,employeName)
{
    this.employeId = employeId;
    this.employeName=employeName;
}

var ram = new Employee(101,'Rahul')

function setContent(){
    var ele = document.getElementById("author");
    ele.innerHTML = myobj.author;

    var title = document.getElementById("heading");
    title.innerHTML = ourObj.designer;
}