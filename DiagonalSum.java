import java.io.*;
import java.util.*;
class DiagonalSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter order of the matrix:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter " +(r*c)+ " values into the array:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(i==j){
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum of the principle diagonal elements is "+sum);
    }
}
