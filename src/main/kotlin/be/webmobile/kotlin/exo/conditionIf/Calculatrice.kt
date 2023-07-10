package be.webmobile.kotlin.exo.conditionIf

fun main() {

    println("Bienvenue dans ce programme de calculatrice!")
    println("--------------------------------------------")

    println("Choississez votre 1er nombre:")
    print("> ")
    val num1 = readln().toInt()

    println("""
        Choississez l'opération (entre 1 et 5) à éffectuer:
        1) +
        2) -
        3) x
        4) /
        5) %
    """.trimIndent())
    var ope: Int
    do {
        print("> ")
        ope = readln().toInt()
    }
    while (ope < 1 || ope > 5)


    var num2: Int
    println("Choississez votre 2ème nombre:")
    do {
        print("> ")
        num2 = readln().toInt()
        if(num2 == 0 && (ope == 4 || ope == 5)) println("ERREUR: Division impossible par 0 !")
    }
    while (num2 == 0 && (ope == 4 || ope == 5))

    println("Voici le résultat:")
    when(ope) {
        1 -> println("$num1 + $num2 = ${num1+num2}")
        2 -> println("$num1 - $num2 = ${num1-num2}")
        3 -> println("$num1 x $num2 = ${num1*num2}")
        4 -> println("$num1 / $num2 = ${num1/num2.toDouble()}")
        5 -> println("$num1 % $num2 = ${num1%num2}")
    }
}