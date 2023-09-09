import java.util.Arrays;

public class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));
        int camera = -30001;
        for (int[] r : routes) {
            if (camera < r[0]) {
                answer ++;
                camera = r[1];
            }
        }
        return answer;
    }
}
