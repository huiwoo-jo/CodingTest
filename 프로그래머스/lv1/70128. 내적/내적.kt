class Solution {
    fun solution(a: IntArray, b: IntArray): Int = a.mapIndexed{idx, it -> it * b[idx]}.sum()
}