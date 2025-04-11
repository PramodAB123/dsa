//import java.lang.reflect.Array;
import java.util.ArrayList;

public class find448 {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        ArrayList<Integer> l=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0) continue;
            nums[idx]*=-1;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                l.add(i+1);
            }
        }
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
