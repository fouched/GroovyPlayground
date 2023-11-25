package collections

Range r = 1..10
Range r2 = 1..<10 // exclude 10
println r.step(1)
println r.from
println r.to

println r2.step(1)
println r2.from
println r2.to
//assert (r2).contains(10)

Date today = new Date()
Date oneWeekAway = today + 7

println today
println oneWeekAway

Range days = today..oneWeekAway
println days.step(1)

Range letters = 'a'..'z'
println letters.step(1)