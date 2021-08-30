/**
A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline,
the professor decides to cancel class if fewer than some number of students are present when class starts.
Arrival times go from on time (arrivalTime <= 0) to arrived late (arrivalTime > 0).

Given the arrival time of each student and a threshhold number of attendees,
determine if the class is cancelled.

Example
n = 5
k = 3
a = [-2, -1, 0, 1, 2]
The first 3 students arrived on. The last 2 were late.
The threshold is 3 students, so class will go on. Return YES.

Sample Input
2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output
YES
NO
 * */
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun angryProfessor(k: Int, a: Array<Int>): String {
    return if (a.filter { it <= 0 }.size < k) "YES" else "NO"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val k = first_multiple_input[1].toInt()

        val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = angryProfessor(k, a)

        println(result)
    }
}
