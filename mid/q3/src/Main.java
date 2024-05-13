//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public class Queue {

            private Stack stack1;
            private Stack stack2;

            public Queue() {
                stack1 = new Stack(10);
                stack2 = new Stack(10);
            }

            public void enqueue(int data) {
                stack1.push(data);
            }

            public int dequeue() {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                return stack2.pop();
            }

            public int peek() {
                if (stack2.isEmpty()) {
                    while (!stack1.isEmpty()) {
                        stack2.push(stack1.pop());
                    }
                }
                return stack2.peek();
            }
        }
