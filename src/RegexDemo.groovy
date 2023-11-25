def text = "Being a Cleveland Sports Fan is no way to go through life"
def pattern = ~$/Cleveland Sports Fan/$
def finder = text =~ pattern
def matcher = text ==~ pattern
// prints 1
println finder.size()
// prints false
println matcher

def pattern2 = ~$/Cleveland/$
text = text.replaceFirst(pattern2, "Buffalo")
// prints Being a Buffalo Sports Fan is no way to go through life
println text