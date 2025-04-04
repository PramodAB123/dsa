import java.util.*;
public class celebrityproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[4][4];
        //Scanning the input
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
            }
        }
        // method 1 - brute force
        // int[] knowme=new int[4];
        // int[] iknow=new int[4];
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         if(a[i][j]==1){
        //             knowme[j]++;
        //             iknow[i]++;
        //         }
        //     }
        // }
        // for(int i=0;i<4;i++){
        //     if(knowme[i]==(4-1) && iknow[i]==0){
        //         System.out.println(i);
        //     }
        // }



        // Method 2 : Optmial

        int top=0, bottom=3;
        while(top<bottom){  // Changed > to < since we want to continue while top hasn't crossed bottom
            if(a[top][bottom]==1) top=top+1;
            else if(a[bottom][top]==1) bottom--;
            else{
                bottom--;
                top++;
            }
        }
        if(top!=bottom) System.out.println(-1); // Changed condition since we want them to meet
        boolean flag=true;
        for(int i=0;i<4;i++){
            if(i==top) continue;
            if(a[i][top]==1 && a[top][i]==0){ // Fixed condition - celebrity should be known by others (a[i][top]==1) and shouldn't know others (a[top][i]==0)
                continue;
            }
            else{
                flag=false;
            }
        }
        if(flag){
            System.out.println(top);
        }
        else{
            System.out.println(-1);
        }


    }
}
