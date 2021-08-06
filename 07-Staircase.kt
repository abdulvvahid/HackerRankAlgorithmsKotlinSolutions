/**
 * Staircase detail

This is a staircase of size n= 4
     4
    44
   444
  4444

Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

 * */

import java.util.*
import kotlin.io.*
import kotlin.text.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {

    var z : Int = n - 1
    repeat(n){
        for(y in 1..n){
            if(z<y){
                print("#")
            }else{
                print(" ")
            }
        }
        z--
        println("")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
