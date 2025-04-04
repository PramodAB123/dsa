import java.util.HashMap;

public class oneaway {
    public static void main(String[] args) {
        String s1="pale";
        String s2="bale";
        
        // Check if length difference is more than 1
        if (Math.abs(s1.length() - s2.length()) > 1) {
            System.out.println("false");
            return;
        }

        // If lengths are equal, check for one replacement
        if (s1.length() == s2.length()) {
            int differences = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    differences++;
                    if (differences > 1) {
                        System.out.println("false");
                        return;
                    }
                }
            }
            System.out.println("true");
            return;
        }

        // If lengths differ by 1, check for one insertion/deletion
        String longer = s1.length() > s2.length() ? s1 : s2;
        String shorter = s1.length() > s2.length() ? s2 : s1;
        
        int longIndex = 0;
        int shortIndex = 0;
        boolean foundDifference = false;
        
        while (shortIndex < shorter.length()) {
            if (longer.charAt(longIndex) != shorter.charAt(shortIndex)) {
                if (foundDifference) {
                    System.out.println("false");
                    return;
                }
                foundDifference = true;
                longIndex++;
            } else {
                longIndex++;
                shortIndex++;
            }
        }
        
        System.out.println("true");
    }
}
