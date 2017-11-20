/*
//#tag::intro[]
fun main(args: Array<String>) {
    println("I'm Luna, a lvl 22 human adventurer")
}
//#end::intro[]
*/




fun useful(args: Array<String>) {
    val closed = true

//#tag::useful1[]
val list = listOf(1, 2, 3)
val mutableSet = mutableSetOf("abc", "def")

repeat(10) { print("NANA") }.also { println(" BATMAN!") }
val lazyValue = lazy { /** Some expensive operation.. */ }

require(args.size == 2) {
    println("Needs to be called with at least two arguments!")
}
TODO("Primeri še niso do konca izdelani")
//#end::useful1[]
}



/*
//#tag::intro_short[]
fun main(args: Array<String>) {
    println("I'm Luna, a lvl 22 human adventurer")
}
//#end::intro_short[]
*/

object StandardizationGuild {
    fun officialExperienceCalc(player: Player, opponent: Species) = 42
}


fun sadasd(args: Array<String>) {
//#tag::pass_around[]
    lateinit var xpCalc: (Player, Species) -> Int

    xpCalc = fun(player: Player, opponent: Species): Int {
        return 100
    }

    xpCalc = { player: Player, opponent: Species -> 100 }

    xpCalc = StandardizationGuild::officialExperienceCalc

//#end::pass_around[]
}

fun sadasd2134234(args: Array<String>) {
//#tag::parametrize[]
fun reward(p: Player, o: Species, calc: (Player, Species) -> Int) {
    val xp = calc(p, o)
    println("${p.name} got $xp for besting a $o")
}
//#end::parametrize[]
}





//#tag::visibility[]
fun visibleFromEverywhere() {}

private fun visibleFromFile() {}

internal fun visibleFromModule() {}

class SomeClass {

    fun visibleFromEverywhere() {}

    private fun visibleFromClass() {}

    protected fun visibleFromSubclasses() {}
}
//#end::visibility[]