import java.util.*;
public class stockspan {
    //yet to be solved
    public static void main(String[] args) {
        int arr[] ={7,2,1,3,3,1,8};
        Stack<int[]> st=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int[] peek=st.peek();
            if(st.isEmpty()){
                st.push(new int[]{arr[i],(i+1)});
            }
            else if(!st.isEmpty() && peek[0]<=){
                st.pop();
            }
        }
    }
}
