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
// suspendable functions (yield, coroutines.. no VM or OS support required), can only call from another suspendable