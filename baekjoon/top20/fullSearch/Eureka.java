package baekjoon.top20.fullSearch;

import java.util.*;
import java.io.*;

public class Eureka {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine()); //보기로 몇개를 줄건지

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1; i<45; i++) { //가장 큰 값 45 (1000까지 안해도됨)
            int triangle = i * (i+1) /2;
            list.add(triangle);
        }

        for (int t=0; t<count; t++) { //보기만큼 돌린다
            int num = Integer.parseInt(br.readLine());
            boolean isTriangle = false;

            for (int i=0; i<list.size(); i++) {
                for (int j=i; j<list.size(); j++) {
                    for (int k=j; k<list.size(); k++){
                        if (num == list.get(i) + list.get(j) + list.get(k)) {
                            isTriangle = true;
                            break;
                        }
                    }
                    if (isTriangle) break;
                }
                if (isTriangle) break;
            }
            System.out.println(isTriangle ? 1 : 0);
        }

    }
}
