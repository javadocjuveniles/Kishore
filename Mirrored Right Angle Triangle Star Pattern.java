package com.kishore;

import java.util.Scanner;

public class pac {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int a = get.nextInt();
        for (int i = 1; i <= a; ++i) {
            for (int j = a; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

output:

5
     *
    **
   ***
  ****
 *****
