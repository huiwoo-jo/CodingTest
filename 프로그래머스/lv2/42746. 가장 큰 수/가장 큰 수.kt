class Solution {
    fun solution(numbers: IntArray): String {
        var answer = numbers.sortedWith(Comparator {i, j -> (j.toString() + i.toString()).compareTo(i.toString() + j.toString())}).joinToString("")
        return if(answer.startsWith("0")){
            "0"
        }else{
            answer
        }
    }
}