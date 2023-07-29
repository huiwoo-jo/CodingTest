class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var temp = emptyArray<Int>()
        for(i in 1..rank.size){
            if(attendance[rank.indexOf(i)]==true)
            {
                temp += rank.indexOf(i)
            }
        }
        
        return 10000*temp[0]+100*temp[1]+temp[2]
    }
}