// function references + listOf
// omeniš Java SAM - single abstract method
fun row(cols: List<String>, fmt: (String) -> String) {
    cols.forEach { col -> fmt(col) }
}

fun col(content: String) = content.padStart(10)

fun main3(args: Array<String>) {
    row(listOf("Gregor", "Meta", "Jana"), ::col)
}