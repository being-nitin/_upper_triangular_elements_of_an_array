package com.nitincodes;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// java program to print upper triangular element of an array:
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int arr[][] = new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            arr[i][j] = sc.nextInt();
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<=3-i-1;j++){
            System.out.println(arr[i][j]);
        }
    }





    }
}
