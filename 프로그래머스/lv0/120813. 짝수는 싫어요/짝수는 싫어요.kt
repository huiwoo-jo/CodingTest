class Solution {
    fun solution(n: Int): IntArray = (0..n).filterNot{it%2==0}.toIntArray()
}