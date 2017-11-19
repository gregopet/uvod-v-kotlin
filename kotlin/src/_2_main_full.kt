import java.lang.Math.pow
import kotlin.io.println

// uvod / prikazan brez in z crudom
// debata string = java string
// omeniš Unit
fun main(args: Array<String>): Unit {
    val player = Player("Luna", Species.Human)
    player.experience = pow(10.0, 22.0)
    player.greet()
}

// sledi debata tipov:
// Standardni tipi, java borrowed tipi, nullability
// Unit, Any, Nothing, Nothing? = null (Nothing ni potrebno pisat eksplicitno, lahko pa, da nam compiler pomaga)
// Ostali tipi: Array, Boolean, BooleanArray, Byte, ByteArray, Char, CharArray, CharSequence


// Types!

// numbers (double, float, long, int, short, byte); decimal, long, hex, binary, exponent, float, underscores as separators
// debata boxing številk..
// ni castanja (funkcije)

// Char (ni številka!)
// Bool
// Array (+ aliasi za Java primitivne arraye) - niso invariantni!
// String (multiline, templates..)