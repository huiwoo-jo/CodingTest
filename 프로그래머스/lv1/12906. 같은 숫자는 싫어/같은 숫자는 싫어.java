import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        int flag = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=flag){
                answer.add(arr[i]);
                flag=arr[i];
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}