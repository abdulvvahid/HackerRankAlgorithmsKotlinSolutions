/**
 * Two friends Anna and Brian, are deciding how to split the bill at a dinner.
 * Each will only pay for the items they consume.
 * Brian gets the check and calculates Anna's portion.
 * You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2,4,6].
Anna declines to eat item k = bill[2] which costs 6.
If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3.
If he includes the cost of bill[2], he will calculate (2+4+6)/2=6.
In the second case, he should refund 3 to Anna.

Sample Input 0
4 1
3 10 2 9
12

Sample Output 0
5
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun bonAppetit(bill: Array<Int>, k: Int, b: Int): Unit {
    var annasBill = 0
    for (eat in bill.indices) {
        if (eat != k)
            annasBill += bill[eat]
    }
    if (b == annasBill / 2) {
        println("Bon Appetit")
    } else {
        println(b - (annasBill / 2))
    }
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val bill = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val b = readLine()!!.trim().toInt()

    bonAppetit(bill, k, b)
}
