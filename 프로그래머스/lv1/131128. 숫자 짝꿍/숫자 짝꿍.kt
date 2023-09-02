class Solution {
    fun solution(X: String, Y: String): String =
        X.filter{Y.contains(it)}
                .groupBy{it}
                .map{i-> 
                    if (i.value.size < Y.count{it == i.key}) i.value 
                    else Y.groupBy{it}[i.key]!!
                }
                .flatten()
                .sortedDescending()
                .joinToString("")
                .let{it.ifEmpty{"-1"}}
                .let {if(it.all{it=='0'}) "0" else it }
}