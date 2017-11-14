package com.example
import java.io.Serializable

class Greeter(initialName:String) : Serializable {

	var name: String = initialName 

	fun greet(): String { return "Hello, $name"	}
	override fun toString(): String { return greet() }
}

fun main(args: Array<String>) {	println(Greeter("CafeBabe")) }
