import kotlin.math.*
class Solution {
    fun solution(num_list: IntArray): Int {
        var num1:Int = 1
        var num2:Int = 0
        num_list.forEach{
            num1 *= it
            num2 += it
        }
        return if(num1>num2.toDouble().pow(2)) 0 else 1
    }
}