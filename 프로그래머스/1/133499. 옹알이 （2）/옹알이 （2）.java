class Solution {
    public static int solution(String[] babbling) {
        String[] possible = {"aya", "ye", "woo", "ma"};
        int count = 0;

        for (String word : babbling) {
            boolean isValid = true;

            for (String p : possible) {
                if (word.contains(p + p)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                for (String p : possible) {
                    word = word.replace(p, " ");
                }

                if (word.trim().isEmpty()) {
                    count++;
                }
            }
        }

        return count;
    }
}