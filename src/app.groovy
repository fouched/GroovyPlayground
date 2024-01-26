import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

//Developer d = new Developer();
//d.firstName = "Fouche"
//d.setLastName("du Preez")
//d.languages << "Groovy"
//d.languages << "Java"
//
//d.work()

String id = '9811025060086'

int year = Integer.parseInt(id.substring(0, 2))

LocalDate curDate = LocalDate.now();

println(Integer.parseInt(curDate.toString().substring(2, 4)))

if (year > Integer.parseInt(curDate.toString().substring(2, 4))) {
    id = '19' + id
} else {
    id = '20' + id
}


DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd");
LocalDate dob = LocalDate.parse(id.substring(0,8), formatter);

println('dob:' + dob)
println('curdate:' + curDate)
println('age:' + Period.between(dob, curDate).getYears())

/*
	int getApplicationScore(AggregatorRequest request) {
		//TODO implement
		int totalScore = 0

		int bankScore = ScoreCalculator.bankScore(request.bank)
		totalScore += bankScore

		int bureauScore = ScoreCalculator.bureauScore(Integer.parseInt(request.bureauScore))
		totalScore += bureauScore


		totalScore
	}

	int getAge(String id) {

		LocalDate curDate = LocalDate.now();
		int dobYear = Integer.parseInt(id.substring(0, 2))
		int curYear = Integer.parseInt(curDate.toString().substring(2, 4))

		if (dobYear > curYear) {
			id = '19' + id
		} else {
			id = '20' + id
		}

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuuMMdd")
		LocalDate dob = LocalDate.parse(id.substring(0,8), formatter);
		int age = Period.between(dob, curDate).getYears()

		age
	}

 */