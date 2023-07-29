class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for(i in 0..picture.size-1){
            var temp = ""
            for(j in 0..picture[i].length-1){
                for( k in 0..k-1){
                    temp += picture[i][j]
                }
            }
            for(k in 0..k-1){
                answer+=temp
            }
        }
        return answer
    }
}