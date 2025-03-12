package baekjoon.top20.greedy;
import java.io.*;
import java.util.*;

public class Camping {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken()); // L일 동안만 사용 가능
            int P = Integer.parseInt(st.nextToken()); // P일 중
            int V = Integer.parseInt(st.nextToken()); // 휴가 기간

            if (L == 0 && P == 0 && V == 0) break; // 0 0 0 입력 시 종료

            int fullPeriods = V / P; // P일 단위로 사용할 수 있는 횟수
            int remainingDays = V % P; // 남은 일수
            int usableDays = fullPeriods * L + Math.min(remainingDays, L); // 최대 사용 가능 일수

            System.out.println("Case " + caseNum + ": " + usableDays);
            caseNum++;
        }
    }
}
