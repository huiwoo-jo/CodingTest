class Solution {
    fun solution(num_list: IntArray): Int = num_list.indices.find { num_list[it] < 0 } ?: -1
}