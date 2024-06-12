# Algorithm-Skill-Up

## Basic Skills

### Character
- String to Char Arr
  ```java
  String s = "ddd";
  char[] sArr = s.toCharArray();
  ```
- to Upper Case
  ```java
  Character.toUpperCase(sArr[1]);
  ```

### String
- Check int
  ```java
  String s = "";
  Long result = 0L;
  
  try {
  	result = s.toLong
  } catch(Exception e) {
  	return false
  }
  ```
- parseInt
  ```java
  String s = "";
  Integer.ParseInt(s);
  ```

### Problme Type
- 홀짝
  ```java
  int num = 1;
  return num%2 == 0 ? "짝수" : "홀수"
  ```
- 평균
  ```java
  int[] arr;
  double answer = 0;
  
  for (int i : arr) {
    answer += i;
  }
  
  return answer/arr.length;
  ```
- 배열비교 (participant : 참가자 / completion : 완주자)
  ```java
  public String solution(String[] participant, String[] completion) {
      String answer = "";
  
      Arrays.sort(participant);
      Arrays.sort(completion);
  
      for(int i=0; i<completion.length;i++) {
      	if(!completion[i].equals(participant[i]))	return participant[i];
          else i++;
      }
  
      answer= participant[participant.length-1];
      
      return answer;
  }
  ```
- 몫, 나머지 구하기
  ```java
  //몫
  return num1/num2;
  //나머지
  return num1%num2;
  ```
- 중앙값 구하기
  ```java
  int[] arr;
  
  Arrays.sort(arr);
  return arr[arr.length/2]
  ```
- 최빈값 구하기 (최빈값이 1개 이상이면 return -1)
  ```java
  public int solution(int[] array) {
        //최빈값의 count
        int maxCount = 0;

        //result 값
        int answer = 0;

        //숫자 & 숫자 횟수 저장할 map
        Map<Integer, Integer> map = new HashMap<>();
  
        for (int number : array) {

            //map 에 number 와 횟수를 저장, number 가 map에 없는경우 0을 저장하고, map에 있다면 횟수+1
            int count = map.getOrDefault(number, 0) + 1;

            //만약 현재의 횟수가 maxCount 보다 높으면 maxcount를 교체, answer에 숫자 입력
            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else  if (count == maxCount) {
                //count와 maxCount 가 같다면 최빈값이 여러개이므로 -1
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
  ```
  
