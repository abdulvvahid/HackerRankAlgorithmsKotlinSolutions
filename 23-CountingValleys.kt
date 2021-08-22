/**
 * An avid hiker keeps meticulous records of their hikes.
During the last hike that took exactly steps steps, for every step it was noted if it was an uphill,
U, or a downhill, D step. Hikes always start and end at sea level, and each step up or down represents
a  unit change in altitude. We define the following terms:

 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level
and ending with a step down to sea level.
A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and
ending with a step up to sea level.
Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.

Sample Input
8
UDDDUDUU

Sample Output
1
 * */

import kotlin.io.*
import kotlin.text.*

fun countingValleys(steps: Int, path: String): Int {
    var step: Int = 0
    var valley: Boolean = false
    var result: Int = 0

    for (index in path) {
        if (index == 'U') {
            step++
        } else {
            step--
        }
        if (step < 0) {
            valley = true
        }
        if (step == 0 && valley) {
            result++
            valley = false
        }
    }
    return result
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
