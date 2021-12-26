package MinStack;

import java.util.ArrayList;

class MinStack {
    private ArrayList<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int val) {
        this.list.add(val);
    }

    public void pop() {
        this.list.remove(this.list.size() - 1);
    }

    public int top() {
        return this.list.get(this.list.size() - 1);
    }

    public int getMin() {
        int min = this.list.get(0);

        for (int i = 0; i < this.list.size(); i++) {
            min = Math.min(min, list.get(i));
        }

        return min;
    }
}
