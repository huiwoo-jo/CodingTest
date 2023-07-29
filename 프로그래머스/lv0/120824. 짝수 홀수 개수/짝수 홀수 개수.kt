class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer += num_list.filter{it%2==0}.size
        answer += num_list.filter{it%2!=0}.size
        return answer
    }
}