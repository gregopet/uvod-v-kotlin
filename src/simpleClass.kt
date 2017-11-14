package com.example
import java.io.Serializable

class Greeter : Serializable {

	private var name: String = "World"

 	fun setName(name: String) { this.name = name }
	fun getName(): String { return this.name }

	fun greet(): String { return "Hello, $name" }

	override fun toString(): String { return greet() }
}

fun main(args: Array<String>) {	println(Greeter()) }
