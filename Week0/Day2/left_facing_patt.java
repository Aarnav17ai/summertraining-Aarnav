package Day2;

import java.util.Scanner;

public class left_facing_patt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n:");
        n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int k=1; k<=(n-i);k++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();//endl
        }
        
    }
    
}
