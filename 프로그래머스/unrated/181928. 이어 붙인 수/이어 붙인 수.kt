class Solution {
    fun solution(num_list: IntArray): Int {
        var odd=""
        var even=""
        num_list.forEach{
            if(it%2==0) {even+=it} else {odd+=it}
        }
        return even.toInt() + odd.toInt()
    }
}