class Solution {
    fun solution(s: String): IntArray {
        var answer: IntArray = intArrayOf(0, 0)
        var temp = s
        while(temp!="1"){
            answer[0] ++
            answer[1] += temp.count{it=='0'}
            temp = temp.count{it=='1'}.toString(2)
        }
        return answer
    }
}