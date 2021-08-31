/**
Lily likes to play games with integers. She has created a new game where she determines the difference
between a number and its reverse. For instance, given the number 12, its reverse is 21. Their difference is 9.
The number 120 reversed is 21, and their difference is 99.

Sample Input
20 23 6

Sample Output
2
 * */
import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

fun beautifulDays(i: Int, j: Int, k: Int): Int {
    var result: Int = 0
    for(index in i..j){
        if( abs(index - (reverseNumber(index))) % k == 0){
            result++
        }
    }
    return result
}

fun reverseNumber(i: Int): Int{
    var number: Int = i
    var resultNumber: String = ""
    var arrayNumber: MutableList<Int> = mutableListOf<Int>()
    while(number / 10 > 0){
        arrayNumber.add(number%10)
        number = number / 10
    }
    arrayNumber.add(number)
    resultNumber = arrayNumber.joinToString(
        prefix = "",
        separator = "",
        postfix = "")
    return resultNumber.toInt()
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val i = first_multiple_input[0].toInt()

    val j = first_multiple_input[1].toInt()

    val k = first_multiple_input[2].toInt()

    val result = beautifulDays(i, j, k)

    println(result)
}
