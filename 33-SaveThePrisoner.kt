/**
Example
 n = 4
 m = 6
 s = 2
There are 4 prisoners, 6 pieces of candy and distribution starts at chair 2.
The prisoners arrange themselves in seats numbered 1 to 4.
Prisoners receive candy at positions 2,3,4,1,2,3. The prisoner to be warned sits in chair number 3.

Sample Input 0
2
5 2 1
5 2 2

Sample Output 0
2
3

 * */
import kotlin.io.*
import kotlin.text.*

fun saveThePrisoner(n: Int, m: Int, s: Int): Int {
    val remain: Int = m % n
    if ((remain + s - 1) % n == 0 ) {
        return n
    }
    return ((remain + s -1) % n)
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val s = first_multiple_input[2].toInt()

        val result = saveThePrisoner(n, m, s)

        println(result)
    }
}
