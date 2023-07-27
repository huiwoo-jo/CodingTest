class Solution {
    fun solution(strArr: Array<String>): Int = strArr.groupBy{it.length}.maxOf{it.value.size}
}