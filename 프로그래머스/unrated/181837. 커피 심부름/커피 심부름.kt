class Solution {
    fun solution(order: Array<String>): Int = order.map { if (it.contains("cafelatte")) 5000 else 4500 }.sum();
}