public class firstoccurance {
    public static void main(String[] args) {
        int[] a={5,5,5,6,7,8,9};
        int k=5;
        int s=0;
        int found=-1;
        int e=a.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a[mid]==k){
                found=mid;
                e=mid-1;
               // to find last occurance 
               //s=mid+1;
            }
            else if(a[mid]<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(found);
    }
}
