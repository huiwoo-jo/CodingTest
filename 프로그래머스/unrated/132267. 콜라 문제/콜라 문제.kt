class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        var answer : Int = 0
        var temp : Int = n
        while(temp>=a){
            answer += temp/a*b
            temp = (temp%a) + (temp/a*b) 
        }
        return answer
    }
}