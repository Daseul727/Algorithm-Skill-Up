package programmers.Hash;
import java.util.*;
public class BestAlbum {
    public static void main(String args[]) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        solutionArrays(genres, plays);
    }
    public static int[] solutionArrays(String[] genres, int[] plays) {
        List<Integer> answerList = new ArrayList<>();

        //1. 장르별 재생횟수를 저장
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        //2. 장르 순위 계산
        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet, (val1, val2) -> (map.get(val2).compareTo(map.get(val1))));

        for (String key : keySet) {

            //3. i와 재생횟수를 map 에 저장
            HashMap<Integer, Integer> resultMap = new HashMap<>();
            for(int i=0; i < genres.length; i++) {
                if (key.equals(genres[i])) {
                    resultMap.put(i,plays[i]);
                }
            }
            //4. 하나의 장르가 정리가 다됐으면 정렬하고
            List<Integer> resultSet = new ArrayList<>(resultMap.keySet());
            Collections.sort(resultSet, (val1, val2) -> (resultMap.get(val2).compareTo(resultMap.get(val1))));

            //5. 두개를 잘라서
            if (resultSet.size() > 2) {
                resultSet.subList(2, resultSet.size()).clear();
            }
            //6. 결과에 넣음
            answerList.addAll(resultSet);
        }


        return answerList.stream().mapToInt(Integer::intValue).toArray();

    }
}
