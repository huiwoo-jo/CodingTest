class Solution {
    fun solution(my_string: String, target: String): Int {
        var answer: Int = 0
        answer = if (my_string.contains(target)) {1} else {0}
        return answer
    }
}