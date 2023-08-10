class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var answer: Int = 0
        repeat(k-1){
            answer = (answer + 2) % numbers.size
        }
        return answer+1
    }
}