class Solution {
    fun solution(s: String): String {
        var temp = s.split(" ").map{it.toInt()}
        return "${temp.minOf{it}} ${temp.maxOf{it}}"
    }
}