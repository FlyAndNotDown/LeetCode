/**
 * @no 406
 * @name Queue Reconstruction by Height
 */
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if (people.length < 2) {
            return people;
        }

        List<int[]> personList = Arrays.asList(people);
        personList.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        result.add(people[0]);
        for (int i = 1; i < people.length; i++) {
            int j = 0;
            while (j < i && j < people[i][1]) {
                j++;
            }
            result.add(j, people[i]);
        }
        return result.toArray(new int[0][]);
    }
}