class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        return sizes.map{Math.min(it[0], it[1])}.maxOf{it} * sizes.map{Math.max(it[0], it[1])}.maxOf{it}
    }
}