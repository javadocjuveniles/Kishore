package com.kishore;

import java.util.Scanner;

public class pac{

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int a = get.nextInt();
        for(int i = 5 ; i>=1 ; --i){
            for(int j=5; j>=i ; j--){
                   System.out.print(" ");
            }
            for(int k=((i*2)-1) ; k>=1 ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


output:

5
 *********
  *******
   *****
    ***
     *
