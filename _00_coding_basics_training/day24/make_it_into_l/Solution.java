package _00_coding_basics_training.day24.make_it_into_l;

import java.util.*;

class Solution {
    public String solution(String myString) {
        String regex = "([a-k])";
        String answer = myString.replaceAll(regex, "l");

        return answer;
    }
}
