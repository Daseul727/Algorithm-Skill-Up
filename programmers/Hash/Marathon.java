package programmers.Hash;

import java.util.HashMap;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //1. map 에 key 로 participant 담고 중복되면 count +1
        HashMap<String, Integer> map = new HashMap<>();
        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) +1);
        }

        //2. 완주자 걸러내기
        for (String name : completion) {
            map.put(name,map.get(name) - 1);
        }

        //3. value가 1 이하인 애들을 따로뽑기
        for (String name: map.keySet()) {
            if (map.get(name) > 0) {
                answer = name;
            }
        }
        return answer;
    }
}
