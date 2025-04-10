import java.util.ArrayList;
import java.util.HashMap;

public class min599 {
    public static void main(String[] args) {
        String[] list1={"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2={ "Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        ArrayList<String> result=new ArrayList<>();
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            mp.put(list1[i],i);
        }
        int mindex=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            if(mp.containsKey(list2[i])){
                if(i+mp.get(list2[i])<mindex){
                    mindex=i+mp.get(list2[i]);
                    result=new ArrayList<>();
                    result.add(list2[i]);
                }
                else if(i+mp.get(list2[i])==mindex){
                    result.add(list2[i]);
                }
            }
        }
        String[] s=new String[result.size()];
        for(int i=0;i<result.size();i++){
            s[i]=result.get(i);
        }
        for(String p:s){
            System.out.println(p);
        }
    }
}
