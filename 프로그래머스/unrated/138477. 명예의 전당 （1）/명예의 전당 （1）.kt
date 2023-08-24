class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var temp : IntArray = intArrayOf()
        
        score.map{
            temp += it
            answer += temp.sortedDescending().take(k).minOf{it}
        }
        
        return answer
    }
}