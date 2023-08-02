class Solution {
    fun solution(array: IntArray): Int = array.joinToString("").filter{it=='7'}.length
}