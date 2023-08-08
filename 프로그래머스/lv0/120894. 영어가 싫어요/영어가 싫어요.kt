class Solution {
    fun solution(numbers: String): Long {
        var answer = numbers
        arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine").mapIndexed{idx, it ->  answer = answer.replace(it, idx.toString())}
        return answer.toLong()
    }
}