/**
 * Two cats and a mouse are at various positions on a line. You will be given their starting positions.
 * Your task is to determine which cat will reach the mouse first, assuming the mouse does not move and
 * the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move
 * and it will escape while they fight.

You are given q queries in the form of x, y, and z representing the respective positions
for cats A and B, and for mouse C. Complete the function catAndMouse to return the appropriate
answer to each query, which will be printed on a new line.

If cat A catches the mouse first, print Cat A.
If cat B catches the mouse first, print Cat B.
If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

Example
x = 2
y = 5
z = 4
The cats are at positions 2 (Cat A) and 5 (Cat B), and the mouse is at position 4.
Cat B, at position 5 will arrive first since it is only 1 unit away while the other is 2 units away.
Return 'Cat B'.

Sample Input 0
2
1 2 3
1 3 2

Sample Output 0
Cat B
Mouse C
 * */

import java.util.*
import kotlin.io.*
import kotlin.text.*
import kotlin.math.abs

fun catAndMouse(x: Int, y: Int, z: Int): String {

    val differenceXtoZ: Int = abs(x - z)
    val differenceYtoZ: Int = abs(y - z)
    var result: String = ""
    if (differenceXtoZ > differenceYtoZ) {
        result = "Cat B"
    } else if (differenceYtoZ > differenceXtoZ) {
        result = "Cat A"
    } else if (differenceXtoZ == differenceYtoZ) {
        result = "Mouse C"
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val xyz = scan.nextLine().split(" ")

        val x = xyz[0].trim().toInt()

        val y = xyz[1].trim().toInt()

        val z = xyz[2].trim().toInt()

        val result = catAndMouse(x, y, z)

        println(result)
    }
}
