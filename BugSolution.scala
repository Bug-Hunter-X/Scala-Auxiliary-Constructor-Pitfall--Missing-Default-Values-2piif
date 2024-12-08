```scala
class MyClass(val x: Int = 0) { // Solution: providing a default value in the primary constructor
}

val myObj = new MyClass()
println(myObj.x) // Output: 0

val myObj2 = new MyClass(5)
println(myObj2.x) // Output: 5

class AnotherClass(x: Int = 0) { //Solution: Providing a default value in the primary constructor
}

val anotherObj = new AnotherClass() // Now this is valid
println(anotherObj.x) // Output: 0

val anotherObj2 = new AnotherClass(10)
println(anotherObj2.x) // Output: 10
```