class Solution {
    fun solution(s: String): String  = s.split(" ").map{word -> word.mapIndexed{idx, it -> if(idx%2==0) it.toUpperCase() else it.toLowerCase()}.joinToString("")}.joinToString(" ")
}