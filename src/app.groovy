import demo.ScoreCalculator

//Developer d = new Developer();
//d.firstName = "Fouche"
//d.setLastName("du Preez")
//d.languages << "Groovy"
//d.languages << "Java"
//
//d.work()

int totalScore = 0
int bankScore = ScoreCalculator.bankScore('CAPITEC')
totalScore += bankScore
println('bankScore:' + bankScore)

int bureauScore = ScoreCalculator.bureauScore(700)
totalScore += bureauScore
println('bureauScore:' + bureauScore)

println('total score:' + totalScore)
