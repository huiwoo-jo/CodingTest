class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        var answer = 0

        fun dfs(idx: Int, result: Int) {
            if (idx == numbers.size) {
                if (result == target) {
                    answer++
                }
            } else {
                dfs(idx+1, result+numbers[idx])
                dfs(idx+1, result-numbers[idx])
            }
        }

        dfs(0, 0)
        return answer
    }
}