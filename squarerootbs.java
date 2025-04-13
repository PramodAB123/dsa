public class squarerootbs {
    public static void main(String[] args) {
        int n = 10;
        int found = -1;
        int s = 0;
        int e = n;
        while(s <= e) { // Changed from s<=n to s<=e
            int mid = s + (e-s)/2;
            int ms = mid*mid;
            if(ms == n) {
                found = mid;
                break;
            }
            else if(ms > n) {
                e = mid-1;
            }
            else {
                s = mid+1;
            }
        }
        System.out.println(found);
    }
}
