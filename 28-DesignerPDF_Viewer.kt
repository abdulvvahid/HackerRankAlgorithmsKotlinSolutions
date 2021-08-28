/**
 *  When a contiguous block of text is selected in a PDF viewer, the selection is highlighted
 *  with a blue rectangle. In this PDF viewer, each word is highlighted independently. For example:
 *
 *  There is a list of 26 character heights aligned by index to their letters.
 *  For example, 'a' is at index 0 and 'z' is at index 25. There will also be a string.
 *  Using the letter heights given, determine the area of the rectangle highlight in mm'2
 *  assuming all letters are 1mm wide.
 *
Example
h=[1,3,1,3,1,4,1,3,2,5,5,5,5,1,1,5,5,1,5,2,5,5,5,5,5,5]word = torn
The heights are i=2, o=1, r=1 and n=1. The tallest letter is 2 high and there are 4 letters.
The hightlighted area will be 2 * 4 = 8mm so the answer is 8.

Sample Input 0
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 0
9

 * */

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

fun designerPdfViewer(h: Array<Int>, word: String): Int {

    val alphabet: MutableList<Char> = mutableListOf()
    val wordArray: CharArray = word.toCharArray()
    var maxInt: Int = 0

    for (index in 'a'..'z') {
        alphabet.add(index)
    }

    for ((index, value) in alphabet.withIndex()) {
        for (charOfWord in wordArray) {
            if (charOfWord == value && h[index] > maxInt) {
                maxInt = h[index]
            }
        }
    }

    return maxInt * wordArray.size
}

fun main(args: Array<String>) {

    val h = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val word = readLine()!!

    val result = designerPdfViewer(h, word)

    println(result)
}
