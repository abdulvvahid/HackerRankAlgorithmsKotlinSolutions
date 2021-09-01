/**
Example
n = 5.

Day Shared Liked Cumulative
1      5     2       2
2      6     3       5
3      9     4       9
4     12     6      15
5     18     9      24

Sample Input
3
Sample Output
9
 * */
import kotlin.io.*
import kotlin.text.*

fun viralAdvertising(n: Int): Int {
    var result: Int = 0
    var startPoint: Int = 5
    for(index in 1..n){
        result += startPoint / 2
        startPoint = (startPoint / 2) * 3
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val result = viralAdvertising(n)

    println(result)
}
