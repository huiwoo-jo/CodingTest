class Solution {
    fun solution(n: Int): Int = (2..n).find{n < factorial(it)}?.dec()?:n
    
    fun factorial(n : Int): Int{
        return if (n==1){
            1
        }else {
            n * factorial(n-1)
        }
    }
}