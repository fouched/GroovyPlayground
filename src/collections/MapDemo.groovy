package collections

def person = [first:"Fouche", last:"du Preez"]
println person
println person.first

// can dynamically add keys to an existing map
person.email = "fouche@abc.com"
println person

