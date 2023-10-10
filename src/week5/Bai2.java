package week5;

public class Bai2 {
    public static String isBalanced(String expression) {
        // Write your code here
        if ((expression.length() % 2) == 1) return "NO";
        else {
            Stack<Character> s = new Stack<>();
            for (char bracket : expression.toCharArray())
                switch (bracket) {
                    case '{': s.push('}'); break;
                    case '(': s.push(')'); break;
                    case '[': s.push(']'); break;
                    default :
                        if (s.isEmpty() || bracket != s.peek()) { return "NO";}
                        s.pop();
                }
            if(s.isEmpty()) return "YES";
            else return "NO";
        }
    }
}
