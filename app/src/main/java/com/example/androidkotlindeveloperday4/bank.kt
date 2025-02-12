import java.util.UUID

data class Account(val id: Int, var balance: Double, val accountHolder: AccountHolder) {
    init {
        accountHolder.addAccount(this)
    }
}

data class AccountHolder(val name: String) {
    private val _accounts = mutableListOf<Account>()
    init {
        var index = UUID.randomUUID()
    }

    val accounts: List<Account> get() = _accounts

    fun addAccount(account: Account) {
        _accounts.add(account)
    }
}

fun main() {
    val alex = AccountHolder("Alex")
    val miguel = AccountHolder("Miguel")
    val accounts = mutableListOf(
        Account(1, 100.0, alex),
        Account(2, 200.0, miguel),
        Account(3, 200.0, miguel),
        Account(4, 200.0, alex)
    )

    // Modificar el balance de la primera cuenta
    accounts[0].balance = 150.0
    accounts[0].balance = 151.0

    // Verificar que la modificación se refleje en alex.accounts
    println(alex.accounts)
    println(accounts)
}