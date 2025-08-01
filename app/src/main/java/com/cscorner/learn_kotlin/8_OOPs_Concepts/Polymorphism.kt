package com.cscorner.learn_kotlin.`8_OOPs_Concepts`


// Polymorphism

// Polymorphism means "many forms".
// One function behaves differently depending on the object calling it.
// We use it when different classes have the same function name but different behavior.

// 1. Method Overriding --> (Same method name in different classes)
// 2. Method Overloading --> (Same function name with different parameters)


// Method Overriding:
// When a child class provides its own version of a function defined in the parent class.
// This is an example of runtime polymorphism.

open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Cat meows")
    }
}

// Method Overloading:
// When we create multiple functions with the same name but different parameters.
// This is an example of compile-time polymorphism.

class Calculator {

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }
}

fun main() {

    // Method Overriding example
    val animal1: Animal = Dog()
    animal1.makeSound() // Output: Dog barks

    val animal2: Animal = Cat()
    animal2.makeSound() // Output: Cat meows

    // Method Overloading example
    val calc = Calculator()
    println(calc.add(2, 3))       // Output: 5
    println(calc.add(1, 2, 3))    // Output: 6
    println(calc.add(2.5, 3.5))   // Output: 6.0
}
