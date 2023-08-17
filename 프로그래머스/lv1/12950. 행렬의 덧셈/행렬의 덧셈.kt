class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray>  = arr1.mapIndexed{idx1, it1 -> it1.mapIndexed { idx2, it2 -> it2 + arr2[idx1][idx2]}.toIntArray()}.toTypedArray()
}