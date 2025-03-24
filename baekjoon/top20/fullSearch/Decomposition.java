package baekjoon.top20.fullSearch;

import java.util.*;
import java.io.*;

public class Decomposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i=0; i<num; i++) {
            int number = i;
            int sum = 0;

            while (number > 0) {
                sum += number % 10; //마지막자릿수만 뽑아서 더해
                number /= 10; //마지막자릿수 제거
            }

            if (sum + i == num) { //다 더한거 + 현재숫자가 num인지 봐
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
