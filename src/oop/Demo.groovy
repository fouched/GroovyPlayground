package oop

Person p = new Person(firstName: 'Fouche', lastName: 'du Preez')
println p.fullName

println p.concat("Hello", "World")

UssdHandler ussdHandler = new UssdHandler("123456-foobar")

//ussdHandler.sessionId = '9876'
ussdHandler.addSession(p)

println p.concat("Hello", "World")




