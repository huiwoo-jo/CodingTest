class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        var num = n
        var k = 2
        while(num!=1){
            if(num%k==0){
                answer += k
                num/=k
            }else{
                k++
            }
        }
        
        return answer.distinct().toIntArray()
    }
}