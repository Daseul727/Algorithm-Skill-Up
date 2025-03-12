package baekjoon.top20.greedy;
import java.io.*;
import java.util.*;

public class Coin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int type = Integer.parseInt(st.nextToken());
        int amount = Integer.parseInt(st.nextToken());
        int[] list = new int[type];

        for (int i=0; i<type; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i=list.length-1; i>=0; i--) { //역순으로 돌림
            //금액보다 지폐가 더 크면 continue
            if (list[i] > amount) continue;

            count += amount / list[i];
            amount %= list[i];

        }

        System.out.println(count);


    }
}
