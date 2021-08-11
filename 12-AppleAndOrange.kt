/**
 * Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
 * Using the information given below, determine the number of apples and oranges
 * that land on Sam's house.

In the diagram below:

The red region denotes the house, where s is the start point, and t is the endpoint.
The apple tree is to the left of the house, and the orange tree is to its right.
Assume the trees are located on a single point, where the apple tree is at point a,
and the orange tree is at point b.
When a fruit falls from its tree, it lands d units of distance from its tree of origin
along the x-axis.
 *A negative value of  means the fruit fell d units to the tree's left, and a positive
 * value of d means it falls d units to the tree's right. *
 * */

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'countApplesAndOranges' function below.
 *
 * The function accepts following parameters:
 *  1. INTEGER s
 *  2. INTEGER t
 *  3. INTEGER a
 *  4. INTEGER b
 *  5. INTEGER_ARRAY apples
 *  6. INTEGER_ARRAY oranges
 */

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    // Write your code here
    var countOfApple: Int = 0
    var countOfOrange: Int = 0
    for (newApples in apples.indices) {
        apples[newApples] += a
        if (apples[newApples] in s..t) {
            countOfApple++
        }
    }
    for (newOranges in oranges.indices) {
        oranges[newOranges] += b
        if (oranges[newOranges] in s..t) {
            countOfOrange++
        }
    }
    println(countOfApple)
    println(countOfOrange)

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}
