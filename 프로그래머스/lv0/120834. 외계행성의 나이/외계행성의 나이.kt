class Solution {
    fun solution(age: Int): String = age.toString().map{(it.digitToInt()+97).toChar()}.joinToString("")
}