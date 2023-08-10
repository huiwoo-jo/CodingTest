import kotlin.math.abs
class Solution {
    fun solution(numlist: IntArray, n: Int): IntArray = 
            numlist.sortedWith{i, j->
                if(abs(n-i) == abs(n-j)) j.compareTo(i) else abs(n-i).compareTo(abs(n-j))
            }.toIntArray()
}