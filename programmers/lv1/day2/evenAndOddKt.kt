package programmers.lv1.day2

class evenAndOddKt {

    /*
    정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
    */

    fun solution(num: Int): String {

        /*
        방법 1. if문
        if (num % 2 == 0) return "Even"
        else return "Odd"*/

        // 방법 2. if문.ver2
        //코틀린은 삼항연산자가 없다
        return if (num%2 == 0) "Even" else "Odd"

        /*
        //다른 case
        val a = 1
        val b = 2
        val max = if (a > b) {
            print("Choose a")
            a // a가 b보다 클 경우 max에는 a가 들어감
        } else {
            print("Choose b")
            b // b가 a보다 크거나 같을 경우 max에는 b가 들어감
        }*/
    }
}