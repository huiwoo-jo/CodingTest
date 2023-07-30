class Solution {
    fun solution(n: Int): Int = n*6/gcd(n,6)/6
    fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a
}