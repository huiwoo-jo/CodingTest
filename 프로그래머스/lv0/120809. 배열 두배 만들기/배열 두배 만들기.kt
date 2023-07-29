class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        numbers.forEach{
            answer += it*2
        }
        return answer
    }
}