package be.webmobile.kotlin.demo.variables

fun main(args: Array<String>) {

    // var ou val
    // var variable: String = "ma variable" // Il sait que c'est du string
    var variable = "ma variable"
    // val CONSTANTE: String = "ma constante"
    val CONSTANTE = "ma constante"

    variable = "pas de soucis"
    // CONSTANTE = "PROBLEME"


    // Les primitifs n'existent plus
    var entier1 : Int
    var entier2 = 5
    var entier3 : Int = 7

    var tresPetitEntier: Byte
    var petitEntier: Short
    // var grandEntier: Long
    var grandEntier /*: Long*/ = 15L

    // var reel: Float
    var reel/*: Float*/ = 5.0F
    var reelPrecis: Double

    var caracter: Char
    var boolenan: Boolean

    var unicode: Char = '\u0041' // -> unicode characters
    var icon: Char = '\uF603' // -> unicode emoji
    println(unicode)
    println(icon)


    // Null-Safety
    // boolean = null // Impossible! les types n'acceptent pas la valeur null par défaut

    // -> Pour accepter une valeur null...
    var booleanNullable: Boolean?
    booleanNullable = null


    // Conversion
    // reelPrecis = entier3 // Fonctionne pas
    reelPrecis = entier3.toDouble()
}