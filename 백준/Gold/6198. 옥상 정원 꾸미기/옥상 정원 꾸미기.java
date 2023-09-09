import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        long answer = 0;
        Stack<Integer> s = new Stack<>();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(br.readLine());
            while (!s.isEmpty() && s.peek() <= tmp) {
                s.pop();
            }
            s.push(tmp);
            answer += s.size() - 1;
        }

        System.out.println(answer);

    }
}