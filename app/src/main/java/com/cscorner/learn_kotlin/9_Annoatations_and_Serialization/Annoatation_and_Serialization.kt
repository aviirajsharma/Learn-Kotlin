package com.cscorner.learn_kotlin.`9_Annoatations_and_Serialization`

// ============================
// ✅ Annotations in Kotlin
// ============================

// 📌 Definition:
// Annotations are special instructions (like tags or labels) that we put above classes, functions, or variables.
// They provide extra information to the compiler or external tools.
// They do not change the actual code behavior directly.

// 📌 Real Life Example:
// @Deprecated — tells that a function should not be used anymore
// @SerializedName — maps a JSON key to a variable name
// @Inject — used in dependency injection (e.g., with Dagger or Hilt)
// @Composable — marks a function as a Jetpack Compose UI function
// @Parcelize — auto-generates Parcelable implementation
// @GET, @POST — used in Retrofit for API calls

// ============================
// ✅ Serialization in Kotlin
// ============================

// 📌 Definition:
// Serialization is the process of converting an object into a format (like JSON or XML)
// so it can be stored or sent over a network.
// Deserialization is the opposite — converting that JSON/XML back into an object.

// 📌 Used When:
// - Storing data in files or SharedPreferences
// - Sending/receiving data from a server via APIs
// - Saving app state

// 📌 Example Library:
// Kotlinx.serialization
// GSON
// Moshi

// 📌 Important Annotation for Serialization:
// @Serializable — used to tell the compiler that this data class can be converted to/from JSON
// @SerialName("json_name") — used to rename the JSON key to match your Kotlin variable

// ============================
// ✅ Sample Kotlin Code
// ============================

// Below is an example of how annotations and serialization are used in real projects

// Import required for Kotlinx Serialization
// import kotlinx.serialization.Serializable
// import kotlinx.serialization.SerialName

// 📌 This data class will be used to hold user data from an API
// @Serializable // This tells the Kotlin compiler this class can be serialized/deserialized
// data class User(
//     @SerialName("user_id") val id: Int, // JSON key is "user_id", but we use "id" in Kotlin
//     @SerialName("user_name") val name: String,
//     @SerialName("user_email") val email: String
// )

// ============================
// ✅ Common Annotations in Android
// ============================

// @Composable — used to create UI elements in Jetpack Compose

// @HiltViewModel — used with Hilt for dependency injection

// @Inject — used to provide dependencies automatically

// @SerializedName — from Gson, maps JSON key to variable

// @GET("/users") — used with Retrofit to make GET API requests

// @POST("/login") — used with Retrofit to make POST API requests

// @Query("id") — used to send query parameters in API

// @Parcelize — auto-generates parcelable implementation for Android Bundles

// @Deprecated("Use newMethod() instead") — marks a method as outdated

// @SuppressLint("MissingPermission") — used to suppress Android Lint warnings

// @Preview — used in Compose to preview UI components

// ============================
// 📌 Summary:
// - Annotations = Extra information for compiler/tools
// - Serialization = Convert data class <--> JSON
// - Used heavily in Android apps (Compose, Retrofit, Gson, Hilt, etc.)
// ============================

