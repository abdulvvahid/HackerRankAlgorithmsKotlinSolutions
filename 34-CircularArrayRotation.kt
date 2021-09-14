/**
Example
a = [3,4,5]
k = 2
queries = [1,2]
Here k is the number of rotations on a, and queries holds the list of indices to report.
First we perform the two rotations:
[3,4,5] -> [5,3,4] -> [4,5,3]
Now return the values from the zero-based indices 1 and 2 as indicated in the queries array.
a[1] = 5
a[2] = 3

Sample Input 0
3 2 3
1 2 3
0
1
2

Sample Output 0
2
3
1
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun circularArrayRotation(a: Array<Int>, k: Int, queries: Array<Int>): Array<Int> {
    val shiftedArray = a.rightShift(k)

    for (index in queries.indices) {
        queries[index] = shiftedArray[queries[index]]
    }
    return queries
}

fun <T> Array<T>.rightShift(d: Int): Array<T> {
    val newList = this.copyOf()
    var shift = d
    if (shift > size) shift %= size
    forEachIndexed { index, value ->
        val newIndex = (index + (size + shift)) % size
        newList[newIndex] = value
    }
    return newList
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val q = first_multiple_input[2].toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val queries = Array<Int>(q, { 0 })
    for (i in 0 until q) {
        val queriesItem = readLine()!!.trim().toInt()
        queries[i] = queriesItem
    }

    val result = circularArrayRotation(a, k, queries)

    println(result.joinToString("\n"))
}
