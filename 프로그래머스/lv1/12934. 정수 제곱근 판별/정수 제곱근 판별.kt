import kotlin.math.*
class Solution {
    fun solution(n: Long): Long = if(sqrt(n.toDouble()) % 1.0 == 0.0){
            (sqrt(n.toDouble())+1).pow(2).toLong()
        } else -1
}