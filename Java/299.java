/**
 * @no 299
 * @name Bulls and Cows
 */
class Solution {
    public static String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                stringBuilder.append(0);
            } else {
                if (map.containsKey(secret.charAt(i))) {
                    map.replace(secret.charAt(i), map.get(secret.charAt(i)) + 1);
                } else {
                    map.put(secret.charAt(i), 1);
                }
                stringBuilder.append(1);
            }
        }
        String mark = stringBuilder.toString();

        for (int i = 0; i < guess.length(); i++) {
            if (mark.charAt(i) == '1') {
                if (map.containsKey(guess.charAt(i))) {
                    map.replace(guess.charAt(i), map.get(guess.charAt(i)) - 1);
                    if (map.get(guess.charAt(i)) == 0) {
                        map.remove(guess.charAt(i));
                    }
                    cows++;
                }
            }
        }

        return String.format("%dA%dB", bulls, cows);
    }
}