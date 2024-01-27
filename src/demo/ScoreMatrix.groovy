package demo

class ScoreMatrix {

    static final List<ScoreRange> applicationsFailed = [
            new ScoreRange(from: 0, to: 0, score: 30),
            new ScoreRange(from: 1, to: 4, score: 25),
            new ScoreRange(from: 5, to: Integer.MAX_VALUE, score: 12)
    ]

    /*
        1	ABSA
        2	CAPITEC
        3	FIRST_NATIONAL_BANK
        4	STANDARD_BANK
        5	NEDBANK
        6	---- not sent through (Mercantile Bank)
        7	OTHER
        8	---- not sent through (Bidvest Bank)
        9	INVESTEC
        10	AFRICAN_BANK
     */
    static final List<ScoreRange> BANK = [
            new ScoreRange(from: 1, to: 1, score: 34),
            new ScoreRange(from: 2, to: 2, score: 27),
            new ScoreRange(from: 3, to: 4, score: 34),
            new ScoreRange(from: 5, to: 5, score: 34),
            new ScoreRange(from: 6, to: 10, score: 17, defaultScore: true),
    ]

    static final List<ScoreRange> BUREAU = [
            new ScoreRange(from: 0, to: 594, score: 15),
            new ScoreRange(from: 595, to: 611, score: 25),
            new ScoreRange(from: 612, to: 625, score: 30),
            new ScoreRange(from: 626, to: 638, score: 40),
            new ScoreRange(from: 639, to: 658, score: 54),
            new ScoreRange(from: 659, to: Integer.MAX_VALUE, score: 70),
    ]

}
