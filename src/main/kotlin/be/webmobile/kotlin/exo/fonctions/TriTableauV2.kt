package be.webmobile.kotlin.exo.fonctions

import kotlin.random.Random

// fun POINT 1:
fun sortedTab(tab: Array<Int>): Array<Int> {
    val tabCopy = tab.clone()
//    val tabCopy = tab.copyOf() // -> mieux!
    for (i in 0 until tabCopy.size-1) {
        for (j in i until tabCopy.size) {
            if( tabCopy[j] < tabCopy[i] ){
                val temp = tabCopy[i]
                tabCopy[i] = tabCopy[j]
                tabCopy[j] = temp
            }
        }
    }
    return tabCopy
}

fun checkTab(tab: Array<String>, action: (element: String) -> Boolean): Unit {
    for (i in tab.indices) {
        if (action(tab[i]))
            println(tab[i])
    }
}

fun main() {

    // POINT 1:
    val myTab = Array(10) { Random.nextInt(1, 101) }

    println("\nPOINT 1")
    println( """
        
        Tab not sorted yet!
        ${myTab.joinToString(" > ")}
    """.trimIndent())

    println("""
        
        Tab sorted with a function
        ${sortedTab(myTab).joinToString ( " > ")}
    """.trimIndent())

    println( """
        
        By creating a tabCopy in the function,
        The base tab stay unchanged.
        ${myTab.joinToString(" > ")}
    """.trimIndent())


    // POINT 2
    val myStringTab: Array<String> = arrayOf("Mel", "asya", "Nao", "billy", "Dominique")

    println("\nPOINT 2")
    println( """
        
        Tab's elements:
        ${myStringTab.joinToString(" > ")}
    """.trimIndent())

    println("""
        
        First test:
        Require only the elements with a size of 5 or equals
        ----------------------------------------------------
    """.trimIndent())
    checkTab(myStringTab) {it.length >= 5}

    println("""
        
        Second test:
        Require only the elements beginning by a capital
        -------------------------------------------------
    """.trimIndent())
    checkTab(myStringTab) {it.first() in 'A'..'Z'} // -> Unicode range


}