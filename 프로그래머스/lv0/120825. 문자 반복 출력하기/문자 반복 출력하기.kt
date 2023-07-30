class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer: String = ""
        my_string.forEach{ it ->
            repeat(n){ i ->
                answer += it
            }
        }
        return answer
    }
}