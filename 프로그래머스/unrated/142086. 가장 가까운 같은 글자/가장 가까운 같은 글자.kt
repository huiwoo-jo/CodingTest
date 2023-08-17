class Solution {
    fun solution(s: String): IntArray = s.withIndex().map{(idx, it)-> s.slice(0 until idx).lastIndexOf(it).let{if (it>=0) idx-it else -1}}.toIntArray()
}