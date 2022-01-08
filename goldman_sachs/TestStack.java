package revisewitharsh.goldman_sachs;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.push(2);
        stackTest.push(3);
        stackTest.pop();
        System.out.println(stackTest.getMin());
        stackTest.push(1);
        System.out.println(stackTest.getMin());
    }
}

class StackTest {

    StackTest() {
        this.minEle = 0;
        s = new Stack<>();
    }

    int minEle;
    Stack<Integer> s;

    /*returns min element from stack*/
    int getMin() {
        if (s.isEmpty()) {
            return -1;
        }
        return this.minEle;
    }

    /*returns poped element from stack*/
    int pop() {
        if (s.isEmpty()) {
            return -1;
        }
        int poppedElement = s.pop();
        int minimumElement = Integer.MAX_VALUE;
        for (Integer el : s) {
            minimumElement = Math.min(minimumElement, el);
        }
        this.minEle = minimumElement;
        return poppedElement;
    }

    void push(int x) {
        s.push(x);
        this.minEle = Math.min(this.minEle, x);
    }

}
