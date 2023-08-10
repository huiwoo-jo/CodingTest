class Solution {
    fun solution(num: Int, total: Int): IntArray = 
        ((total/num - (num-1)/2) .. (total/num - (num-1)/2)+num-1).toList().toIntArray()
}