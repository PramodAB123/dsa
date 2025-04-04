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


    }
}
