class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        val text = ('a'..'z').filter{it !in skip}
        return s.map{text[(text.indexOf(it) + index) % text.size]}.joinToString("")
    }
}