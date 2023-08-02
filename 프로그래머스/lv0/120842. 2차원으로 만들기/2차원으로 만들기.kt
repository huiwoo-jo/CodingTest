class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.toList().chunked(n)
}