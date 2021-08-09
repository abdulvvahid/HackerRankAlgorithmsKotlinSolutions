/**
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
S = '12:01:00PM'

Return '12:01:00'.
s = '12:01:00AM'

Return '00:01:00'.
 * */

import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val chars: MutableList<Char> = s.toMutableList()
    var hour: Int = s.take(2).toInt()
    val type = s.takeLast(2)
    chars.removeAt(9)
    chars.removeAt(8)
    if (type == "PM" && hour < 12) {
        hour += 12
        chars[0] = hour.toString()[0]
        chars[1] = hour.toString()[1]
    } else if (type == "AM" && hour >= 12) {
        if (hour == 12) {
            chars[0] = '0'
            chars[1] = '0'
        } else {
            hour -= 12
            chars[0] = hour.toString()[0]
            chars[1] = hour.toString()[1]
        }
    }
    return String(chars.toCharArray())
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
