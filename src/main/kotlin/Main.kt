fun main() {
    val medvedev = President("Medvedev", 4)
    val putin = President("Putin", 21)
    val mishustin = President("Mishustin", 0)

    println(Tereshkova.obunulator(medvedev))
    println(Tereshkova.obunulator(putin))
    println(Tereshkova.obunulator(mishustin))
}
