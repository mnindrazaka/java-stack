import java.lang.reflect.Array;

public class Stack<T> {
    private final T[] items;
    private int top;
    private final int capacity;

    Stack(Class<T> c, int size) {
        this.items = (T[]) Array.newInstance(c, size);
        this.capacity = size;
        this.top = -1;
    }

    public void push(T item) {
        if (isFull()) {
            throw new Error("Stack OverFlow");
        }
        items[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new Error("Stack Empty");
        }
        return items[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for(int i = 0; i <= top; i++) {
            System.out.println(items[i]);
        }
    }

    public T[] getStack() {
        T[] stack = (T[]) new Object[top + 1];
        for(int i = 0; i <= top; i++) {
            stack[i] = items[i];
        }
        return stack;
    }

    public T getItem() {
        return items[top];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTop() {
        return top;
    }
}
