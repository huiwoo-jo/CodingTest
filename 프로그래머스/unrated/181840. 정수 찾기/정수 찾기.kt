class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        num_list.forEach{
            if(it==n){return 1}
        }
        return 0
    }
}