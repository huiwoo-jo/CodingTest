class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr.clone()
        queries.forEach{
            for(i in 0..arr.size-1) {
                if(i in it[0]..it[1] && i%it[2]==0){
                    answer[i]++
                }
            }
        }
        return answer
    }
}