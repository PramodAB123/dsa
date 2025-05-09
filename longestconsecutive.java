import java.util.HashSet;

public class longestconsecutive {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,16,2,5,7};
        HashSet<Integer> set=new HashSet<>();
        for(int a:arr){
            set.add(a);
        }
        int maxcount=1;
        for(int s:set){
            if(!set.contains(s-1)){ //num is starting point of a seq
                int curr=s;
                int custreak=1;
                while(set.contains(curr+1)){
                    curr++; // Fixed: Increment curr in the while loop
                    custreak++;
                }
                if(custreak>maxcount){
                    maxcount=custreak;
                }
            }
        }
        System.out.println(maxcount);
    }
}
