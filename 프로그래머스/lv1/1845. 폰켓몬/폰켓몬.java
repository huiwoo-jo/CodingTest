import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            hash.add(i);
        }
        return Math.min(nums.length/2, hash.size());
    }
}