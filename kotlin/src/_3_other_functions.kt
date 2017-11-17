// kotlin je pragmatičen jezik!
// primeri drugih koristnih funkcij - morda screenshot iz IDE-ja?
fun main(args: Array<String>) {
    require(args.size == 2) {
        println("Error: program needs to be called with at least two arguments")
    }
    println("Moje ime je ${args[0]} in sem ${args[1]}")
    TODO("Najdi bolj zanimive primere!")
}