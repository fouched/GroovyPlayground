package conditional

def num = 12

switch (num) {
    case 1 :
        println "1"
        break
    case 1..3 :
        println "in 1..3"
        break
    case Integer :
        println "is an integer"
        break
    default :
        println "default.."
}

