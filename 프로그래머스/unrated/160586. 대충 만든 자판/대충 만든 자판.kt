class Solution {
    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        
         var count =  keymap
            .map{it.withIndex()}
            .flatten()
            .groupBy{ it.value }
            .map { it.key to it.value.minOf { i -> i.index + 1}}
            .toMap()
        
        return targets.map{
            it.sumOf { key -> count[key] ?: let{return@map -1 }}
        }.toIntArray()
    }
}