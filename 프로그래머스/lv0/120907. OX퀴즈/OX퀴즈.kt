class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        quiz.map{
            var tnum = it.split(" ")
            var tanswer = tnum[0].toInt()
            
            for(i in 1..tnum.size-1){
                if(tnum[i] == "+"){
                    tanswer += tnum[i+1].toInt()
                }else if(tnum[i] == "-"){
                    tanswer -= tnum[i+1].toInt()
                }else if(tnum[i] == "="){
                    break
                }
            }
            
            answer+=if(tanswer == tnum.last().toInt()){
                "O"
            }else{
                "X"
            }
        }
        return answer
    }
}