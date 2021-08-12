/**
 * You are choreographing a circus show with various animals.
For one act, you are given two kangaroos on a number line ready to
jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location x1 and moves at a rate of v1 meters per jump.
The second kangaroo starts at location x2 and moves at a rate of v2 meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time
as part of the show. If it is possible, return YES, otherwise return NO.

Example
x1 = 2
v1 = 1
x2 = 1
v2 = 2
After one jump, they are both at x=3, (x1+v1=2+1,x2+v2=1+2), so the answer is YES.

Sample Input 0
0 3 4 2

Sample Output 0
YES
 * */

import kotlin.io.*
import kotlin.text.*

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    var firstKang: Int = x1
    var secondKang: Int = x2

    while (firstKang != secondKang) {
        if (firstKang - secondKang > 0 && v1 - v2 >= 0
            || secondKang - firstKang > 0 && v2 - v1 >= 0
        ) {
            return "NO"
        }
        firstKang += v1
        secondKang += v2
        if (firstKang == secondKang) {
            return "YES"
        }
    }
    return "NO"
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}
