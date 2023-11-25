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