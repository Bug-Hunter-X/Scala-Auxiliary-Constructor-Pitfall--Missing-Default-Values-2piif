```scala
class MyClass(val x: Int) {
  def this() = this(0) 
}

val myObj = new MyClass()
println(myObj.x) // Output: 0

val myObj2 = new MyClass(5)
println(myObj2.x) // Output: 5

class AnotherClass(x: Int) {
  // Missing auxiliary constructor, will throw an error if you try to create an instance without passing a value for x
}

//val anotherObj = new AnotherClass() // This will cause a compilation error
val anotherObj2 = new AnotherClass(10) // this is valid
println(anotherObj2.x) // Output: 10

```