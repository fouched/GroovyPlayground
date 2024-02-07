import demo.ScoreCalculator

//Developer d = new Developer();
//d.firstName = "Fouche"
//d.setLastName("du Preez")
//d.languages << "Groovy"
//d.languages << "Java"
//
//d.work()

//int totalScore = 0
//int bankScore = ScoreCalculator.bankScore('CAPITEC')
//totalScore += bankScore
//println('bankScore:' + bankScore)
//
//int bureauScore = ScoreCalculator.bureauScore(620)
//totalScore += bureauScore
//println('bureauScore:' + bureauScore)
//
//int unsScore = ScoreCalculator.unsPercPayments1YearScore(620)
//println('unsScore:' + unsScore)
//totalScore += unsScore
//
//println('total score:' + totalScore)

BigDecimal num = 1090.00
int rounded = 0

if (num > 0)
    rounded = (int) ((Math.floor(num / 100.0)) * 100)

def round50up = { int x ->
    x + (50 - (x % 50 ?: 50))
}

println round50up((int) 250.25)
println round50up(265)
println round50up(300)
println round50up(301)
println round50up(351)

