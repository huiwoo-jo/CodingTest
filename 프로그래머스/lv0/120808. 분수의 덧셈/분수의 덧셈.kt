class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var num3 = (numer1*denom2)+(numer2*denom1)
        var denom3 = denom1*denom2
        var min = 1
        
        for(i in min..denom3){
            if(denom3%i==0 && num3%i==0) {
                min=i
            }
        }
        
        val answer = intArrayOf(num3/min, denom3/min)
        return answer
    }
}