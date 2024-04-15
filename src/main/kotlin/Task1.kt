import java.util.*


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val bank = Bank()
    var bankArraylist_1 = ArrayList<Bank>()
    var bankArraylist_2 = ArrayList<Bank>()
    var bankArraylist_3 = ArrayList<Bank>()

    for (i in 1..5) {

        print("Enter name: ")
        val name = scanner.next()

        print("Enter accountNumber: ")
        val accountNumber = scanner.nextInt()

        print("Enter balance: ")
        val balance = scanner.nextDouble()

        print("\n")

        bankArraylist_1.add(Bank(name, accountNumber, balance))
    }


    println("--------- \nBankArraylist: \n")

    for ((index, item) in bankArraylist_1.withIndex()) {

        println("${index + 1}. $item")
    }


    println("--------- \nfilterByBalanceGreaterThan: \n")

    bankArraylist_2.addAll(bank.filterByBalanceGreaterThan(bankArraylist_1, 500))

    for ((index, item) in bankArraylist_2.withIndex()) {

        println("${index + 1}. $item")
    }


    println("--------- \nfilterByBalanceLessThan: \n")

    bankArraylist_3.addAll(bank.filterByBalanceLessThan(bankArraylist_1, 500))

    for ((index, item) in bankArraylist_3.withIndex()) {

        println("${index + 1}. $item")
    }



}