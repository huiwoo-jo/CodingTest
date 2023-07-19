class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = ArrayList<Int>()
        arr.forEach{
            if(it >= 50 && it%2 == 0) answer.add(it/2)
            else if(it < 50 && it%2 != 0) answer.add(it*2)
            else answer.add(it)
        }
        return answer.toIntArray()
    }
}