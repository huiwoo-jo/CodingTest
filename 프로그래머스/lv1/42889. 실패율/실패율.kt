class Solution {
    fun solution(N: Int, stages: IntArray): IntArray = 
        (1..N).map{ it ->
            var fail = stages.count{i -> i==it}.toDouble()
            var total = stages.count{i -> i>=it}.toDouble()
            it to if(total == 0.0) 0.0 else fail / total
        }.sortedByDescending{it.second}.map{it.first}.toIntArray()
}