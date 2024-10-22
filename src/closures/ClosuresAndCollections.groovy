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


V2ItemProperties itemProperties = new V2ItemProperties()
itemProperties.kvPairs << new V2KVPair(key: "Foo", value: "Bar")
itemProperties.kvPairs << new V2KVPair(key: "idNumber", value: "7111025060086")
itemProperties.kvPairs << new V2KVPair(key: "businessRoles", value: "CREDIT_DEBTOR")

itemProperties.kvPairs.each {
    println("${it.key}:${it.value}")
}

V2Result result = new V2Result()
result.itemProperties << itemProperties

V2SearchResult searchResult = new V2SearchResult()
searchResult.results << result

println("=======")

searchResult.results[0].itemProperties[0].kvPairs.each {
    if (it.key == "idNumber")
        println it.value
}


