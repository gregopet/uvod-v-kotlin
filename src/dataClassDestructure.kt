data class Result(var result: Int, var error: String)

fun compute(): Result { return Result(42, "What was the question?") }

fun main(args: Array<String>) {
    var (result, error) = compute()
    check(result == 42)    
    check(error == "What was the question?")
}
