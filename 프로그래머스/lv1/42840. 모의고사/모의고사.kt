class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf(0,0,0)
        var user = arrayOf(intArrayOf(1,2,3,4,5), intArrayOf(2,1,2,3,2,4,2,5), intArrayOf(3,3,1,1,2,2,4,4,5,5))
        user.mapIndexed{idx, it -> answer[idx] += answers.filterIndexed { idx2, it2 -> it2 == it[idx2%it.size]}.count()}
        return answer.mapIndexed{idx, it -> if(it>=answer.maxOf{it}) idx+1 else 0 }.filter{it!=0}.toIntArray()
    }
}