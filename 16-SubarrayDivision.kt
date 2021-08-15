/**
 * Two children, Lily and Ron, want to share a chocolate bar.
 * Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

Example
s = [2,2,1,3,2]
d = 4
m = 2
Lily wants to find segments summing to Ron's birth day d = 4,
with a length equalling his birth month, m = 2.
In this case, there are two segments meeting her criteria: [2,2] and [1,3].

Sample Input 0
5
1 2 1 3 2
3 2

Sample Output 0
2
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var sum: Int = 0
    var result: Int = 0
    for (index in s.indices) {
        if (index + m <= s.size) {
            for (count in 0 until m) {
                sum += s[index + count]
            }
            if (sum == d) {
                result++
            }
        }
        sum = 0
    }

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
