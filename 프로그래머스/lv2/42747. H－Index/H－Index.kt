class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0
        citations.sorted().mapIndexed{index, it -> if(citations.size-index<=it){ return citations.size-index} }
        return answer
    }
}