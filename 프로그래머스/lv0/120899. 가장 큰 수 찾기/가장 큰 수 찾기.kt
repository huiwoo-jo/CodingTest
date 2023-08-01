class Solution {
    fun solution(array: IntArray): IntArray = intArrayOf(array.maxOf{it}.toInt(),  array.indexOf(array.maxOf{it}).toInt())
}