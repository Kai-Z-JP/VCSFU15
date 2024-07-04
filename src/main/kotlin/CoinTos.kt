package jp.kaiz

import kotlin.random.Random

fun main() {
    println("Tossing a coin...")
    val outcomes = mutableMapOf("Heads" to 0, "Tails" to 0)

    for (i in 1..3) {
        val result = if (Random.nextBoolean()) "Heads" else "Tails"
        outcomes[result] = outcomes[result]!! + 1
        println("Round $i: $result")
    }

    println("Heads: ${outcomes["Heads"]}, Tails: ${outcomes["Tails"]}")
}
