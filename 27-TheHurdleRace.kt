/**
 * A video player plays a game in which the character competes in a hurdle race.
 * Hurdles are of varying heights, and the characters have a maximum height they can jump.
 * There is a magic potion they can take that will increase their maximum jump height by 1
 * unit for each dose. How many doses of the potion must the character take to be able to
 * jump all of the hurdles. If the character can already clear all of the hurdles, return 0.
 *
 *
Example
height = [1,2,3,3,2]
k = 1
The character can jump  unit high initially and must take  doses of potion to be able to jump
all of the hurdles.

Sample Input 0
5 4
1 6 3 5 2

Sample Output 0
2
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun hurdleRace(k: Int, height: Array<Int>): Int {

    return if (k - height.max()!! <= 0) {
        height.max()!! - k
    } else {
        0
    }

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val height = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = hurdleRace(k, height)

    println(result)
}
