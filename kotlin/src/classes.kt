import kotlin.properties.Delegates

//#tag::shorthand[]
class PlayerSkill(val name: String, private var level: Int = 0)
//#end::shorthand[]

fun normalize(str: String?) = str!!
fun LOG(str: String) {}


//#tag::longhand[]
class Equipment(typeName: String) {

    val type: String = normalize(typeName)
}
//#end::longhand[]


//#tag::secondary_constructor[]
class LootBox(val coins: Int, itemName: String?) {

    @JvmField
    val item = normalize(itemName)

    init {
        LOG("Created loot box containing $coins coins")
    }

    constructor(coins: Int) : this(coins, null) {
        LOG("Loot box without item created")
    }


}
//#end::secondary_constructor[]



open
//#tag::custom_props[]
class Spell(val name: String, var power: Mana, effect: String) {

    var effect: String = effect
        private set

    val hasAnyEffects get() = !effect.isNullOrBlank()

    var manaPoints: Int
        get() = power.points
        set(value) {
            power = Mana(value)
        }

}
//#end::custom_props[]

//#tag::inheritance[]
open class Mana(val points: Int)

interface NumericProperty {
    val asInteger: Int

    fun asShortOrThrow(): Short {
        check(asInteger in Short.MIN_VALUE..Short.MAX_VALUE)
        return asInteger.toShort()
    }
}

class PlayerMana(points: Int): Mana(points), NumericProperty {

    override val asInteger: Int
        get() = points
}

//#end::inheritance[]


fun m23ain(args: Array<String>) {
val farawayLibrary = emptyMap<String, String>()

//#tag::delegation[]
// delegiranje interface-a
class ManaPool(mana: PlayerMana) : NumericProperty by mana

// delegiranje lastnosti s pomočjo vmesnih classov
class RareSpell(name: String) {

    val ritual: String by lazy {
        farawayLibrary.get(name)!!
    }

    val ingredients: String by Delegates.observable("<no name>") {
        prop, old, new ->
            println("Ingredients were updated to $new")
    }

}
//#end::delegation[]
}



fun mai123n(args: Array<String>) {
//#tag::data_classes[]
data class Purse(val coins: Int, val gems: Short)

assert(Purse(5, 10) == Purse(5, 10))

println(Purse(50, 20)) // Purse(coins=50, gems=20)

val (coins, gems) = Purse(50, 30)
//#end::data_classes[]
}


fun main() {
//#tag::generics1[]
class Oracle<out T>(private val quest: T) {
    fun giveQuest(): T {
        return quest
    }
}

class Adventurer<in T> {
    fun acceptQuest(quest: T) {  }
}

abstract class Sage<T> {
    abstract fun giveQuest(): T
    abstract fun acceptQuest(quest: T)
}
//#end::generics1[]

//#tag::generics1a[]
var anyOracle: Oracle<Any>
var anyAdventurer: Adventurer<Any>

anyOracle = Oracle("Quest for the Golden String") // OK
anyAdventurer = Adventurer<String>() // NAPAKA!
//#end::generics1a[]


//#tag::generics2[]
fun copy(from: Array<out CharSequence>, to: List<Any>) {}

val stringArray = arrayOf("a", "b", "c")
copy(stringArray, mutableListOf())
//#end::generics2[]
}


//#tag::generics3[]
fun <T> giveQuest(): T {
    ...
}
//#end::generics3[]
