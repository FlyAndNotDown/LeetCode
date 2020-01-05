/**
 * @no 40
 * @name Combination Sum II
 */
class Solution {
    private static class State {
        int sum;
        int position;
        List<Integer> result;

        State(int sum, int position, List<Integer> result) {
            this.sum = sum;
            this.position = position;
            this.result = result;
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Set<List<Integer>> result = new HashSet<>();
        Stack<State> stack = new Stack<>();
        stack.push(new State(0, -1, new ArrayList<>()));
        while (!stack.empty()) {
            State state = stack.pop();
            if (state.sum == target) {
                result.add(new ArrayList<>(state.result));
            } else if (state.sum < target && state.position + 1 < candidates.length) {
                State newState1 = new State(state.sum, state.position + 1, new ArrayList<>(state.result));
                State newState2 = new State(state.sum + candidates[state.position + 1], state.position + 1, new ArrayList<>(state.result));
                newState2.result.add(candidates[state.position + 1]);
                stack.push(newState1);
                stack.push(newState2);
            }
        }
        return new ArrayList<>(result);
    }
}