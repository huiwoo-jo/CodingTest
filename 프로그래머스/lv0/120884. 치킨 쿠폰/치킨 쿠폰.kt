class Solution {
    fun solution(chicken: Int): Int {
        var answer: Int = 0
        var c = chicken
        while(c>=10){
            answer += c/10
            c=c/10+c%10
        }
        return answer
    }
}