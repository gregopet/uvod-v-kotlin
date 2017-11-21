import java.lang.Math.pow
import kotlin.coroutines.experimental.*

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


fun main(args: Array<String>) {
//#tag::multiple_return[]
fun claimReward(opponent: Species): Pair<Int, String> {
    return if (opponent == Species.Orc)
        Pair(3, "Smelly boots")
    else
        Pair(20, "Unidentified ring")
}

val (coins, loot) = claimReward(Species.Dwarf)
//#end::multiple_return[]
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
fun timesTwo(num: Int) = num * 2
//#end::shorthand[]


/*
fun asdasdad() {
//#tag::named_params1[]
fun partyMembers(names: List<String>) =
    names.joinToString(
        ",", "The party contains ", "members", 3, "and many more"
    )
//#end::named_params1[]
//#tag::named_params2[]
fun partyMembers(names: List<String>) =
    names.joinToString(
        separator = ",",
        prefix = "The party contains ",
        limit = 3,
        truncated = " and many more",
        postfix = " members"
    )
//#end::named_params2[]
}
*/

fun lambdaLast() {
//#tag::lambda_last_and_it[]
val abc = listOf("a", "b", "c")

abc.joinToString(transform = { t -> t.toUpperCase() })
abc.joinToString() { t -> t.toUpperCase() }
abc.joinToString { it.toUpperCase() }
//#end::lambda_last_and_it[]
}


//#tag::default_params[]
fun partyMembersSimple(names: List<String>) =
        "The party contains " + names.joinToString(",")
//#end::default_params[]


fun asdasd() {
//#tag::infix[]
fun Player.introduce(other: Player) {
    println("Hey ${other.name}, I'm ${this.name}")
}
//#end::infix[]
}




// vararg + *
// inline



// not used!
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