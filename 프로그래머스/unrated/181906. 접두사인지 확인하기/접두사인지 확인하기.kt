class Solution {
    fun solution(my_string: String, is_prefix: String): Int {
        var answer: Int = 0
        answer = if (my_string.startsWith(is_prefix)) {1} else {0}
        return answer
    }
}