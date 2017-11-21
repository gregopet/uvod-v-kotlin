import java.lang.Math.pow

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

//#tag::parametrize_alias[]
typealias XpCalc = (Player, Species) -> Int
fun reward(p: Player, o: Species, calc: XpCalc) {
    val xp = calc(p, o)
    println("${p.name} got $xp for besting a $o")
}
//#end::parametrize_alias[]



//#tag::parametrize_with_receiver[]
fun reward1(p: Player, o: Species, calc: Player.(Species) -> Int) {
    val xp = p.calc(o)
    println("${p.name} got $xp for besting a $o")
}

//#end::parametrize_with_receiver[]


//#tag::shorthand[]
//val level: Int get() = Math.log10(experience).toInt()

fun xpToNextLevel(player: Player) =
    pow(10.0, player.level + 1.toDouble()) - player.experience
//#end::shorthand[]


//#tag::named_params[]
fun partyMembers(names: List<String>) =
    names.joinToString(
        ",", "The party contains ", "members",3, "and many more"
    )

fun partyMembersCleaner(names: List<String>) =
    names.joinToString(
        separator = ",",
        prefix = "The party contains ",
        limit = 3,
        truncated = " and many more",
        postfix = " members"
    )
//#end::named_params[]

fun lambdaLast() {
//#tag::lambda_last_and_it[]
val abc = listOf("a", "b", "c")

abc.joinToString(transform = { t -> t.toUpperCase() })
abc.joinToString() { t -> t.toUpperCase() }
abc.joinToString { it.toUpperCase() }
//#end::lambda_last_and_it[]
}


fun main(args: Array<String>) {
    args[0].capitalize()
}


//#tag::default_params[]
fun partyMembersSimple(names: List<String>) =
        "The party contains " + names.joinToString(",")
//#end::default_params[]


// vararg + *
// infix
// inline
// extension
// tail recursive

tailrec fun findFixPoint(x: Double = 1.0): Double
    = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))





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