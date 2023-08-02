class Solution {
    fun solution(my_string: String): String = my_string.toList().distinct().joinToString("")
}