class Solution {
    fun solution(my_string: String) = my_string.toList().filter{it.isDigit()}.map{it.digitToInt()}.sortedBy{it}
}