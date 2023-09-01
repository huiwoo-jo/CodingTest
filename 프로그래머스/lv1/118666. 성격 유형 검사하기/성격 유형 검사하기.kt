class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val pair = arrayOf(Pair('R', 'T'), Pair('C', 'F'), Pair('J', 'M'), Pair('A', 'N'))
        val score = mutableMapOf<Char, Int>('R' to 0, 'T' to 0, 'C' to 0, 'F' to 0, 'J' to 0, 'M' to 0, 'A' to 0, 'N' to 0)
        
        choices.mapIndexed{ idx, it ->
            if(it<4){
                score[survey[idx][0]] = score.getOrDefault(survey[idx][0],0) + (4-it)
            }else{
                score[survey[idx][1]] = score.getOrDefault(survey[idx][1],0) + (it-4)
            }
        }

        return pair.map{(first, second) -> first.takeIf{score.getValue(first) >= score.getValue(second)} ?: second}.joinToString("")
    }
}