package com.cscorner.learn_kotlin.`7_Classes_and_Objects`


/*
1. What is a Class?
A class in Kotlin is a blueprint for creating objects. It defines:

    Properties (variables)
    Methods (Functions) that operate on those properties

Think of a class like a car blueprint – it tells how the car should be built but isn’t an actual car yet.

*/

//2. How to create a class
//class Person(){
//    fun sayHello(){
//        println("Hello")
//    }
//}


//3. What is an Object?
//An object is an instance of a class.
//You need an object to access a class's properties and methods.

//fun main() {
//    val aviraj = Person()
//    aviraj.sayHello()
//}

/*
4.Constructor in Kotlin

A Constructor is a special function that is used to initialize a class when an object is created.
Types of Constructor
Primary Constructor
Secondary Constructor
*/

//Example  -->

//1. Primary Constructor (A Primary Constructor is declared in the class header using the constructor keyword)

//
//class Student constructor(val name: String, val age: Int){ // constructor keyword ki koi jarurat nahi
//    fun display(){
//        println("Name: $name, Age: $age")
//    }
//}
//
//fun main(){
//    val std = Student("Aviraj Sharma", 18)
//    std.display()
//}


//2. Secondary Constructor (A Secondary Constructor is declared in the class body using the constructor keyword)


//class Employee{
//    val emplName: String
//    val age : Int
//
//    constructor(name:String,age: Int){
//        this.emplName = name
//        this.age = age
//    }
//
//    fun display(){
//        println("Employee Name: $emplName and Age: $age")
//    }
//}
//
//fun main(){
//    val e = Employee(name = "Aviraj Sharma", age = 18)
//    e.display()
//}


//3.  init Block (For Extra Initialization)

// The block is executed as soon as the object is created, before any other function run.

class Car(val brand: String, val model: Int){
    fun drive(){
        println("Drives $brand Brand Car")
    }
    init {
        println("This is INIT BLOCK, I have a $brand car which i bought in $model.") // Sabse pehle execute hoga
    }
    fun wash(){
        println("Wash Car which have $model model")
    }
}

fun main(){
    val c = Car("Toyota", 2020) // Automatically init block run ho jayega object ke bante hii
    println("Hello how are you i am under the water please help me")


    //Output:
    // This is INIT BLOCK, I have a Toyota car which i bought in 2020.
    //Hello how are you i am under the water please help me
}




