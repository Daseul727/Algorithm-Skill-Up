package programmers.Hash;

import java.util.HashMap;

public class Clothes {
    public int solution(String[][] clothes) {
        int answer = 1;

        //1. 같은 종류의 아이템 갯수 파악
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<clothes.length; i++) {
            String type = clothes[i][1];
            map.put(type, map.getOrDefault(type, 1) + 1); //값 있으면 +1
        }

        //2. map 돌면서 경우의 수를 곱해줌
        for (String key : map.keySet()) {
            answer *= map.get(key);
        }

        return answer - 1; //아무것도입지않았을 경우를 제외
    }
}
