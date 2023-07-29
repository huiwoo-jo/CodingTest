class Solution {
    fun solution(n: Int): Int = n
        .toString()
        .split("")
        .filter{it.isNotEmpty()}
        .map{it.toInt()}
        .sum()
}