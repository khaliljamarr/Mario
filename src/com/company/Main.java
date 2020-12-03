package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int num;
        do {
            System.out.print("Size: ");
            num = keyboard.nextInt();
        } while (num < 1 || num > 8);{
            for (int x= 0; x<= num; x++)
            { for (int y=1; y<=num-x; y++)
            { System.out.print(" ");
            }for (int z=0;z<=x;z++)
            { System.out.print("*");
            }System.out.println(" ");
            }
        }
    }
}