/**
 *  Given an array of integers and a positive integer k,
 *  determine the number of (i, j) pairs where i<j and ar[i] + ar[j] is divisible by k.
 *
 *  Example
 *  ar = [1,2,3,4,5,6]
 *  k = 5
 *  Three pairs meet the criteria: [1,4],[2,3] and [4,6].

Sample Input
STDIN           Function
-----           --------
6 3             n = 6, k = 3
1 3 2 6 1 2     ar = [1, 3, 2, 6, 1, 2]

Sample Output
5
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

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {
    var result: Int = 0
    var count: Int = 1
    for (firstPointer in 0 until n) {
        for (secondPointer in count until n) {
            if ((ar[firstPointer] + ar[secondPointer]) % k == 0) {
                result++
            }
        }
        count++
    }
    return result
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
