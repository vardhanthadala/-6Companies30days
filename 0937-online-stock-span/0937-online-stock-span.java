class StockSpanner {
    // stack will store pairs: [price, span]
    //price --> stock price of a past day
    // span --> how many days that price covers with including itself
    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {
        // span starts at 1 (today itself)
        int span = 1;
        //if current price >= top's price --> pop the element --> add its span to current day's span
        while (st.size() > 0 && price >= st.peek()[0]) {
            span += st.pop()[1];//add the span of popped price
        }
        // push today's price and its total span into the stack
        st.push(new int[] { price, span });

        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */