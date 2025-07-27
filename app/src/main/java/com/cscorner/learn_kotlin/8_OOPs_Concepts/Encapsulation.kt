package com.cscorner.learn_kotlin.`8_OOPs_Concepts`

/*
  Encapsulation (Data Hiding & Protection)

  Encapsulation is the practice of hiding an object's internal state and requiring all interactions to occur through controlled methods.

  Key Benefits:
  Protects data from external changes.
  Reduces complexity by exposing only necessary details.
  Improved code maintainability.


  Encapsulation can be achieved bu four Access Modifiers:

  1.private -> Only accessible inside the same class.
  2.protected -> Same as private but also accessible same class and subclasses.
  3.internal -> Accessible within the same module.
  4.public -> Accessible everywhere. (Default Modifier)

 */


//  private --> Example

//class Example{
//    private val secret = "Hidden Data"
//
//    private fun showSecret(){
//        println(secret)
//    }
//
//    fun accessSecret(){
//        showSecret() // Allowed within the class
//    }
//}
//
//fun main(){
//    val obj = Example()
//    obj.accessSecret() // Allowed to call private function
////    obj.secret // Error: Cannot access 'secret' outside the class
////    obj.showSecret() // Error: Cannot access private function 'showSecret' outside the class
//}


//  protected (Accessible within the class and subclasses)

//open class ProtectedExample{
//    protected val protectedData = "Protected Data"
//
//    protected fun showProtectedData(){
//        println(protectedData)
//    }
//}
//
//class Child: ProtectedExample(){
//    fun accessProtectedData(){
//        showProtectedData() // Allowed to call protected function
//        println(protectedData) // Allowed to access protected property
//    }
//}
//
//fun main() {
//    val obj = Child()
//    obj.accessProtectedData()
//}

// internal (Accessible within the same module)
//
//internal class Student(val name: String, val rollNo: Int) {
//    fun printDetails() {
//        println("Name: $name, Roll No: $rollNo")
//    }
//}
//fun main(){
//    val student = Student("Aviraj Sharma", 101)
//    student.printDetails()
//}


// public -> Accessible everywhere. (Default Modifier)

//public class Calculator {   // ->> public use karne ki bhi koi jarurat nhi default me public hota hai
//    public fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//}
//
//fun main(){
//    val calculator = Calculator()
//    val result = calculator.add(5, 3)
//    println("Result: $result")
//}
