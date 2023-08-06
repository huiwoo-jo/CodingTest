import java.util.*
class Solution {
    fun solution(operations: Array<String>): IntArray {
        var maxQueue = PriorityQueue<Int>(Collections.reverseOrder())
        var minQueue = PriorityQueue<Int>()
        
        operations.forEach{
            it.split(" ").let{ op -> 
                when(op[0]){
                    "I" -> {
                        maxQueue.offer(op[1].toInt())
                        minQueue.offer(op[1].toInt())
                    }
                    "D" ->{
                        if(op[1].toInt() == 1) {
                            maxQueue.poll().also{minQueue.remove(it)}
                        } else{
                            minQueue.poll().also{maxQueue.remove(it)}
                        }
                    }
                }
            }
        }
        
        return if(maxQueue.isNotEmpty()){
             intArrayOf(maxQueue.peek(), minQueue.peek())
        }else{
            intArrayOf(0, 0)
        }
    }
}