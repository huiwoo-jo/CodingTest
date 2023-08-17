class Solution {
    fun solution(s: String): Boolean  = if((s.length == 4 || s.length==6) && s.length == s.filter{it.isDigit()}.length) true else false
}