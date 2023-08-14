import kotlin.math.abs
class Solution {
    fun solution(lines: Array<IntArray>): Int {
        var answer: Int = 0
        var arr = IntArray(201){0}
        for(i in 0 .. lines.size-1){
            for(j in lines[i][0]+1 .. lines[i][1]){
                arr[j+100]++
            }
        }
        answer += arr.count{e-> e >= 2}
        return answer
    }
}