package stack;
import java.util.*;
public class rev {
    public static void main(String[] args){
        Stack <Integer> st = new Stack <>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        Stack <Integer> rt = new Stack <>();
        while (st.size()>0){
            rt.push(st.pop());
        } 
        System.out.println("after the reverse");
        System.out.println(rt);
    }
}
