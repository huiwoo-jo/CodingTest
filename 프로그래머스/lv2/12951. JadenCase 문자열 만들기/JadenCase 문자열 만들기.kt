class Solution {
    fun solution(s: String): String =  s.toLowerCase().split(" ").map{ it.replaceFirstChar{it.toUpperCase()} }.joinToString(" ")
}