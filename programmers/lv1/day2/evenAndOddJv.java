package programmers.lv1.day2;

public class evenAndOddJv {

    /*
    정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    */
    public String solution(int num) {
        /*
        방법 1. if문
        String answer = "";

        if (num%2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;*/

        // 방법 2. 삼항연산자
        return num%2 == 0 ? "Even" : "Odd";
    }
}
