/**
 * A person wants to determine the most expensive computer keyboard and USB drive
that can be purchased with a give budget. Given price lists for keyboards and USB drives
and a budget, find the cost to buy them. If it is not possible to buy both items, return -1

Example
b= 60
keyboards = [40,50,60]
drives = [5,8,12]

The person can buy a 40 keyboard + 12 USB drive = 52, or a 50 keyboard + 8 USB drive = 58.
Choose the latter as the more expensive option and return .

Sample Input 0
10 2 3
3 1
5 2 8

Sample Output 0
9
 * */

import java.util.*

fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    val totalList: MutableList<Int> = mutableListOf()
    var result: Int = -1

    for(keyboard in keyboards){
        for(drive in drives){
            totalList.add(keyboard + drive)
        }
    }
    totalList.sort()
    for(index in totalList){
        if(index in (result + 1)..b){
            result = index
        }
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val bnm = scan.nextLine().split(" ")

    val b = bnm[0].trim().toInt()

    val n = bnm[1].trim().toInt()

    val m = bnm[2].trim().toInt()

    val keyboards = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val drives = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    println(moneySpent)
}
