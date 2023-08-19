class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var pnt = section[0]
        section.map{
            if(it>=pnt){
                pnt=it+m
                answer++
            }
        }
        return answer
    }
}