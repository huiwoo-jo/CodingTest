class Solution {
    fun solution(brown: Int, yellow: Int): IntArray = (1..yellow).first{(yellow/it + it)*2+4==brown && yellow%it==0 }.let{intArrayOf(yellow/it+2, it+2)}
}