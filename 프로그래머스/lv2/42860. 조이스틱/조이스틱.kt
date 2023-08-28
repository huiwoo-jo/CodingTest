class Solution {
    fun solution(name: String): Int {
        var answer = 0
        var min = name.length-1
        
        for(i in name.indices){
            var next = i + 1
            answer += (name[i] - 'A').coerceAtMost('Z' - name[i] + 1)
            while (next < name.length && name[next] == 'A'){
                next++
            }
            min = arrayOf(min, 2*i+name.length-next, i+2*(name.length-next)).minOf{it}
        }
        return answer + min
    }
}