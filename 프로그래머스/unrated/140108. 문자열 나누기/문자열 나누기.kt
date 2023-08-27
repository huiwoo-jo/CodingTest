class Solution {
    fun solution(s: String): Int {
        var (answer, first, other) = Triple(0,0,0)
        var first_letter = ' '
        
        s.map{
            if(first == other){
                first_letter = it
                answer ++
            }           
            if (it == first_letter){
                first ++
            }else{
                other ++
            }
        }
        
        return answer
    }
}