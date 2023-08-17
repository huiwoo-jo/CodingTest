class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in 0 until numbers.size){
            for(j in i+1 until numbers.size){
                answer += numbers[i] + numbers[j]
            }
        }
        return answer.distinct().sorted().toIntArray()
    }
}