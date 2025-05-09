public class myntra1 {
    public static int max(int[] arr, int n){
        int diff=-1;
        int l=0;
        int r=1;
        while(r<n){
            if(arr[r]>arr[l]){
                diff=Math.max(diff,arr[r]-arr[l]);
                r++;
            }
            else{
                l++;
                r++;
            }
        }
        return diff;
    }
    public static void main(String[] args) {
    int arr[] = {4, 3, 3, 2, 1};
        int highest=max(arr, arr.length);
        System.out.println(highest);

    }
}
