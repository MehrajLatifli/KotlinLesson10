data class Bank (var clientName: String = "", var accountNumber:Int =0, var balance:Double = 0.0) {


    fun sortByAccountNumber(banks: ArrayList<Bank>): ArrayList<Bank> {

        banks.sortBy { it.accountNumber }
        return banks
    }

    fun filterByBalanceGreaterThan(banks: ArrayList<Bank>, greaterThan: Int): ArrayList<Bank> {

        return banks.filter { it.balance > greaterThan }.toCollection(ArrayList())
    }

    fun filterByBalanceLessThan(banks: ArrayList<Bank>, lessThan: Int): ArrayList<Bank> {

        return banks.filter { it.balance < lessThan }.toCollection(ArrayList())
    }

    override fun toString(): String {
        return "Client name: $clientName , Account number: $accountNumber, Balance: $balance"
    }
}
