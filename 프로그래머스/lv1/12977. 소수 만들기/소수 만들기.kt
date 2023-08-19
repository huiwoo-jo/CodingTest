class Solution {
    fun solution(nums: IntArray): Int {
        var answer = 0
        
        for(i in 0 until nums.size-2){
            for(j in i+1 until nums.size-1){
                for(k in j+1 until nums.size){
                    var sum = nums[i] + nums[j] + nums[k]
                    var flag = 0
                    
                    for (item in 2 until sum) {
                        if (sum % item == 0) {
                            flag = 1
                            break
                        }
                    }
                    
                    if (flag == 0) {
                        answer += 1
                    }
                }
            }
        }

        return answer
    }
}