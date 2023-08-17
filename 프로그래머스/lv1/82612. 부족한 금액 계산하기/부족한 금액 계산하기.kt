class Solution {
    fun solution(price: Int, money: Int, count: Int): Long = Math.max(0, ((1..count).fold(0L){acc, it -> acc + it*price}-money))
}