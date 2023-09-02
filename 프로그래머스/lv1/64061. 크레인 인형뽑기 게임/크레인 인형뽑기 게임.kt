import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer: Int = 0
        var select: Stack<Int> = Stack<Int>()

        moves.map{
            for (i in board.indices) {
                if(board[i][it-1] != 0) {
                    if(!select.empty() && select.peek() == board[i][it-1]) {
                        answer += 2
                        select.pop()
                    } else {
                        select.push(board[i][it-1])
                    }
                    board[i][it-1] = 0
                    break
                }
            }
        }

        return answer
    }
}