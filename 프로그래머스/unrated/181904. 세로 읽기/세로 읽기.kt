class Solution {
    fun solution(my_string: String, m: Int, c: Int): String = my_string.chunked(m).indices.joinToString(""){ my_string.chunked(m)[it].filterIndexed { index, i -> index == c - 1 } }        
}