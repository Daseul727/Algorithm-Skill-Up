package programmers.Hash;

import java.util.*;

public class PhoneBook {

    public static void main(String args[]) {
        String[] phoneBook1 = {"123", "456", "789"};
        String[] phoneBook2 = {"12","123","1235","567","88"};

        solutionHash(phoneBook1);

    }

    public static boolean solutionArrays(String[] phone_book) {
            boolean answer = true;

            //1. 접두어니까 sort
            Arrays.sort(phone_book);

            //2. for문으로 접두어 확인
            for (int i=0; i<phone_book.length; i++) {
                if (phone_book[i+1].startsWith(phone_book[i])) {
                    return false;
                }
            }
            return answer;
    }

    public static boolean solutionHash(String[] phone_book) {
            boolean answer = true;

            //1. HashMap 선언
            Arrays.sort(phone_book);
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < phone_book.length; i++) {
                map.put(phone_book[i], i);
            }

            //2. phone_book을 하나씩 볼건데
            for (String book : phone_book) {

                //3. phone 을 한자리씩 자르고 (i=1을 주면서 같은문자열 안걸림)
                for (int i=1; i<book.length(); i++) {
                    String prefix = book.substring(0,i);

                    //4. map에 contains 하는 key가 있는지 (접두어를가지고 본체를 찾는게아니라, 본체를잘라서 해당하는 phone이 있는지 확인)
                    if (map.containsKey(prefix)) {
                        return false;
                    }
                }
            }

            //실패한 for문. 이 경우는 2중포문 돌다가 같은글자가 오면 false가 되버린다
            /*for (String phone : map.keySet()) {
                for (int i = 1; i < phone_book.length - 1; i++) {
                    if (phone_book[i].startsWith(phone)) {
                        answer = false;
                    }
                }
            }*/

            return answer;
        }

}
