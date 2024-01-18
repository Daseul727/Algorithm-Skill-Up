package programmers.lv1.day1

import java.lang.Exception

class useStringKt {

    fun solution(s: String) = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null

}