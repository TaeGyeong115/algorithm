package coding_basics_training.day05.dice_game_2;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a == b && b == c) {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c)) * ((a * a * a) + (b * b * b) + (c * c * c));
        } else if (a == b || b == c || a == c) {
            answer = (a + b + c) * ((a * a) + (b * b) + (c * c));
        } else {
            answer = a + b + c;
        }

        return answer;
    }
}