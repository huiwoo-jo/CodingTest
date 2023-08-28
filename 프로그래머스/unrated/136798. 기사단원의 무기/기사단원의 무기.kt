import kotlin.math.sqrt
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int = (1..number).map { i ->
        val x = (1..sqrt(i.toFloat()).toInt()).filter { i % it == 0 }
        (x + x.map { i / it }).toSet().count()
    }.sumOf {
        if(it > limit) power else it
    }
}