class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        if (q.size() > 1) {
            for (int i = 0; i < q.size() - 1; i++) {
                q.offer(q.poll()); //removes element and adds at queue
            }
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}