public class delstring {
    public static String del(String s, int n){
        // Base case - if we've reached the end of string
        if(n >= s.length()) {
            return "";
        }
        
        // Build result string recursively
        String rest = del(s, n+1);
        
        // Add current char to result if it's not 'a'
        if(s.charAt(n) != 'a') {
            return s.charAt(n) + rest;
        }
        return rest;
    }

    public static void main(String[] args) {
        String t = "abcax";
        String s = del(t,0);
        System.out.println("Original string: " + t);
        System.out.println("After removing 'a': " + s);
    }
}
