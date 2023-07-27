class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        for(i in ('A'..'z').filter{it.isLetter()}){
            answer += my_string.count{it == i}
        }
        return answer
    }
}