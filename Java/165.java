/**
 * @no 165
 * @name Compare Version Numbers
 */
class Solution {
    public static int compareVersion(String version1, String version2) {
        List<Integer> listAfterDeal1 = deal(version1);
        List<Integer> listAfterDeal2 = deal(version2);
        if (listAfterDeal1.size() >= listAfterDeal2.size()) {
            return compareInternal(listAfterDeal1, listAfterDeal2);
        }
        return 0 - compareInternal(listAfterDeal2, listAfterDeal1);
    }

    private static List<Integer> deal(String version) {
        String[] subVersions = version.split("\\.");
        List<Integer> result = new ArrayList<>();
        for (String subVersion : subVersions) {
            result.add(Integer.parseInt(subVersion));
        }
        return result;
    }

    private static int compareInternal(List<Integer> version1, List<Integer> version2) {
        int t = version1.size() - version2.size();
        for (int i = 0; i < t; i++) {
            version2.add(0);
        }
        for (int i = 0; i < version1.size(); i++) {
            if (version1.get(i) > version2.get(i)) {
                return 1;
            } else if (version1.get(i) < version2.get(i)) {
                return -1;
            }
        }
        return 0;
    }
}