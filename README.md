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
