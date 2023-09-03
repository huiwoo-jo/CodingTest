class Solution {
     fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val answer = mutableListOf<Int>()
        val term = mutableMapOf<String, Int>()
        val todayInt = today.replace(".", "").toInt()

        terms.map {
            val (type, date) = it.split(" ")
            term[type] = date.toInt()
        }

        privacies.mapIndexed { idx, it ->
            val (date, type) = it.split(" ")
            
            var year = term[type]!! / 12
            if (year < 1) year = 0

            val month = term[type]!! % 12
            
            val exp = (date.replace(".", "").toInt() + year * 10000 + month * 100).toString()

            var temp = exp.toInt()
            if (exp[4].toString().toInt() * 10 + exp[5].toString().toInt() > 12) {
                temp -= 1200
                temp += 10000
            }

            if (temp <= todayInt) {
                answer.add(idx + 1)
            }
        }

        return answer.toIntArray()
    }
}