import kotlin.math.max
class Solution {
    fun solution(numbers: IntArray): Int = numbers.sort().let{ max(numbers[0]*numbers[1], numbers.last() * numbers[numbers.size - 2]) }
}