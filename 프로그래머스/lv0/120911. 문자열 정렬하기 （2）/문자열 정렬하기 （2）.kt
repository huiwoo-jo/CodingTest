class Solution {
    fun solution(my_string: String): String = my_string.map{it.toLowerCase()}.sorted().joinToString("")
}