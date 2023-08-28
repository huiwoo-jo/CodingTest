class Solution {
    fun solution(number: String, k: Int): String {
        var answer = StringBuilder()
        var idx = 0
        
        for(i in 0 until number.length-k){
            var max = '0'
            for(j in idx..i+k){
                if(max < number[j]){
                    max = number[j]
                    idx = j+1
                }
            }
            answer.append(max)
        }
        return answer.toString()
    }
}