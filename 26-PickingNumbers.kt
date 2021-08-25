/**

Given an array of integers, find the longest subarray where the absolute difference between
any two elements is less than or equal to 1.

Example
a= [1,1,2,2,4,4,5,5,5]

There are two subarrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5].
The maximum length subarray has 5 elements.

Sample Input 0
6
4 6 5 3 3 1

Sample Output 0
3
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

fun pickingNumbers(a: Array<Int>): Int {
    var result: Int = 0
    val resultArray = arrayListOf<Int>()
    for (index in a) {
        result = 0
        for (index2 in a) {
            if (abs(index - index2) <= 1 && index >= index2) {
                result++
            }
        }
        resultArray.add(result)
    }
    return resultArray.max()!!
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
