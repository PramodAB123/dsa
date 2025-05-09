public class printing {
    public static void hell(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }
        System.out.print(arr[idx]);
        hell(arr, idx+1);
    }
    public static int max(int[] arr, int idx , int high){
        if(idx==arr.length){
            return high;
        }
        high=Math.max(high,arr[idx]);
        return max(arr, idx+1,high); // Added return statement to propagate the result
    }
    public static int sum(int[] arr, int idx, int hi){
        if(idx==arr.length){
            return hi;
        }
        return sum(arr,idx+1,hi+arr[idx]);

    }
    public static void main(String[] args) {
        int arr[] ={};
        hell(arr, 0);
        int m=max(arr,0,-1);
        int s=sum(arr,0,0);
        System.out.println(m);
        System.out.println(s);
    }
}
