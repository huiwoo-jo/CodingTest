class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var temp = str_list.indexOfFirst{it == "l" || it == "r"}

        return if(temp == -1){
            emptyArray()
        }
        else if(str_list[temp]=="l"){
            str_list.sliceArray(0..temp-1)
        }else{
            str_list.sliceArray(temp+1..str_list.size-1)
        }
    }
}