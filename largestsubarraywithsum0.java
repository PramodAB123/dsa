import java.util.HashMap;

public class largestsubarraywithsum0 {
    public static void main(String[] args) {
        int[] p={15,2,-2,3,2,-1,-4,2,-1,-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<p.length;i++){
            sum+=p[i];
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
            else {
                int a=i-mp.get(sum);
                if(a>max){
                    max=a;
                }
            }
        }
        System.out.println(max);
    }
}
