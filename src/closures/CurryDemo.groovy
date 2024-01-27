package closures

// In Groovy, Curry refers to a partial application
// it lets you set the value of one or more parameters in a Closure
// and returns a new Closure accepting one/more parameters less
// this is great for applying default values to method (closure) parameters

def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] $msg"
}
log("DEBUG", new Date(), "Some log msg")

def debugLog = log.curry("DEBUG", new Date())
debugLog("Another log msg")
