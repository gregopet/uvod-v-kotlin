import java.io.File

fun x(a:Any?) {
    var b = a
    if (b != null) {
        b.toString()
    }
    val contents = try {
        File("foo").readText()
    } catch (e: Exception) {
        "Error reading file!"
    }
}

