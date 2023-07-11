package be.webmobile.kotlin.exo.collections.studentsCourses


fun main() {

    val cours = listOf("java", "javascript", "kotlin")
    val etudiants = listOf("luc", "marie", "dominique")

    val notes: Map<String, MutableMap<String, Int>> = mapOf(
        cours[0] to mutableMapOf(),
        cours[1] to mutableMapOf(),
        cours[2] to mutableMapOf()
    )

    var input: Int;
    do {
        println(
            """
            
            ACTIONS:
            1) donner les notes des etudiants pour 1 cours
            2) afficher les notes d'un étudiants pour ses cours
            3) quitter
        """.trimIndent()
        )
        print("> ")
        input = readln().toInt();
        when (input) {
            1 -> {
                // donner les notes des etudiants pour 1 cours
                println("\nQuel cours (${cours.joinToString(", ")}) ?")
                print("> ")
                val cours = readln()
                val notePourCours = notes[cours]

                if (notePourCours == null) {
                    println("\nCe cours n'existe pas")
                } else {
                    for (etudiant in etudiants) {
                        print("pour $etudiant: ")
                        val note = readln().toInt()
                        notePourCours.put(etudiant, note)
                    }
                }
            }

            2 -> {
                println("\nQuel étudiant? (${etudiants.joinToString(", ")})")
                print("> ")
                val etudiant = readln()

                for (coursIndividuel in cours) {
                    val notesPourCours: MutableMap<String, Int>? = notes[coursIndividuel]
                    println("note de $etudiant pour $coursIndividuel: ${notesPourCours?.get(etudiant)}")
                }
            }

            3 -> println("\nAu revoir")
            else -> println("\nMauvais input")
        }

    } while (input != 3);
}