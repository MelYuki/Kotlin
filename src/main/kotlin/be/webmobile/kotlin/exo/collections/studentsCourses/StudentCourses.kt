package be.webmobile.kotlin.exo.collections.studentsCourses

fun main() {

    val students: MutableList<String> = mutableListOf()
    students.add("Luc")
    students.add("Dom")
    students.add("Mar")
    println("""
        
        --- The Students ---
        ${students.joinToString(", ")}
    """.trimIndent())

    val courses: MutableList<String> = mutableListOf()
    courses.add("Java")
    courses.add("JS")
    courses.add("Kotlin")
    println("""
        
        --- The Courses ---
        ${courses.joinToString(", ")}
    """.trimIndent())

    println("\nResults of each student about the course Java: ")
    println("-----------------------------------------------")
    val javaNotes = mapOf(
        students[0] to 17,
        students[1] to 12,
        students[2] to 15
    )
    for (key in javaNotes.keys) {
        println("$key: ${javaNotes[key]}/20")
    }

    println("\nResults of each students for each courses: ")
    println("---------------------------------")
    val jsNotes = mapOf(
        students[0] to 5,
        students[1] to 18,
        students[2] to 13
    )
    val ktNotes = mapOf(
        students[0] to 11,
        students[1] to 20,
        students[2] to 9
    )
    val results: MutableMap<String, MutableMap<String, Int?>>
    results = mutableMapOf(
        students[0] to mutableMapOf(
            courses[0] to javaNotes[students[0]],
            courses[1] to jsNotes[students[0]],
            courses[2] to ktNotes[students[0]]
        ),
        students[1] to mutableMapOf(
            courses[0] to javaNotes[students[1]],
            courses[1] to jsNotes[students[1]],
            courses[2] to ktNotes[students[1]]
        ),
        students[2] to mutableMapOf(
            courses[0] to javaNotes[students[2]],
            courses[1] to jsNotes[students[2]],
            courses[2] to ktNotes[students[2]]
        )
    )

//    println(results)
//    println(results.keys)
//    println(results[students[0]])
//    println(results[students[0]]?.keys)
//    println(results[students[0]]?.get(courses[0]))

    for (name in results.keys) {
        println("$name's results: ")

        val student = results.getValue(name)
        for ((key, value) in student) {
            println("$key -> $value")
        }
        println("")
    }

}