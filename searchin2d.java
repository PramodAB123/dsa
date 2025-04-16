public class searchin2d {
    public static void main(String[] args) {
        int[][] m = {
            {1, 3, 5, 7},
            {10, 11, 16, 20}, 
            {23, 30, 34, 60}
        };
        int row=m.length;
        int col=m[0].length;
        int s=0;
        int e=row*col-1;
        int terget=11;
        int bo=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int midv=m[mid/row][mid%row];
            if(midv==terget){
                bo=mid;
                break;
            }
            else if(midv<terget) s=mid+1;
            else e=mid-1;
        }
        System.out.println(bo);
    }
}
