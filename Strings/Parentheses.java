import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '(' || ch =='[' || ch =='{') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char top = st.pop();
                if((ch == '}' && top!='{')||(ch == ']' && top!='[') 
                || (ch == ')' && top!='(')) return false;
            }
        }
    return st.empty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
