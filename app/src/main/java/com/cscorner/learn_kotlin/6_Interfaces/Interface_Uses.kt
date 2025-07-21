package com.cscorner.learn_kotlin.`6_Interfaces`

// 1.Interface with default implementation
//Unlike Java, Kotlin allows default method implementation inside interfaces.
//If a class does not override the method , the default implementation is used.

//Example : Interface with the Default Implementation

//interface WildAnimal{
//    fun makeSound(){
//        println("Animal Sound") // Default Implementation
//    }
//}
//
//class Lion : WildAnimal{ // No need to override unless you want custom behavior
//}
//
//
//fun main(){
//    val cat = Lion()
//    cat.makeSound()
//}


//2. Implementing Multiple Interfaces
// A class can implement multiple interfaces, unlike class inheritance

//interface Engine{
//    fun start(){
//        println("Engine Starts")
//    }
//}
//
//interface Wheels{
//    fun roll(){
//        println("Wheels sre rolling")
//    }
//}
//
//class Car : Engine, Wheels // implement both interfaces
//
//fun main(){
//    val car = Car()
//    car.start() // from engine interface
//    car.roll() // from wheels interface
//}



//  3. Handing Conflicts in Interface

// If multiple interfaces have the same method, you must explicitly override it.
//Example: Resolving Interface Conflicts
//
//interface A{
//    fun show(){
//        println("Interface A")
//    }
//}
//
//interface B {
//    fun show(){
//        println("Interface B")
//    }
//}
//
//class C : A, B{
//    override fun show() {
//        super<A>.show() // Explicitly calling A's method
//    }
//}
//
//fun main(){
//    val c = C()
//    c.show() // Interface A
//}

