/**
 * There is a large pile of socks that must be paired by color.
 * Given an array of integers representing the color of each sock,
 * determine how many pairs of socks with matching colors there are.
Example
n = 7
ar = [1,2,1,2,1,3,2]
There is one pair of color 1 and one of color 2.
There are three odd socks left, one of each color. The number of pairs is 2.

Sample Input
STDIN                       Function
-----                       --------
9                           n = 9
10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]

Sample Output
3
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var result: Int = 0
    var boo: Boolean = false
    ar.sort()
    for (index in 0..ar.size - 2) {
        if (ar[index] == ar[index + 1] && !boo) {
            result++
            boo = true
            continue
        }
        boo = false
    }

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
