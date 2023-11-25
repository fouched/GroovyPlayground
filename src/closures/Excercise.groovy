package closures

def myMethod (Closure c) {
    c("Fouche")
}

def myClosure = {String name ->
    println "Hello, $name"
}

myMethod(myClosure)

