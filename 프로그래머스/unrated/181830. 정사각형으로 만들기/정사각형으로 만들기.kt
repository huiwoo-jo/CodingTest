class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        var answer = mutableListOf<IntArray>()
        
        if(arr.size == arr[0].size){
            return arr
        }
        
        if(arr.size > arr[0].size){
            for(i in 0..arr.size-1){
                var temp = arr[i]
                for (j in arr[i].size..arr.size-1){
                    temp += 0
                }
                answer+=temp
            }
        }else{
            arr.forEach{
                answer+=it
            }
            for(i in arr.size..arr[0].size-1){
                var temp = IntArray(arr[0].size){0}
                answer+=temp
            }
        }
        return answer.toTypedArray()
    }
}