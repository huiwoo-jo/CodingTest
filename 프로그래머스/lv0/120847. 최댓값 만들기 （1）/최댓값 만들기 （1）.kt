class Solution {
    fun solution(numbers: IntArray) = numbers.sortedByDescending{it}[0]*numbers.sortedByDescending{it}[1]
}