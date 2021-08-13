/**
 * There will be two arrays of integers.
 * Determine all integers that satisfy the following two conditions:

1- The elements of the first array are all factors of the integer being considered
2- The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays.
Determine how many such numbers exist.

Example
a = [2,6]
b = [24,36]
There are two numbers between the arrays: 6 and 12.
6%2=0, 6%6=0, 24%6=0 and 36%6=0 for the first value.
12%2=0, 12%6=0 and 24%12=0, 36%12=0 for the second value. Return 2.

Sample Input
2 3
2 4
16 32 9

Sample Output
3

 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var result: Int = 0
    val mulArray: MutableList<Int> = mutableListOf()
    var check: Boolean = true
    for (value in 1..b[0]) {
        for (index in a) {
            if (value % index != 0) {
                check = false
            }
        }
        if (check)
            mulArray.add(value)
        check = true
    }
    check = true
    for (value in mulArray) {
        for (index in b) {
            if (index % value != 0) {
                check = false
            }
        }
        if (check) {
            result++
        }
        check = true
    }

    return result
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
