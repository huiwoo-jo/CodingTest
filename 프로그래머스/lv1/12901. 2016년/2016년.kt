class Solution {
    fun solution(a: Int, b: Int): String {
        var days = arrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var week = arrayOf("THU", "FRI", "SAT", "SUN","MON","TUE","WED")
        
        var temp = (0 until a - 1).map{days[it]}.sum()+b
        
        return week[temp%7]
    }
}