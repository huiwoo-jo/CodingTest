class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        arr.forEach{ answer = lcm(answer, it) }
        return answer
    }
    
    fun lcm(a:Int, b:Int) = a * b / gcd(a, b)
    
    fun gcd(a:Int, b:Int):Int{
        return if (a < b){
            if (a == 0) b else gcd(a, b % a)
        }
        else{
            if (b == 0) a else gcd(b, a % b)
        }
    }
}