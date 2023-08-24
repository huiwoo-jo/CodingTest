class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        for (i in 1..food.lastIndex) {
            repeat(food[i]/2){answer+="${i}"}
        }
        answer += "0${answer.reversed()}"
        return answer
    }
}