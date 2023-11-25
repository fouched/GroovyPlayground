package closures

// In Groovy, Curry refers to partial application
// Lets you set the value of one or more parameters in a Closure
// and returns a new Closure accepting one/more parameter less
// this is great for removing duplicating method (closure) parameters

def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] $msg"
}
log("DEBUG", new Date(), "Some log msg")

def debugLog = log.curry("DEBUG", new Date())
debugLog("Another log msg")
