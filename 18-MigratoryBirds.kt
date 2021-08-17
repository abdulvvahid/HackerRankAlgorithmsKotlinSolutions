/**
 * Given an array of bird sightings where every element represents a bird type id,
determine the id of the most frequently sighted type.
 * If more than 1 type has been spotted that maximum amount, return the smallest of their ids.

Example
arr = [1,1,2,2,3]
There are two each of types 1 and 2, and one sighting of type 3.
Pick the lower of the two types seen twice: type 1.

Function Description
Complete the migratoryBirds function in the editor below.
migratoryBirds has the following parameter(s):
int arr[n]: the types of birds sighted

Returns
int: the lowest type id of the most frequently sighted birds

Input Format
The first line contains an integer, n, the size of arr.
The second line describes arr as n space-separated integers,
each a type number of the bird sighted.

Constraints
5 <= n <= 2*10^5
It is guaranteed that each type is , , , , or .

Sample Input 0
6
1 4 4 4 5 3

Sample Output 0
4
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

fun migratoryBirds(arr: Array<Int>): Int {

    var sameNumber: Int = 0
    var result: Int = 0
    val ourMap: MutableMap<Int, Int> = mutableMapOf(1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0)

    for (index in arr) {
        sameNumber = ourMap[index]!!
        ourMap[index] = ++sameNumber
        sameNumber = 0
    }

    for ((index, value) in ourMap) {
        if (value > sameNumber && index > result) {
            result = index
            sameNumber = value
        }
    }

    return result
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = migratoryBirds(arr)

    println(result)
}
