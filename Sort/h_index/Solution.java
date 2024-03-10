package sort.h_index;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int temp = 0;
        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            if (citations[i] > 0) {
                temp = citations.length - i > citations[i] ? citations[i] : citations.length - i;
                answer = answer > temp ? answer : temp;
            }
        }

        return answer;
    }
}