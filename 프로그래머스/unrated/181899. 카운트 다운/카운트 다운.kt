class Solution {
    fun solution(start: Int, end: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for ( i in start downTo end ){
            answer += i
        }
        return answer
    }
}