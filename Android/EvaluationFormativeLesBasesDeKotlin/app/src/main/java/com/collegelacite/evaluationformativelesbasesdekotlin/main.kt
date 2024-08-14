package com.collegelacite.evaluationformativelesbasesdekotlin

fun main(args: Array<String>) {
//    val (a0, a1) = args[0].split(',')
    var annéeDébut = 2000
    var annéeFin = 2950

    var nb = bissextiles(annéeDébut, annéeFin, true)
    println("Il y a ${nb} années bissextiles entre l'an ${annéeDébut} et l'an ${annéeFin}.")

    annéeDébut += 1000
    nb = bissextiles(annéeDébut, annéeFin, false)
    println("\nIl y a ${nb} années bissextiles entre l'an ${annéeDébut} et l'an ${annéeFin}.")

}


fun bissextiles(anneeDeb: Int, anneeFin: Int, afficherReusltat: Boolean = true): List<Int> {
    var debut = anneeDeb
    var fin = anneeFin

    if (debut > fin) {
        val temp = debut
        debut = fin
        fin = temp
    }

    val bissextiles = mutableListOf<Int>()

    for (i in debut..fin) {
        if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
            bissextiles.add(i)
            if (afficherReusltat==true) {
                println(i)
            }
        }
    }

    return bissextiles
}