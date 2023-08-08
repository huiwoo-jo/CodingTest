class Solution {
    fun solution(dots: Array<IntArray>): Int = (dots.map{it[0]}.maxOf{it}-dots.map{it[0]}.minOf{it})*(dots.map{it[1]}.maxOf{it}-dots.map{it[1]}.minOf{it})
}