class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val weight = sizes.map{Math.min(it[0], it[1])}
        val height = sizes.map{Math.max(it[0], it[1])}
        
        return weight.maxOf{it} * height.maxOf{it}
    }
}