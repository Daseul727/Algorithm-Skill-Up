package programmers.Hash;

import java.util.HashSet;

public class Pokemon {
    public int solution(int[] nums) {
        int answer = 0;

        //1. nums/2 알아내기
        int count = nums.length/2;
        System.out.println("count :: " + count);

        //2. 서로다른 종류의 숫자 파악
        HashSet<Integer> map = new HashSet<>();
        for(int num: nums) {
            map.add(num); //중복은 자연제거
        }

        //return count <= map.size()? count:map.size();
        return Math.min(count, map.size());
    }
}
