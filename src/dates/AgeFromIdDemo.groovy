package dates

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

String id = '7111025060086'

LocalDate curDate = LocalDate.now()
int dobYear = Integer.parseInt(id.substring(0, 2))
int curYear = Integer.parseInt(curDate.toString().substring(2, 4))

id = dobYear > curYear ? '19' + id : '20' + id

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd")
LocalDate dob = LocalDate.parse(id.substring(0,8), formatter)
int age = Period.between(dob, curDate).getYears()

println('age:' + age)