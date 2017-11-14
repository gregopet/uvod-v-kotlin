data class Person(var name: String, var age: Int)

fun main(args: Array<String>) {
    var chuck = Person("Norris", 77)
    
    check(chuck == Person("Norris", 77))    
    check(chuck.toString() == "Person(name=Norris, age=77)")
}
