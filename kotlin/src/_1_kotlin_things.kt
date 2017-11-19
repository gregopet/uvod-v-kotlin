//#tag::enum[]
enum class Species {
    Human, Elf, Dwarf, Orc
}
//#end::enum[]

//#tag::interface[]
interface Character {
    val name: String
    val species: Species
    fun greet()
}
//#end::interface[]

//#tag::annotation[]
@Target(
    AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION
)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
annotation class Biological
//#end::annotation[]


@Biological
class Player(override var name: String, override val species: Species): Character {

    var experience: Double = 0.0

    val level: Int get() = Math.log10(experience).toInt()

    override fun greet() {
        println("I'm $name, a level $level $species adventurer")
    }
}

/** Cheat due to available space!
//# tag::class[]
@Biological
class Player(var name: String, val species: Species): Character {

    var experience: Double = 0.0

    val level: Int get() = Math.log10(experience).toInt()

    override fun greet() {
        println("I'm $name, a level $level $species adventurer")
    }
}
//#end::class[]
*/


//#tag::object[]
object AdventurerGuild {

    val entryFee: Int = 30

    fun enroll(player: Player) {
        println("$player is now enrolled in the guild")
    }

    internal fun politics() { }
}
//#end::object[]


//#tag::exceptions[]
fun die(): Nothing {
    throw IllegalStateException("Dead!")
}
//#end::exceptions[]

// + operators + generics!
// kaj manjka!