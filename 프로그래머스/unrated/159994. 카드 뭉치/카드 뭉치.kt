class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var pnt1 = 0
        var pnt2 = 0
        goal.forEach{
            when(it){
                cards1.getOrNull(pnt1) -> pnt1++
                cards2.getOrNull(pnt2) -> pnt2++
                else -> return "No"
            }
        }
        return "Yes"
    }
}