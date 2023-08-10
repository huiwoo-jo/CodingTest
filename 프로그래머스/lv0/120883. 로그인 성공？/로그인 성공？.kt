class Solution {
    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        var answer = db.find{it[0] == id_pw[0]}?: return "fail"
        if(id_pw[1] == answer[1]){
            return "login"
        }
        return "wrong pw"
    }
}