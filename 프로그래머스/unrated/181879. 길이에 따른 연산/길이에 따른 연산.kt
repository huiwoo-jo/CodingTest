class Solution {
    fun solution(num_list: IntArray): Int {
        var answer=0
        if(num_list.size<11){
            answer=1
            num_list.forEach{
                answer *= it
            }
        }else{
            answer = num_list.sum()
        }
        return answer
    }
}