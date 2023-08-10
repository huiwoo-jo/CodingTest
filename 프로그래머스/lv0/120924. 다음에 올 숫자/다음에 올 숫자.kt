class Solution {
    fun solution(common: IntArray): Int = if(common[2] == common[1]*2 - common[0]){
            common.last()+(common[1]-common[0])
        }else{
            common.last()*(common[1]/common[0])
        }
}