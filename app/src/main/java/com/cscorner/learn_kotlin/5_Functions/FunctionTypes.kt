package com.cscorner.learn_kotlin.`5_Functions`



//Function --> A block of code that performs a specific task,
// function are reusable and can be called multiple times.


//1. main function (Entry Point)

//fun main(){
//    println("I am MAIN FUNCTION")
//}


//2.USER defined Function

//fun addition (a:Int, b:Int):Int{
//    return a+b;
//}
//
//fun main(){
//     val result = addition(2,3)
//    println(result)
//}


//3.Parametrized function

//
//fun greet(name:String, address:String){
//    println("Hello, $name from $address")
//}
//
//fun main(){
//    greet("Aviraj Sharma", "Gwalior")
//}


//4.Unit Returning Function

//A Function that does not return a value
// (Unit is similar to void in JAVA)

//fun run():Unit{ --> Default
//    println("RUN FAST")
//}
//fun main(){
//    run()
//}


//5.Single Expression Function

//fun square(n:Int) = n * n //No need to return keyword or curly brackets
//
//fun main(){
//    println( square(4))
//}


//6. Explicit Return Type Function (When you write the return type of any function manually)


//fun add(a:Int, b:Int) : Int { //--> here it is
//    return a+b;
//}
//fun main() {
//    println(add(
//        2,4
//    ))
//}

//7. Generic Function (A function that can work with Any Type of Data)

//fun<T> printData(data: T){
//    println("Data--> $data")
//}
//
//fun main(){
//    printData("String")
//    printData(2321)
//    printData(1.32313)
//    printData('s')
//    printData(true)
//}


//8. LAMBDA Function : A function without a name, that can be assigned to variable.

//val greet : (String) -> String = { name -> "Hello, $name"}
//
//
//fun main(){
//    println(greet("Aviraj Sharma"))  // --> Hello, Aviraj Sharma
//}


/*
There is no fun keyword or function name like in regular functions.
        Instead, we directly assign the function to a variable (greet).

{name -> "Hello, $name"} is the lambda expression.
        The part before -> is parameter
        The part after -> ("Hello, $name") is the return value.


        greet is a lambda function that takes a String and return a String.

*/

