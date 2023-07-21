class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        for(i in 0..numbers.size-1){
            answer+=numbers[i]
            if (answer>n) {break}
        }
        return answer
    }
}