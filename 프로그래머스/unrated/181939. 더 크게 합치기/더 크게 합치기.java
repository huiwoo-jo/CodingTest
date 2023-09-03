class Solution {
     public int solution(int a, int b) {
        String answerA = String.valueOf(a);
        String answerB = String.valueOf(b);
         
        int answer = Integer.valueOf(answerA + answerB);
        int answer2 = Integer.valueOf(answerB + answerA);

        if(answer < answer2){
            answer = answer2;
        }
         
        return answer;
    }
}