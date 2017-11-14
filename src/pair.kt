fun compute(): Pair<Int, String> { return Pair(42, "What was the question?") }

fun main(args: Array<String>) {
    var (result, _) = compute()
    check(result == 42)
}
