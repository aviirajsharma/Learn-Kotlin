package com.cscorner.learn_kotlin.`8_OOPs_Concepts`

/*

Object Oriented Programming (OOP) consist of four fundamental principles:

1. Abstraction --> Hiding implementation details and showing only the necessary information to the user.
2.Encapsulation --> Wrapping data and functions within an object to protect them from external access.
3.Polymorphism  --> One function, multiple forms.
4.Inheritance --> Creating new classes based on existing classes.


   Abstraction : Hiding implementation details and showing only the necessary information to the user.
   Abstraction is the process of identifying the essential features of an object and ignoring the non-essential details.
   In Kotlin, abstraction is achieved through abstract classes and interfaces.
 */



//1. Example ( using Abstract Class)

//abstract class Vehicle{
//    abstract fun start()// Abstract method (must be implemented by subclasses)
//
//    fun stop(){ // Concrete method (directly available in subclasses)
//        println("Vehicle is stopped")
//    }
//}
//
//class Car : Vehicle(){
//    override fun start() {
//        println("Car is starting")
//    }
//}
//
//fun main(){
//    val myCar = Car()
//    myCar.start() // calls overridden start method
//    myCar.stop() // calls concrete/inherited stop method
//}


//2. Example ( using Interface)
//Interface (100% Abstraction)


interface Flyable{
    fun fly()  // Abstract method (must be implemented by subclasses)
}

class Bird : Flyable{
    override fun fly() {
        println("Bird is flying")
    }
}

fun main(){
    val myBird = Bird()
    myBird.fly()
}