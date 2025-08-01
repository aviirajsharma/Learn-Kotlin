package com.cscorner.learn_kotlin.`8_OOPs_Concepts`


// InheritanceExample.kt
// Inheritance means one class (child) can use the properties and functions of another class (parent).
// We use it to avoid repeating code and build a relationship between classes.


// Parent class (Super class)
//open class Animal {
//    // Function that can be overridden by child class
//    open fun makeSound() {
//        println("Animal makes a sound")
//    }
//
//    fun sleep() {
//        println("Animal is sleeping")
//    }
//}
//
//// Child class inheriting from Animal
//class Dog : Animal() {
//    // Overriding the makeSound function
//    override fun makeSound() {
//        println("Dog barks")
//    }
//}
//
//// Entry point of the program
//fun main() {
//    val dog = Dog()
//
//    // Inherited function
//    dog.sleep() // Output: Animal is sleeping
//
//    // Overridden function
//    dog.makeSound() // Output: Dog barks
//}
