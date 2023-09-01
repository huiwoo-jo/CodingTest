class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val visited = mutableListOf<Int>()
        for(cur in 0 until n){
            if (!visited.contains(cur)) {
                dfs(cur, computers, visited)
                answer++
            }
        }
        return answer
    }

    fun dfs(cur : Int, computers : Array<IntArray>, visited : MutableList<Int>) {
        visited.add(cur)
        computers[cur].forEachIndexed { next, connected ->
            if (connected == 1 && !visited.contains(next)){
                dfs(next, computers, visited)
            }
        }
    }
}