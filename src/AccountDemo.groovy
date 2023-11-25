class Account {
    String type
    BigDecimal balance = 0.0

    void deposit(BigDecimal amount) {
        balance += amount
    }

    void withdraw(BigDecimal amount) {
        balance -= amount
    }

    BigDecimal plus(Account other) {
        balance + other.balance
    }
}

Account checking = new Account(type: "Check")
checking.deposit(100.00)

Account saving = new Account(type: "Saving")
saving.deposit(50.00)

BigDecimal total = checking + saving
println total
