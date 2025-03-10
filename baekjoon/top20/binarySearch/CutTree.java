package baekjoon.top20.binarySearch;

import java.util.*;
import java.io.*;

public class CutTree {
    /*
    * 나무자르기
    * https://www.acmicpc.net/problem/2805
    *
    * 이진탐색 Binary Search
    * 1. max 구하기
    * 2. left = 0; right = max;
    * 3. while 문을 돌린다. while left <=right
    * 4. mid = ( left + right ) / 2;
    * 5. sum = 0;
    * 6. Array 반복문 돌며 item > mid 일때 sum += (item - mid)
    * 7. if (sum > 필요값) 이면 result = mid; left = mid +1;
    *       else right = mid -1;
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //1. 기초값 세팅
        int treeCount = Integer.parseInt(st.nextToken());
        int needCount = Integer.parseInt(st.nextToken());
        int[] tree = new int[treeCount];

        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < treeCount; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (tree[i] > max) {
                max = tree[i]; // 최대 높이 저장
            }
        }

        //2. 이진탐색 시작
        int left = 0;
        int right = max;
        int result = 0;

        while (left <= right) {
            int mid = (right + left) / 2; //중간구하기
            long sum = 0;

            for (int item :tree) {
                if (item > mid) {
                    sum += item - mid;
                }
            }

            if (sum >= needCount) { //필요갯수보다 더해진게 많거나 같다면
                result = mid;
                left = mid + 1;
            } else {
                right = mid -1; //필요갯수보다 적다면
            }
        }

        System.out.println(result);
        br.close();
    }
}
