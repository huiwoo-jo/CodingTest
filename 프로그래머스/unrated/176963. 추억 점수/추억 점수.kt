class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray = photo.map{it.sumOf{name.zip(yearning.toTypedArray()).toMap()[it] ?: 0}}.toIntArray()
}