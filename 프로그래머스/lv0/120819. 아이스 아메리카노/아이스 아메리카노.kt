class Solution {
    fun solution(money: Int): IntArray = arrayOf(money/5500, money%5500).toIntArray()
}