/**
 * The Utopian Tree goes through 2 cycles of growth every year.
 * Each spring, it doubles in height. Each summer, its height increases by 1 meter.
A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring.
How tall will the tree be after n growth cycles?
For example, if the number of growth cycles is n=5, the calculations are as follows:
Period  Height
0          1
1          2
2          3
3          6
4          7
5          14

Sample Input
3
0
1
4

Sample Output
1
2
7
 * */

import kotlin.io.*
import kotlin.text.*

fun utopianTree(n: Int): Int {
    var result = 1
    for(i in 0 until n){
        if(i%2==0){
            result *= 2
        }else{
            result++
        }
    }
    return result
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val result = utopianTree(n)

        println(result)
    }
}
