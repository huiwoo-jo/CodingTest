class Solution {
    fun solution(s: String): String = s.groupBy{it}.filter{it.value.count() == 1}.keys.sorted().joinToString("")
}