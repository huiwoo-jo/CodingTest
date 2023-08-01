class Solution {
    fun solution(box: IntArray, n: Int): Int = box.map{it/n}.reduce{acc, i -> acc*i}
}