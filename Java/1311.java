/**
 * @no 1311
 * @name Get Watched Videos by Your Friends
 */
class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friendships, int id, int level) {
        Set<Integer> friendsWithLevel = getFriends(id, level, friendships, new boolean[friendships.length]);
        Map<String, Integer> videosWithFrequency = getVideosWithFrequency(friendsWithLevel, watchedVideos);
        List<Pair<String, Integer>> temp = new ArrayList<>();
        for (String key : videosWithFrequency.keySet()) {
            temp.add(new Pair<>(key, videosWithFrequency.get(key)));
        }
        temp.sort(new Comparator<>() {
            @Override
            public int compare(Pair<String, Integer> a, Pair<String, Integer> b) {
                if (!a.getValue().equals(b.getValue())) {
                    return a.getValue() - b.getValue();
                }
                return a.getKey().compareTo(b.getKey());
            }
        });
        List<String> result = new ArrayList<>();
        for (Pair<String, Integer> pair : temp) {
            result.add(pair.getKey());
        }
        return result;
    }

    private Map<String, Integer> getVideosWithFrequency(Set<Integer> friends, List<List<String>> watchedVideos) {
        Map<String, Integer> result = new HashMap<>();
        for (int friend : friends) {
            List<String> videos = watchedVideos.get(friend);
            for (String video : videos) {
                if (result.containsKey(video)) {
                    result.replace(video, result.get(video) + 1);
                } else {
                    result.put(video, 1);
                }
            }
        }
        return result;
    }

    private Set<Integer> getFriends(int id, int level, int[][] friendships, boolean[] traveled) {
        Set<Integer> result = new HashSet<>();
        if (level == 0) {
            traveled[id] = true;
            result.add(id);
            return result;
        }
        Set<Integer> friends = getFriends(id, level - 1, friendships, traveled);
        for (int friend : friends) {
            for (int i : friendships[friend]) {
                if (traveled[i]) {
                    continue;
                }
                traveled[i] = true;
                result.add(i);
            }
        }
        return result;
    }
}