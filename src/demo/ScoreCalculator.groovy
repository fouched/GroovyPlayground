package demo

class ScoreCalculator {
    static int bankScore(String bank) {
        ScoreRange scoreRange
        switch (bank) {
            case 'ABSA':
                scoreRange = ScoreMatrix.BANK.find {it.from == 1 && it.to == 1}
                break
            case 'CAPITEC':
                scoreRange = ScoreMatrix.BANK.find {it.from == 2 && it.to == 2}
                break
            case 'FIRST_NATIONAL_BANK' || 'STANDARD_BANK':
                scoreRange = ScoreMatrix.BANK.find {it.from == 3 && it.to == 4}
                break
            case 'NEDBANK':
                scoreRange = ScoreMatrix.BANK.find {it.from == 5 && it.to == 5}
                break
            default:
                scoreRange = ScoreMatrix.BANK.find {it.from == 6 && it.to == 10}
        }

        return scoreRange.score;
    }

    static int bureauScore(int bureauScore) {

        ScoreRange scoreRange = ScoreMatrix.BUREAU.find { it.from >= bureauScore && it.to <= bureauScore }

        return scoreRange.score
    }
}
