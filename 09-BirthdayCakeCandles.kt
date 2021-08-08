/**
 * You are in charge of the cake for a child's birthday.
 * You have decided the cake will have one candle for each year of their total age.
 * They will only be able to blow out the tallest of the candles.
 * Count how many candles are tallest.
 *
 * Example
 * candles = [4.4.1.3]
 * The maximum height candles are 4 units high. There are 2 of them, so return 2.
 *
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    val maxInt: Int = candles.max()!!
    val candlesList: List<Int> = candles.asList()
    return candlesList.filter { it == maxInt }.size
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
