package closures

// basic declaration
def sayHello = {
    println "Hello"
}
sayHello()

// pass an argument
sayHello = { name ->
    println("Hello ${name}")
}
sayHello("Fouche")

// define a method, that takes number and a closure
def timesTen(num, closure) {
    // call the closure with the number
    closure(num * 10)
}

// call the method with a closure
timesTen(10, {println it})

// any time a closure is the last argument to a method
// you do not need to pass it within method braces
timesTen(2) {
    println it
}

// below the closure is also the last argument and the Number
// times method as one (and the last) argument that takes a closure
import java.util.Random

Random rand = new Random()
3.times {
    println rand.nextInt()
}
