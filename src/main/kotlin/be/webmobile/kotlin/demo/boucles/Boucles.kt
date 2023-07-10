package be.webmobile.kotlin.demo.boucles

fun main() {

    // WHILE
    var nbrOeuf = 5
    println("--- While ---")
    while( nbrOeuf > 0 ){
        println("Je casse un oeuf")
        nbrOeuf--
    }

    // DO ... WHILE
    var input: Int
    println("\n--- Do...While ---")
    do {
        print("> ")
        input = readln().toInt();
    } while ( input > 10 || input < 0 )
    println("--- Sortie du Do...While ---")

    // for(int i = 0 ;...;...){...} java absent en kotlin
    // le foreach prend sa place
    // Sur quoi je peux faire un foreach? sur les Iterable<?>
    println("\n--- foreach Range ---")
    for ( element in 1..5 ){
        println("$element - je casse un oeuf")
    }

    println("\n--- foreach Values of Array ---")
    for ( element in arrayOf(12,0,15) ){
        println(element)
    }

    println("\n--- foreach Index of Array's values ---")
    for ( index in arrayOf(12,0,15).indices ){
        println(index)
    }

    println("\n--- foreach with tuple ---")
    // Permet d'avoir un tableau composé de différents types de valeurs
    for ( (index, value) in arrayOf("ok","bonjour", "au revoir").withIndex() ){
        println( "$index - $value" )
    }

}