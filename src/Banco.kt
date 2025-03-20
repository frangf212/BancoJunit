class Banco(private var balance: Double) {

    fun deposito(amount: Double) {
        require(amount > 0) { "El depósito debe ser mayor que 0" }
        balance += amount
    }

    fun retiro(amount: Double) {
        require(amount > 0) { "El retiro debe ser mayor que 0" }
        check(balance >= amount) { "Fondos insuficientes" }
        balance -= amount
    }

    fun transferencia(to: Banco, amount: Double) {
        retiro(amount)
        to.deposito(amount)
    }

    fun getBalance(): Double = balance
}