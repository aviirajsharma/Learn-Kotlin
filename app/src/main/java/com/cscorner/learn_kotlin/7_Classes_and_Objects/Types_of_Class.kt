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

sealed class Shape{

}
