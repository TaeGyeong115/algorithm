import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String c_list = String.valueOf(age);

        for(char c : c_list.toCharArray()) {
            answer += ch[(int)c-'0'];
        }

        return answer;
    }
}
