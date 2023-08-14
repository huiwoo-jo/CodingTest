class Solution {
    fun solution(a: Int, b: Int): Int {
        var temp = b/gcd(a,b)
        while(temp!=1){
            temp /= if(temp % 2 ==0){
                2
            }else if (temp %5 == 0){
                5
            }else{
                return 2
            }
        }
        return 1
    }
    
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else {
            gcd(b, a % b)
        }
    }
}