import kotlin.math.abs
class Solution {
    fun solution(sides: IntArray): Int = sides[0] + sides[1] - abs(sides[0] - sides[1]) - 1
}