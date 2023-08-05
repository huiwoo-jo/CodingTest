class Solution {
    fun solution(bin1: String, bin2: String): String = (bin1.toInt(2)+bin2.toInt(2)).toString(radix=2)
}