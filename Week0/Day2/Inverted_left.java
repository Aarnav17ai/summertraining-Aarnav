package Day2;

import java.util.Scanner;

public class Inverted_left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter n:");
        n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int k=1;k<=n-1;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
        System.out.println(" ");
            
        }
    }
    
}
