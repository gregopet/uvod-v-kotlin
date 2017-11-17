// Default parameter, typealias je samo šminka
// toList metoda..
typealias Formatter1 = (s: String, w: Int) -> String
fun padRight(input: String, length: Int) = input.padEnd(length)
fun row2(cols: List<String>, fmt: Formatter1 = ::padRight) {
    val columnWidth = 10 // TODO! ;-)
    cols.forEach { col -> println(fmt(col, columnWidth)) }
}
fun main4(args: Array<String>) = row2(args.toList())
