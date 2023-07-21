import kotlin.math.abs
import kotlin.math.pow

class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        var temp = intArrayOf(a, b, c, d)
        return when(temp.groupBy{it}.size){
            4 -> temp.minOf{it}
            3 -> {
                var temp1 = temp.groupBy{it}.filter{it.value.size == 1}.values.flatten()
                val q = temp1.maxOf{it}
                val r = temp1.minOf{it}
                q*r
            }
            2 -> {
                var p = 0
                var q = 0
                var temp1 = temp.groupBy{it}.filter{it.value.size==1}.values.flatten()
                var temp3 = temp.groupBy{it}.filter{it.value.size==3}.values.flatten()
                
                if(temp.groupBy{it}.filter{it.value.size >= 3}.values.flatten().count()==3){
                    p = temp3.maxOf{it}
                    q = temp1.minOf{it}
                    ((10*p+q).toDouble().pow(2.0)).toInt()
                }else{
                    p = temp.minOf{it}
                    q = temp.maxOf{it}
                    (p+q)*abs(p-q)
                }
            }
            else -> 1111*temp[0]
        }
    }
}