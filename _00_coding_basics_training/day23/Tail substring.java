class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for(int i = 0; i < str_list.length; i++) {
            answer = answer + (str_list[i].contains(ex) ? "" : str_list[i]);
        }

        return answer;
    }
}
