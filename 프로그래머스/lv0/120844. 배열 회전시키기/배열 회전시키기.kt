class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer: IntArray = intArrayOf()
        when(direction){
            "right" -> {
                answer += numbers[numbers.size-1]
                for(i in 0..numbers.size-2){
                    answer += numbers[i]
                }
            }
            "left" -> {
                for(i in 1..numbers.size-1){
                    answer += numbers[i]
                }
                answer+=numbers[0]
            }
        }
        return answer
    }
}