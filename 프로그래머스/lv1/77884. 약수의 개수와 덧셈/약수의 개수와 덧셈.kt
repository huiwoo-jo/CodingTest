import kotlin.math.sqrt
class Solution {
    fun solution(left: Int, right: Int): Int = (left..right).fold(0){ acc, i -> if(sqrt(i.toDouble()) % 1 == 0.0) acc - i else acc + i }
}