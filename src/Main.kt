const val NUMCAGES = 8
const val EMPTY = "---"

fun main() {
    //-------------------------------------------------
    println("Setting up the cages...")

    val cages = setupCages()

    listAllCages(cages)
    println()

    //-------------------------------------------------
    println("Placing monkeys into cages...")

    placeMonkeyInCage(cages, 1, "Kevin")
    placeMonkeyInCage(cages, 8, "Sally")
    placeMonkeyInCage(cages, 4, "Pam")
    placeMonkeyInCage(cages, 3, "Samson")
    placeMonkeyInCage(cages, 5, "Frank")
    placeMonkeyInCage(cages, 6, "Jim")

    println()

    listAllCages(cages)
    println()

    listAllMonkeys(cages)
    println("Monkeys: ${monkeyCount(cages)}")
    println()

    listEmptyCages(cages)
    println("Empty: ${emptyCount(cages)}")
    println()

    showMonkeyCages(cages)
    println()

    check(monkeyCount(cages) == 6)
    check(emptyCount(cages) == 2)

    //-------------------------------------------------
    println("Clearing out some monkeys...")

    clearCage(cages, 5)
    println()

    showMonkeyCages(cages)
    println()

    check(monkeyCount(cages) == 5)
    check(emptyCount(cages) == 3)

    //-------------------------------------------------
    println("Moving some monkeys around...")

    swapCages(cages, 1, 8)
    println()

    showMonkeyCages(cages)
    println()

    //--------------------

    swapCages(cages, 5, 8)
    println()

    showMonkeyCages(cages)
    println()

    check(monkeyCount(cages) == 5)
    check(emptyCount(cages) == 3)

}

/**
 *
 */
fun setupCages(): MutableList<String> {
    val cageList = mutableListOf<String>()
    for (i in 1..NUMCAGES) cageList.add(EMPTY)
    return cageList
}


fun placeMonkeyInCage(cageList: MutableList<String>, cageNum: Int, name: String) {
    println("+++ Putting $name into cage $cageNum")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}


fun listAllCages(cageList: List<String>) {
    println("CAGES")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}

fun listAllMonkeys(cageList: List<String>) {
    println("MONKEYS")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}

fun listEmptyCages(cageList: List<String>) {
    println("EMPTY CAGES")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}

fun listAllMonkeysAndCages(cageList: List<String>) {
    println("MONKEYS & CAGES")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}

fun monkeyCount(cageList: List<String>): Int {

    return 0    // REPLACE THIS WITH YOUR CODE!
}

fun emptyCount(cageList: List<String>): Int {

    return 0    // REPLACE THIS WITH YOUR CODE!
}

fun showMonkeyCages(cageList: List<String>) {

    check(false)    // REPLACE THIS WITH YOUR CODE!
}


fun clearCage(cageList: MutableList<String>, cageNum: Int) {
    println("--- Clearing cage $cageNum")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}

fun swapCages(cageList: MutableList<String>, cageNum1: Int, cageNum2: Int) {
    println("<-> Swapping cages $cageNum1 and $cageNum2")

    check(false)    // REPLACE THIS WITH YOUR CODE!
}



