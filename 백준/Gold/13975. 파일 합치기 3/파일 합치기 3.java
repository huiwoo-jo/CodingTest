import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();
            for(int i=0; i<N; i++) {
                pq.add(Long.parseLong(st.nextToken()));
            }
            
            long sum = 0;
            while(pq.size() > 1) {
                long x = pq.poll();
                long y = pq.poll();
                sum += x+y;
                pq.add(x+y);
            }
            answer.append(sum + "\n");
        }
        System.out.printf(answer.toString());
    }
}