class Solution {
    fun solution(new_id: String): String = 
        new_id.toLowerCase()
                .replace( "[^a-z0-9_.-]".toRegex(), "" )
                .replace( "[.]{2,}".toRegex(), "." )
                .replace( "^[.]|$[.]".toRegex(),"" )
                .let{ if(it.isEmpty()) "a" else it }
                .let { if (it.length>15) it.slice(0..14) else it }
                .replace("[.]$".toRegex(),"")
                .let { str ->
                    var tmp = str
                    if(str.length<3) { 
                        repeat(3-str.length) { 
                            tmp = tmp + str.last()
                        } 
                    }
                    tmp
                }
}