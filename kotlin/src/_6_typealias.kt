
// Typealias ko funkcije postanejo kompleksne
typealias Formatter = (String, Int) -> String
fun printRow1(cols: List<String>, fmt: Formatter) {
    val columnWidth = 10 // TODO! ;-)
    cols.forEach { col -> println(fmt(col, columnWidth)) }
}
