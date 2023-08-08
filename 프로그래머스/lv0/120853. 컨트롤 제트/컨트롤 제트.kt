class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        s.split(" ").mapIndexed{idx, it ->
            if(it.equals("Z")){
                answer -= s.split(" ").get(idx-1).toInt()
            }else{
                answer+=it.toInt()
            }
        }
        return answer
    }
}