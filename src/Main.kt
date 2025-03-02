const val NUMCAGES = 8
const val EMPTY = "---"

fun main() {
    val cages = mutableListOf<String>()

    setupCages(cages)

    placeMonkeyInCage(cages, 1, "Kevin")
    placeMonkeyInCage(cages, 3, "Samson")
    placeMonkeyInCage(cages, 4, "Pam")
    placeMonkeyInCage(cages, 5, "Frank")
    placeMonkeyInCage(cages, 6, "Jim")
    placeMonkeyInCage(cages, 8, "Sally")

    listAllCages(cages)
    listAllMonkeys(cages)
    println("Monkeys: " + monkeyCount(cages))

    showMonkeyCages(cages)

}


fun setupCages(cageList: MutableList<String>) {
    for (i in 1..NUMCAGES) cageList.add(EMPTY)
}


fun placeMonkeyInCage(cageList: MutableList<String>, cageNum: Int, name: String) {
    if (cageNum in 1..cageList.size) {
        cageList[cageNum - 1] = name
    }
    else {
        println("ERROR: Cage number $cageNum is out of range.")
    }
}


fun listAllCages(cageList: List<String>) {
    println("--------------")
    println("CAGES")
    for ((i, name) in cageList.withIndex()) {
        println("- Cage ${i+1}: $name")
    }
    println("--------------")
}

fun listAllMonkeys(cageList: List<String>) {
    println("--------------")
    println("ALL MONKEYS")
    for (name in cageList) {
        if (name != EMPTY) {
            println("- $name")
        }
    }
    println("--------------")
}

fun monkeyCount(cageList: List<String>): Int {
//    return cageList.count { it != EMPTY }
    var count = 0
    for (name in cageList) {
        if (name != EMPTY) {
            count++
        }
    }
    return count
}

fun showMonkeyCages(cageList: List<String>) {
    println("+--------".repeat(cageList.size) + "+")

    for (i in 0 ..< cageList.size) {
        print("| Cage ${i+1} ")
    }
    println("|")

    println("+--------".repeat(cageList.size) + "+")

    for ((i, name) in cageList.withIndex()) {
        print("| ${name.padEnd(6)} ")
    }
    println("|")

    println("+--------".repeat(cageList.size) + "+")
}

fun listMonkeysToRight(cageList: List<String>, name: String) {

}

fun listMonkeysToLeft(cageList: List<String>, name: String) {

}

fun listEmptyCages(cageList: List<String>) {

}

