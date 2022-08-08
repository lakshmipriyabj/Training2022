function simple(){
    console.log('Hello From Simple Function')
}

function simpleWithArg(name){
    console.log(name);
}

function simpleWithReturn(name){
    return 'Hello'+name;
}

function invoke(name){
    console.log(simpleWithReturn(name));
}

function simpleWithFunctionAsArg(funRef){

    console.log(funRef);
    var result=funRef;
    console.log(result);
}

callFunc = function(){
    simpleWithFunctionAsArg(simpleWithReturn('sachin')); //value will be printed hellosachin like that
  // simpleWithFunctionAsArg(simpleWithReturn)  //function will print
}


//global fun

var global_a=100;
function sum()
{
    local_c = 300
    var local_b=200
    global_d=100
}


function display(){
    sum()
    console.log(global_a)
   //  console.log(local_b)
    console.log(local_c)
    console.log(global_d)
}