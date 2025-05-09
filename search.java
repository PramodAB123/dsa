public class search {
    public static boolean searchi(int[] arr,int tar, int idx){
        if(arr.length==idx) return false;
        if(arr[idx]==tar){
            return true;
        }
        return searchi(arr, tar, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={2,5,6,80,3,4};
        if(searchi(arr,8,0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
