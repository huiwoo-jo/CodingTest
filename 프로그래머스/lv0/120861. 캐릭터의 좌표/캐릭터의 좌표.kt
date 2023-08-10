import kotlin.math.abs
class Solution {
    fun solution(keyinput: Array<String>, board: IntArray): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        for(it in 0..keyinput.size-1){
            when(keyinput[it]){
                "up" -> {
                    if (answer[1] >= board[1] / 2) {
                        continue
                    }
                    answer[1]++
                }
                "down" -> {
                    if (answer[1] <= -(board[1] / 2)) {
                        continue
                    }
                    answer[1]--
                }
                "right" -> {
                    if (answer[0] >= board[0] / 2) {
                        continue
                    }
                    answer[0]++
                }
                "left" -> {
                    if (answer[0] <= -(board[0] / 2)) {
                        continue
                    }
                    answer[0]--
                }
            }
        }
        return answer
    }
}