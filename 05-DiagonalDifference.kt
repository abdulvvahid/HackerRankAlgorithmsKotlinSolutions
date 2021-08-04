/**
 *
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:

1 2 3
4 5 6
9 8 9
The left-to-right diagonal 1+5+9=15 . The right to left diagonal 3+5+9=17 . Their absolute difference is |15-17|=2.
 *
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*
import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var primaryDiagonal : Int = 0
    var secondaryDiagonal : Int = 0
    var firstPointer : Int= 0
    var secondPointer : Int= arr.lastIndex

    for(x in arr.indices){
        for(y in arr.indices){
            if(x == y){
                primaryDiagonal += arr[x][y]
            }
            if(x == firstPointer && y == secondPointer){
                secondaryDiagonal += arr[x][y]
            }
        }
        firstPointer++
        secondPointer--
    }
    return abs(primaryDiagonal-secondaryDiagonal)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
