data class Result(var result: Int, var error: String)

fun compute(): Result { return Result(42, "What was the question?") }

fun main(args: Array<String>) {
    var (result, _) = compute().copy(result = 44)
    check(result == 44)    
}
