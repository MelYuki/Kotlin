package be.webmobile.kotlin.exo.interaction

fun main() {

    println("""
        Bonjour!
        Quel est votre prénom?
    """.trimIndent())
    val name = readln()

    println("""
        Quel est votre âge?
    """.trimIndent())
    val age = readln().toInt()

    println("""
        Bienvenue $name,
        Vous avez $age ans.
    """.trimIndent())

}