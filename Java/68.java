/**
 * @no 68
 * @name Text Justification
 */
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        List<String> temp = new ArrayList<>();
        int length = 0;
        while (i < words.length) {
            if (length + words[i].length() <= maxWidth) {
                length += words[i].length() + 1;
                temp.add(words[i]);
                i++;
            } else {
                int correctLength = 0;
                for (String s : temp) {
                    correctLength += s.length();
                }
                if (temp.size() == 1) {
                    stringBuilder.append(temp.get(0));
                    for (int j = 0; j < maxWidth - correctLength; j++) {
                        stringBuilder.append(' ');
                    }
                } else {
                    int spacePer = (maxWidth - correctLength) / (temp.size() - 1);
                    int spaceRemain = (maxWidth - correctLength) % (temp.size() - 1);
                    if (spaceRemain == 0) {
                        for (int j = 0; j < temp.size(); j++) {
                            if (j == temp.size() - 1) {
                                stringBuilder.append(temp.get(j));
                            } else {
                                stringBuilder.append(temp.get(j));
                                stringBuilder.append(" ".repeat(Math.max(0, spacePer)));
                            }
                        }
                    } else {
                        int remainUsed = 0;
                        for (int j = 0; j < temp.size(); j++) {
                            if (j == temp.size() - 1) {
                                stringBuilder.append(temp.get(j));
                            } else if (remainUsed < spaceRemain) {
                                stringBuilder.append(temp.get(j));
                                stringBuilder.append(" ".repeat(Math.max(0, spacePer)));
                                stringBuilder.append(' ');
                                remainUsed++;
                            } else {
                                stringBuilder.append(temp.get(j));
                                stringBuilder.append(" ".repeat(Math.max(0, spacePer)));
                            }
                        }
                    }
                }
                result.add(stringBuilder.toString());
                length = 0;
                temp.clear();
                stringBuilder = new StringBuilder();
            }
        }

        int currentLength = 0;
        for (int j = 0; j < temp.size(); j++) {
            if (j == temp.size() - 1) {
                stringBuilder.append(temp.get(j));
                currentLength += temp.get(j).length();
                for (int t = 0; t < maxWidth - currentLength; t++) {
                    stringBuilder.append(' ');
                }
            } else {
                stringBuilder.append(temp.get(j)).append(' ');
                currentLength += temp.get(j).length() + 1;
            }
        }
        result.add(stringBuilder.toString());

        return result;
    }
}