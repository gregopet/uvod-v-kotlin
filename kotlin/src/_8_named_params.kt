// named parametri
fun main(args: Array<String>) {
    val fugly = args.joinToString("|", "||", "||")
    val pretty = args.joinToString(
            prefix = "||",
            separator = "|",
            postfix = "||"
    )
    println(pretty)
}



//TODO:
// inline fun
// functions with receiver
