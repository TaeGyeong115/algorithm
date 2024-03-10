import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i : numlist) {
            if(i%n == 0)list.add(i);
        }

        int j = 0;
        answer = new int[list.size()];
        for(int i : list) {
            answer[j++] = i;
        }

        return answer;
    }
}
