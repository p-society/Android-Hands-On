# Basic Concepts of Kotlin Programming Language

Kotlin is a modern, statically typed programming language that runs on the Java Virtual Machine (JVM). It was developed by JetBrains in 2011 and was designed to be concise, safe, and interoperable with Java.

## Variables and Data Types

### Variables

Like most programming languages, Kotlin supports variables to store and manipulate data. There are two types of variables in Kotlin:

-   val - immutable variables, similar to final variables in Java.
-   var - mutable variables.

```kt
val PI = 3.14 // cannot be changed
var myVariable = "Hello, World!" // can be changed
```

### Data Types

Kotlin has a variety of data types, including:

-   Numbers: Byte, Short, Int, Long, Float, Double.
-   Booleans: Boolean.
-   Characters: Char.
-   Strings: String.

#### Numbers

Kotlin has a rich set of numeric data types, ranging from 8-bit integers to 64-bit integers, as well as floating-point numbers.

```kt
val myByte: Byte = 127
val myShort: Short = 32767
val myInt: Int = 2147483647
val myLong: Long = 9223372036854775807L
val myFloat: Float = 3.14f
val myDouble: Double = 3.14
```

#### Booleans

Kotlin has a Boolean data type that can only have two values: true or false.

```kt
val myBoolean: Boolean = true
```

#### Characters

Kotlin has a Char data type that represents a single character.

```kt
val myChar: Char = 'A'
```

#### Strings

Kotlin has a String data type that represents a sequence of characters.

```kt
val myString: String = "Hello, World!"
```

## String Interpolation - String Templates

String interpolation or string templates are used to embed expressions into strings. In Kotlin, string templates are enclosed in ${}.

```kt
val name = "Alice"
val age = 25
println("$name is $age years old.")
```

## Operators

### Arithmetic Operators

Kotlin supports a set of arithmetic operators, including +, -, \*, /, %. The type of the result depends on the types of the operands. For example, if both operands are integers, the result will be an integer.

```kt
val a = 10
val b = 3
val sum = a + b // 13
val difference = a - b // 7
val product = a * b // 30
val quotient = a / b // 3
val remainder = a % b // 1
```

### Comparison Operators

Kotlin supports a set of comparison operators, including >, <, >=, <=, ==, and !=. They return a Boolean value.

```kt
val a = 10
val b = 3
val isGreater = a > b // true
val isEqual = a == b // false
```

### Assignment, Increment and Decrement Operators

Kotlin supports the standard assignment operator =, as well as increment ++ and decrement -- operators.

```kt
var a = 10
a += 5 // 15
a -= 3 // 12
a *= 2 // 24
a /= 4 // 6
a++ // 7
a-- // 6
```

## Control Flow

### If Statements

Kotlin has an if statement similar to other programming languages. The if statement is used to execute a block of code if a condition is true. It can also have an optional else block to execute if the condition is false.

```kt
val a = 10
val b = 3
if (a > b) {
    println("$a is greater than $b")
} else {
    println("$a is not greater than $b")
}
```

### When Expressions

Kotlin's when expression is similar to a switch statement in Java, but it is more powerful. It can match on any type, not just integers or characters. It can also include expressions as conditions.

```kt
val x = 2
when (x) {
    1 -> println("x is 1")
    2 -> println("x is 2")
    else -> println("x is not 1 or 2")
}
```

### While Loop

Kotlin has a while loop that allows you to repeat a block of code while a condition is true.

```kt
var i = 1
while (i <= 5) {
    println(i)
    i++
}
```

### Do While Loop

Kotlin has a do-while loop that is similar to the while loop, but it guarantees that the code block is executed at least once.

```kt
var i = 1
do {
    println(i)
    i++
} while (i <= 5)
```

### For Loops

Kotlin's for loop can be used to iterate over a range of values or over collections.

```kt
for (i in 1..5) {
    println(i)
}

val myList = listOf("apple", "banana", "cherry")
for (fruit in myList) {
    println(fruit)
}
```

### Break and Continue

Kotlin has the break and continue keywords that are used to exit a loop or skip an iteration, respectively.

```kt
for (i in 1..10) {
    if (i == 5) {
        break // exit the loop
    }
    if (i % 2 == 0) {
        continue // skip this iteration
    }
    println(i)
}
```

## Functions

Kotlin supports functions that can take parameters, return values, and be called with named arguments.

```kt
fun greet(name: String): String {
    return "Hello, $name!"
}

val greeting = greet("Alice")
println(greeting) // "Hello, Alice!"
```

## Null Safety

Kotlin has null safety features to help prevent null pointer exceptions. In Kotlin, a variable must be explicitly declared as nullable with a ? if it can be null.

```kt
val myString: String? = null
```

### Elvis Operator

Kotlin's Elvis operator ?: can be used to provide a default value if a nullable variable is null.

```kt
val myString: String? = null
val length = myString?.length ?: -1
```

### Not Null Assertion

Kotlin's not null assertion operator !! can be used to force a nullable variable to be treated as non-null. This should be used with caution as it can result in a null pointer exception.

```kt
val myString: String? = null
val length = myString!!.length
```

## Activity Lifecycle
![image](https://user-images.githubusercontent.com/96427746/233574573-afdedf12-8a33-4072-b112-2c0c499a0fc8.png)

