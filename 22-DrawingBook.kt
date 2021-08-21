/**
 * A teacher asks the class to open their books to a page number.
 * A student can either start turning pages from the front of the book or from the back of the book.
 * They always turn pages one at a time. When they open the book, page  is always on the right side:
 *
 * When they flip page 1, they see pages 2 and 3. Each page except the last page will always be printed
 * on both sides. The last page may only be printed on the front, given the length of the book.
 * If the book is n pages long, and a student wants to turn to page p, what is the minimum number
 * of pages to turn? They can start at the beginning or the end of the book.

Given n and p, find and print the minimum number of pages that must be turned in order to arrive at page .

Sample Input 0
6
2

Sample Output 0
1
 * */

import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

fun pageCount(n: Int, p: Int): Int {
    var pageStartOne: Int = 1
    var pageStartLast: Int = n - (n % 2)
    for (count in 0 until n) {
        if (p <= pageStartOne || p >= pageStartLast) {
            return count
        }
        pageStartOne = pageStartOne + 2
        pageStartLast = pageStartLast - 2
    }
    return 0
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val p = readLine()!!.trim().toInt()

    val result = pageCount(n, p)

    println(result)
}
