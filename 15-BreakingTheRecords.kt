/**
 * Maria plays college basketball and wants to go pro.
 * Each season she maintains a record of her play.
 * She tabulates the number of times she breaks her season record
for most points and least points in a game.
 * Points scored in the first game establish her record for the season,
and she begins counting from there.

Example
scores = [12, 24, 10, 24]
Scores are in the same order as the games played. She tabulates her results as follows:
Count
Game  Score  Minimum  Maximum   Min Max
0      12     12       12       0   0
1      24     12       24       0   1
2      10     10       24       1   1
3      24     10       24       1   1

Sample Input 0
9
10 5 20 20 4 5 2 25 1

Sample Output 0
2 4
 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun breakingRecords(scores: Array<Int>): Array<Int> {
    var minScores = scores[0]
    var maxScores = scores[0]
    val changedCountArray: Array<Int> = arrayOf(0, 0)
    for (score in scores) {
        if (score > maxScores) {
            changedCountArray[0]++
            maxScores = score
        } else if (score < minScores) {
            changedCountArray[1]++
            minScores = score
        }
    }
    return changedCountArray
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val scores = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
