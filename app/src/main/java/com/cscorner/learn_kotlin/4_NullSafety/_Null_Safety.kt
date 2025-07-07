package com.cscorner.learn_kotlin

.`4_NullSafety`

// --------------------- Null Safety in Kotlin ---------------------

// In Kotlin, variables can't be null by default (null-safe language).

// --------------------- Nullable and Non-Nullable Types ---------------------

// Non-nullable variable (cannot hold null)
//var name1: String = "Aviraj"

// Nullable variable (can hold null, use ? after the type)
//var name2: String? = null

// --------------------- How to Handle NullPointerException ---------------------

// Kotlin forces you to handle nulls safely using special operators.

// --------------------- 4 Null Safety Operators ---------------------

// 1. Safe Call Operator (?.)
// Calls a method only if the variable is not null
//val len1 = name2?.length

// 2. Elvis Operator (?:)
// Provides a default value if the variable is null
//val len2 = name2?.length ?: 0

// 3. Not-null Assertion Operator (!!)
// Crashes if the variable is null (use only if you're sure it's not null)
// Uncomment the next line only if you're sure name2 is not null
// val len3 = name2!!.length

// 4. Safe Cast Operator (as?)
// Safely casts to a type, returns null if it fails
//val obj: Any = "Hello"
//val str: String? = obj as? String

// --------------------- let in Kotlin ---------------------

// let is a scope function used to execute a block of code on an object.
// It is often used to perform operations on nullable variables safely.

// Example of syntax (this is a comment, not executable):
// variable?.let {
//     // Code inside this block runs only if 'variable' is not null
//     // 'it' refers to the variable itself
// }

// --------------------- Example 1: Safe call with let ---------------------

//
//fun main(){
//
//    val name: String? = "Aviraj"
//    name?.let {
//        println("Name is $it") // Only runs if name is not null
//    }
//
//// --------------------- Example 2: let with non-null value ---------------------
//
//    val num = 10
//    val result = num.let {
//        val square = it * it
//        square + 5
//    }
//    println(result) // Output: 105
//
//// --------------------- Example 3: let to avoid NullPointerException ---------------------
//
//    val email: String? = "aviraj@example.com"
//    email?.let {
//        println("Sending email to $it")
//    } // Will not run if email is null
//
//}