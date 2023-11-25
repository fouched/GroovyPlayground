package closures

// implicit parameter it
def foo = {
    println it
}
foo('fouche')

// multiple params
def sayHello = {first, last ->
    println "Hello, $first $last"
}
sayHello('Fouche', 'du Preez')

// default values
def greet = {String name, String greeting = "Howdy"->
    println "${greeting}, ${name}"
}
greet("Fouche")

// var-arg, also applicable to methods
def concat = {String... args ->
    args.join('')
}
println concat('a', 'b', 'c')