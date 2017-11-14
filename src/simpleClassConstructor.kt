package com.example
import java.io.Serializable

class Greeter(var name:String) : Serializable {
	
    fun greet(): String { return "Hello, $name" }
	
    override fun toString(): String { return greet() }
}

fun main(args: Array<String>) {	println(Greeter("CafeBabe")) }
