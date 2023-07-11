package be.webmobile.kotlin.exo.tableaux

import kotlin.random.Random

fun main() {

    // Easy with .sort()
    val myTab = Array(10) { Random.nextInt(1, 101) }

    println("\n--- My Tab Sorted ---")
    myTab.sort()
    for ((index, value) in myTab.withIndex()) {
        println("$index: $value")
    }

    // Sort by using the Foreach
    val tab = Array(10) { Random.nextInt(1, 101) }

    println("\n--- Tab Sorted by Foreach ---")
    println( tab.joinToString(" > ") )
    for( i in 0 until tab.size-1 ){
        for( j in i until tab.size ){
            if( tab[j] < tab[i] ){
                val temp = tab[i]
                tab[i] = tab[j]
                tab[j] = temp
            }
        }
    }
    println( tab.joinToString(" > ") )

}