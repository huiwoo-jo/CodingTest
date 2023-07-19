class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        answer = num_list.copyOfRange(0,n)
        return answer
    }
}