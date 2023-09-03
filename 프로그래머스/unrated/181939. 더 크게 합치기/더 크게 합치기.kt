import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
       return max("$a$b".toInt(), "$b$a".toInt())
    }
}