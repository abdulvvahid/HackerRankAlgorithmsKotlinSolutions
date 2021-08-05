/**
 * Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 * Print the decimal value of each fraction on a new line with 6 places after the decimal.

 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
though answers with absolute error of up to 10^-4 are acceptable.
 * */

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>) {
    val resultArray: Array<Int> = arrayOf(0,0,0)

    for(index in arr){
        when {
            index > 0 -> {
                resultArray[0]++
            }
            index < 0 -> {
                resultArray[1]++
            }
            else -> {
                resultArray[2]++
            }
        }
    }

    for(index in resultArray){
        println(index.toDouble()/arr.size.toDouble())
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
