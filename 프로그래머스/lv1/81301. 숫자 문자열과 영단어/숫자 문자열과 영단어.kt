class Solution {
    fun solution(s: String): Int {
        var answer = s
        arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine").mapIndexed{idx, it ->  answer = answer.replace(it, idx.toString())}
        return answer.toInt()
    }
}