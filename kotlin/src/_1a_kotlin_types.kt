import java.lang.Math.pow
import java.net.CookieManager
import java.util.concurrent.CountDownLatch
import kotlin.math.log10

fun numbers(a: Array<String>) {
//#tag::number_types[]
val intVal = 42
val doubleVal = 42.0

val longVal = 42L
val floatVal = 42F

val shortVal: Short = 42

val byteVal: Byte = intVal.toByte()
//#end::number_types[]
}

fun strings(a: Array<String>) {
//#tag::strings[]
val introduction = "I'm Luna, a lvl 22 human adventurer"
val description  = """
   I'm Luna, a lvl 22 human adventurer.

   I am currently unharmed and carry nothing in my pockets.

   My wooden sword "Sparrow" is ready in my hand.
"""
//#end::strings[]
}


fun strings1(a: Array<String>) {
//#tag::strings1[]
val name = "Luna"

println("My name $name is ${name.length} letters long")
//#end::strings1[]
}


//#tag::special_types[]
fun vrnemKarkoli(): Any {
    return CountDownLatch(5)
}

fun neVrnemNicesar(): Unit {
    println("Unit si lahko predstavljamo kot Void")
}

fun nikoliSeNeVrnem(): Nothing {
    throw IllegalStateException("Adijo, kruti svet")
}
//#end::special_types[]

/*
fun nullability() {
//#tag::null1[]
val requirement1: String = null // NAPAKA!

val requirement2: String? = null

val requirement3 = null
//#end::null1[]
}
*/


/*
fun nullability2() {
//#tag::null2[]
var requirement1 = "Udeleženci se morajo smehljati"

requirement1 = null // NAPAKA!
//#end::null2[]
}
*/


//#tag::nullInterface[]
interface SkillBuff {
    val factor: Double
}
//#end::nullInterface[]
/*
//#tag::null3[]
fun getActualPower(baseSkill: Double, buff: SkillBuff?): Double {
    return baseSkill * buff.factor // NAPAKA!
}
//#end::null3[]
*/
//#tag::null4[]
fun getActualPower(baseSkill: Double, buff: SkillBuff?): Double {
    if (buff != null) {
        return baseSkill * buff.factor
    } else {
        return baseSkill
    }
}
//#end::null4[]

//#tag::null5[]
fun getActualPower1(baseSkill: Double, buff: SkillBuff?): Double {
    val factor = buff?.factor ?: 1.0
    return baseSkill * factor
}
//#end::null5[]


//#tag::null6[]
fun getActualPower2(baseSkill: Double, buff: SkillBuff?): Double {
    return baseSkill * buff!!.factor
}
//#end::null6[]


//#tag::null7[]
fun main(args: Array<String>) {

    // Prevajalnik dopusti potencialno napako!
    System.console().readLine()
}
//#end::null7[]