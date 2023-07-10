package be.webmobile.kotlin.demo.interaction

fun main() {

    // Raccourci "sout" fonctionne encore!
    // println("Ecrire en console: ")

    // Les """ """ sont encore ok
    // mais avec le .trimIndent() pour virer l'indentation.
    println("""
        Ecrire en console:
        """.trimIndent())

    // val input = readLine() // -> renvoi null
    // val input = readln() // -> renvoi une erreure blocante, N'accepte pas les varleurs null

    val input = readln().toInt()

    // println(input)

    // Si ce n'est qu'une variable, seul le $ suffit! pas besoin de {}
    println("Mon input: $input")
    // Si c'est une expression, il faut les {}
    println("Mon input: ${input + 5}")
}