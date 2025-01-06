package programmers.stack;

import java.util.Stack;

public class development {
    public static void main(String args[]) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        solution(progresses, speeds);
    }
    public static int[] solution(int[] progresses, int[] speeds) {

        /*Stack<Integer> stack = new Stack<Integer>();
        //1. ( 100 - progresses ) / speeds
        //순서를..배열에 담아 7 , 2.5, 8
        //i가 i+1 보다 작다면 +1, 크다면 새로운 1
        int num = 1;
        long start = (100-progresses[0]) / speeds[0];
        for (int i=0; i<progresses.length-1; i++) {
            long after = (100-progresses[i+1]) / speeds[i+1];

            if (start >= after) {
                num++;
            } else {
                start = (100-progresses[i]) / speeds[i];
                stack.push(num);
                num = 1;
            }

            if (i == progresses.length-2) {
                stack.push(num);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i=stack.size(); i>0; i--) {
            answer[i-1] = stack.pop();
        }

        return answer;*/

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        double start = Math.ceil((100.0 - progresses[0]) / speeds[0]);

        for (int i = 1; i < progresses.length; i++) {
            double after = Math.ceil((100.0 - progresses[i]) / speeds[i]);

            if (start >= after) {
                num++;
            } else {
                stack.push(num);
                num = 1;
                start = after;
            }
        }

        stack.push(num);

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
        }
}
