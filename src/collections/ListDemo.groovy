package collections

// defaults to ArrayList
List nums = [1,2,3,4,5]
println nums

nums.push(99)
println nums

nums.putAt(0, 77)
println nums

// the original List stays unchanged, the plus returns  a new list
List nums2 = nums + 7
println nums
println nums2

// adds to the current list
nums << 66
println nums

// removes 1st element
nums.pop()
println nums

// returns a new list that removed any entries that are equal to 66
List nums3 = nums - 66
println nums3

// removes duplicates and auto sorts
def nums4 = [1,20,2,2,9,9,8,8] as SortedSet
println nums4
