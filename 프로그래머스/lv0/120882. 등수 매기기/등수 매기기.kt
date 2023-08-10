class Solution {
    fun solution(score: Array<IntArray>): IntArray = 
        score.map{it.average()}.map{score.map{it.average()}.sortedDescending().indexOf(it)+1}.toIntArray()
}