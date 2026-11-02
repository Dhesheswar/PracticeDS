package StackAndQueue;

public class Main {
    public static void main(String[] args) {
        StackUsingArrays st = new StackUsingArrays(10);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.top());
        System.out.println(st.size());
    }
}
