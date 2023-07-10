package be.webmobile.kotlin.exo.boucles

fun main() {

    println("Veuillez entrer 10 nombres, entre -100 et 100")

    var num: Int
    var total = 0

    for (i in 1..10) {

        do {
            print("> ")
            num = readln().toInt()
//            println("num: $num")
            if(num < -100 || num > 100) println("ERREUR: Nombre Invalide!")
        }
        while (num < -100 || num > 100)

        total += num
//        println("total: $total")
    }

    val moyenne = total / 10
    println("Voici la moyenne: $moyenne")

}