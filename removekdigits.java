import java.util.Stack;

public class removekdigits {
    public static void main(String[] args) {
        String s = "1432219";
        int n = s.length();
        int k = 3;
        Stack<Character> st = new Stack<>();
        
        // Process all characters
        for(int i = 0; i < n; i++) {
            // Remove larger digits while we can
            while(!st.isEmpty() && k > 0 && st.peek() > s.charAt(i)) {
                st.pop();
                k--;
            }
            st.push(s.charAt(i));
        }
        
        // Remove remaining k digits from end if needed
        while(k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        
        // Build result string
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()) {
            res.append(st.pop()); // Changed from insert(0) to append()
        }
        res.reverse(); // Reverse at the end
        
        // Remove leading zeros
        while(res.length() > 1 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        
        // Handle empty result
        String result = res.length() == 0 ? "0" : res.toString();
        System.out.println(result);
    }
}
