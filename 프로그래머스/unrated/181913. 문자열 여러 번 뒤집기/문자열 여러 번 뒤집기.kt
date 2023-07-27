class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        queries.forEach{ (s, e) -> 
            answer = answer.substring(0 .. s-1) + answer.substring(s .. e).reversed() +  answer.substring(e+1 .. answer.length-1) 
        }
        return answer
    }
}