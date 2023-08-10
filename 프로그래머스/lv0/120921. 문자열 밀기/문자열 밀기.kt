class Solution {
    fun solution(A: String, B: String): Int {
        var data = A
        for(i in 0..A.length-1){
            if(B.equals(data)){
                return i
            }
            data = data.takeLast(1) + data.take(data.length-1)
        }
        return -1
    }
}