class Solution {
    fun solution(x: Int): Boolean = if(x%(x.toString().map{it.digitToInt()}.sum()) ==0 ) true else false
}