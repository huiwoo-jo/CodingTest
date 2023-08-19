class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int = score.sortedDescending().chunked(m).filter{it.size == m}.map{it.minOf{it} * m}.sumOf{it}
}