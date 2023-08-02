class Solution {
    fun solution(num: Int, k: Int): Int{
        var temp = num.toString().map{it.digitToInt()}.indexOf(k)
        return if(temp!=-1){
             temp+1
        }else { temp }
    }
}