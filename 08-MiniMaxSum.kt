/**
 * Given five positive integers, find the minimum and maximum values
  that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as
  a single line of two space-separated long integers.
 * */

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun miniMaxSum(arr: Array<Int>): Unit {
    var total : Long = 0
    for(index in arr){
        total += index.toLong()
    }
    val minNumber = (total-arr.max()!!)
    val maxNumber = (total-arr.min()!!)
    println("$minNumber $maxNumber")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
