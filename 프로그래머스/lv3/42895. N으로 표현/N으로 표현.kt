class Solution {
    fun solution(N: Int, number: Int): Int {
        var answer = 9

        fun dfs(cnt: Int, current: Int){
            if(cnt > 8){
                return
            }

            if(current == number){
                answer = Math.min(answer,cnt)
                return
            }

            var next = N

            for (i in 0 until 8-cnt) {
                dfs(cnt+1 + i, current + next)
                dfs(cnt+1 + i, current - next)
                dfs(cnt+1 + i, current * next)
                dfs(cnt+1 + i, current / next)
                next += N * Math.pow(10.0, i + 1.toDouble()).toInt()
            }
        }   
        
        dfs(0,0)

        if (answer == 9) {
            return -1
        }
        
        return answer

    }

    
}