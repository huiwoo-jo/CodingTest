import kotlin.math.ceil
class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var answer = intArrayOf()
        var day = progresses.mapIndexed{index, it -> ceil(((100.0-it)/speeds[index])).toInt() }
        
        var flag = day[0]
        var count = 0
        
        day.forEach{
            if(flag<it){
                flag=it
                answer += count
                count=0
            }
            count++
        }
        answer+=count
        return answer
    }
}