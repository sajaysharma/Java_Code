import java.util.Stack;
public class Valid_Paran{
    public static boolean paranthisis(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
                stack.pop();
            }
        }
        
        return stack.empty();
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(paranthisis(s));
    }
}