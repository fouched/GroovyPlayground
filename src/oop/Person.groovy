package oop

import groovy.transform.ToString

@ToString // add auto toString
class Person {
    String firstName
    String lastName

    String getFullName() {
        "$firstName $lastName"
    }

    List luckyNumbers (List numbers = [6,7], Boolean canAccessAll = false) {
        // do something
    }

    String concat(String... args) {
        String s = ''
        args.each {s += it}
        s
    }

}

