/**
 * @no 225
 * @name Implement Stack using Queues
 */
class MyStack {
    private List<Queue<Integer>> queues = new ArrayList<>();
    private int currentIndex = 0;

    /** Initialize your data structure here. */
    public MyStack() {
        for (int i = 0; i < 2; i++) {
            queues.add(new LinkedList<>());
        }
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queues.get(currentIndex).offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> current = queues.get(currentIndex);
        currentIndex = (currentIndex + 1) % 2;
        Queue<Integer> next = queues.get(currentIndex);
        while (current.size() > 1) {
            next.offer(current.poll());
        }
        return current.poll();
    }

    /** Get the top element. */
    public int top() {
        Queue<Integer> current = queues.get(currentIndex);
        Queue<Integer> next = queues.get(++currentIndex % 2);
        while (current.size() > 1) {
            next.offer(current.poll());
        }
        int result = current.peek();
        next.offer(current.poll());
        return result;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queues.get(currentIndex).isEmpty();
    }
}