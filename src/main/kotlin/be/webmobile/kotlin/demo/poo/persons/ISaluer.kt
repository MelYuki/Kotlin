package be.webmobile.kotlin.demo.poo.persons

// fun: empeche une interface d'avoir plusieur méthode à redéfinir (1seule abstract)
// => interface fonctionnelle
fun interface ISalueur {

    fun saluer()

    fun saluerImpl(){
        println("déjà impl")
    }

}