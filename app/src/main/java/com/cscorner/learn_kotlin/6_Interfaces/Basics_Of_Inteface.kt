package com.cscorner.learn_kotlin.`6_Interfaces`

// -------------------------------------------
// Interface Basics in Kotlin
// -------------------------------------------

// An interface is a blueprint for classes. It can have:
// - Abstract methods (without body)
// - Default methods (with body)
// - Properties (only val; var not allowed directly)
// Classes that implement an interface must provide definitions for abstract methods

// Declare an interface named 'Animal'
interface Animal {

    // Abstract method: no body → must be implemented by implementing class
    fun makeSound()

    // Default method: has a body → optional to override
    fun eat() {
        println("Animal is eating generic food")
    }

    // Property in interface: val only (read-only), no backing field
    val species: String
}

// Another interface to demonstrate multiple inheritance
interface Pet {

    // Abstract method to be implemented
    fun play()

    // Default method
    fun cuddle() {
        println("Pet loves to cuddle")
    }
}

// -------------------------------------------
// Implementing Interfaces in a Class
// -------------------------------------------

// Class 'Dog' implements both 'Animal' and 'Pet' interfaces
class Dog : Animal, Pet {

    // Implement abstract method from Animal interface
    override fun makeSound() {
        println("Dog says: Woof Woof!")
    }

    // Optionally override default method from Animal
    override fun eat() {
        println("Dog eats bones")
    }

    // Implement abstract method from Pet interface
    override fun play() {
        println("Dog is playing fetch")
    }

    // Optionally override cuddle()
    override fun cuddle() {
        println("Dog enjoys belly rubs")
    }

    // Provide value for 'species' property (from Animal interface)
    override val species: String
        get() = "Canine"
}

// -------------------------------------------
// Another class implementing only one interface
// -------------------------------------------
class Cat : Animal {
    override fun makeSound() {
        println("Cat says: Meow")
    }

    // Not overriding eat() → default from Animal will be used

    override val species: String
        get() = "Feline"
}

// -------------------------------------------
// Main Function
// -------------------------------------------
fun main() {
    val dog = Dog()
    println("Dog is a ${dog.species}")
    dog.makeSound()
    dog.eat()
    dog.play()
    dog.cuddle()

    println("-----------")

    val cat = Cat()
    println("Cat is a ${cat.species}")
    cat.makeSound()
    cat.eat() // uses default implementation
}
