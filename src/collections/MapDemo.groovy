package collections

def person = [first:"Fouche", last:"du Preez"]
println person
println person.first

// can dynamically add keys to an existing map
person.email = "fouche@abc.com"
println person

def banks = [
        [id: 1, name: 'ABSA'],
        [id: 2, name: 'CAPITEC'],
        [id: 3, name: 'FIRST_NATIONAL_BANK'],
        [id: 4, name: 'STANDARD_BANK'],
        [id: 5, name: 'NEDBANK'],
        [id: 6, name: 'MERCANTILE'],
        [id: 7, name: 'OTHER'],
        [id: 8, name: 'BIDVEST'],
        [id: 9, name: 'INVESTEC'],
        [id: 10, name: 'AFRICAN_BANK'],
]

println banks.find({ it.name = 'ABSA'}).id

