package closures

// Closures will look for methods in the encapsulating class
// can also assign a custom delegate
def writer = {
    append 'Fouche'
    append ' lives in Cape Town'
}

StringBuilder sb = new StringBuilder()
writer.delegate = sb

println(writer())

