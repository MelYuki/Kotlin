package be.webmobile.kotlin.demo.progression

fun main() {

    // le STEP est la différence entre,
    // range        (step de 1)
    // ET
    // progression  (step peut être choisi)
    val range: IntRange = IntRange(1, 5) //IntProgression(1, 5, 1) Pas accès à ça
    val progression: IntProgression = range step 2

    // Autres moyens de créer des IntRange:
    var autreRange: IntRange
    autreRange = IntRange(1, 5)
    autreRange = 1..5
    autreRange = 1.rangeTo(5)
    autreRange = 1 until 6

    // Dans l'autre sens -> forcément uen IntProgression car -1 et non 1
    var autreProgression: IntProgression = 5 downTo 1
    autreProgression = 5 downTo 1 step 2
    println(autreProgression.step) // -> Vérif l'action de step dans l'objet downTo
    for (i in autreProgression) {
        println(i) // -> 5 3 1
    }

    // ATTENTION aux range-progression vide
    var progVide: IntProgression = IntRange.EMPTY
    progVide = 5..-5 // Range vide
    progVide = 5 until 5 // Idem ^
    progVide = 6 downTo 10 // Progression vide

    for (i in progVide) {
        println(i) // On ne passe jamais par ici
    }

}