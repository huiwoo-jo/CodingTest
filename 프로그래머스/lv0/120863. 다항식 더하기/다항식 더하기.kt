class Solution {
    fun solution(polynomial: String): String {
        var x = 0
        var num = 0
        for(it in polynomial.split(" + ")){ 
            if(it.contains("x")) {x+= if(it == "x") 1 else it.replace("x", "").toInt()}
            else{
                num += it.toInt()   
            }
        }
        
        return (
        (if (x != 0) { if (x > 1) {"${x}x"} else {"x"}} else {""}) + 
        (if (num != 0) { if (x != 0) {" + $num"} else {"$num"}} else if (x == 0) {"0"} else {""}))

    }
}