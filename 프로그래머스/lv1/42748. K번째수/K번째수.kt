class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray = commands.map{array.slice(it[0]-1 until it[1]).sorted()[it[2]-1]}.toIntArray()
}