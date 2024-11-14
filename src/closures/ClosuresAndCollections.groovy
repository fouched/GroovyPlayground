package closures

// In Groovy Collections have additional methods that take a closure as an argument
List favNums = [2, 4, 7, 32, 50]

// each
favNums.each {println it }

// the index also available
favNums.eachWithIndex{ entry, idx ->
    println "$idx:$entry"
}

// findAll
List days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
List weekend = days.findAll({it.startsWith("S")})

println weekend

// collect
List nums = [1, 2, 2, 3, 5, 8, 8, 6]
List numsTimesTen = nums.collect {num -> num * 10}
println numsTimesTen


V2ResultItem resultItem = new V2ResultItem()
resultItem.itemProperties << new KVPair(key: "Foo", value: "Bar")
resultItem.itemProperties << new KVPair(key: "idNumber", value: "7111025060086")
resultItem.itemProperties << new KVPair(key: "businessRoles", value: "CREDIT_DEBTOR")

resultItem.itemProperties.each {
    println("${it.key}:${it.value}")
}


V2SearchResults searchResults = new V2SearchResults()
searchResults.results << resultItem

println("=======")

searchResults.results[0].itemProperties.each {
    if (it.key == "businessRoles")
        println it.value
    else if (it.key == "idNumber")
        println it.value
}


