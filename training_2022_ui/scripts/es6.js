//arrow func
const show =() =>"Hello"
console.log(show())


const total =(a,b) => a+b
console.log('Total:=' +total(45,55))


const value =(c,d) => c+d
console.log('Value:=' +value[45,55])

const ans =(e,f) => e+f
const ans1=[45,55]
console.log('Answer:=' +ans(...ans1))

//spread
let list1 =[100,200,300]
let list2 =[400,500,600]

const combine =(list1,list2)=>{
    let combine = [...list1,...list2]
    return combine
}
console.log(combine(list1,list2))

//destructor

let employee = {id:101,empName:"Umesh",salary:22000};
const destru1=(obj)=>
{
     let {id,salary} = obj
    console.log(id + ',' +salary)
}
destru1(employee)


const destru2 = (obj) =>{

    let {id,...others} = obj
    console.log(id)
    console.log(others)
}


destru2(employee)