package com.cscorner.learn_kotlin.`7_Classes_and_Objects`

//Types of Classes in Kotlin (Kotlin offers different types of classes depending on use cases)

//1. Data Class :-
// It used to store/hold data, and automatically provides useful methods like toString(), copy(), equals(), etc.

//data class User(
//    val name: String,
//    val age: Int
//)
//
//fun main(){
//    val u1 = User("Aviraj Sharma", 18)
//    val u2 = User("Shivam Sharma", 19)
//
//    println(u1)//---> User(name=Aviraj Sharma, age=18)
//    println(u1.name)//---> Aviraj Sharma
//    println(u1.age)//---> 18
//    println(u2)//---> User(name=Shivam Sharma, age=19)
//    println(u2.name)//---> Shivam Sharma
//    println(u2.age)//---> 19
//}


//2.Enum Class : (Used for defining constant values

//enum class DAY{
//    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//}
//
//fun main(){
//    val today = DAY.Tuesday
//    println("Today is $today")
//    if(today == DAY.Tuesday){
//        println("JAI BAJRANG BALI")
//    }else{
//        println("JAI SHREE RAM")
//    }
//}

//3. Sealed Class (A sealed class is like an enum nut with more flexibility, used for defining restricted hierarchies.

//A sealed class is a restricted class hierarchy that lets you define a limited set of subclasses.
//All the subclasses must be defined in the same file.
//It’s like saying: “Here are the only possible types you can have.

//
//sealed class Shape{
//    class Circle(val radius: Double) : Shape()
//    class Rectangle(val width: Double, val height: Double) : Shape()
//    class Triangle(val base: Double, val height: Double) : Shape()
//
//}
//
//fun printArea(shape: Shape) {
//    when (shape) {
//        is Shape.Circle -> println("Circle Area: ${Math.PI * shape.radius * shape.radius}")
//        is Shape.Rectangle -> println("Rectangle Area: ${shape.width * shape.height}")
//        is Shape.Triangle -> println("Triangle Area: ${0.5 * shape.base * shape.height}")
//    }
//}
//
//fun main(){
//    val shape = Shape.Circle(3.0)
//    printArea(shape)
//}


//4. Abstract Class (An abstract class cannot be instantiated, but must be inherited.
//
//abstract class Animal{
//    abstract fun makeSound() --> ye fun banana hi padega
//}
//
//class Dog : Animal(){
//    override fun makeSound() {
//        println("Dog Barks")
//    }
//}
//
//fun main(){
//    val dog = Dog()
//    dog.makeSound()
//}


//Use Case : When you want to enforce a common structure for child class.


//5.Singleton Class: (A singleton class is a class that can have only one instance.)
//
object Database{
    fun connect(){
        println("Database connected")
    }
}
fun main(){
    Database.connect() //--> Object banane ki koi jarurat nhii
    //bina instance banaye globally access kar skte hai
}