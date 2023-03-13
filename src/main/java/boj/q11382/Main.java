package boj.q11382;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String[] inputBits = sc.nextLine().split(" ");

        long a = Long.parseLong(inputBits[0]);
        long b = Long.parseLong(inputBits[1]);
        long c = Long.parseLong(inputBits[2]);

        System.out.println(a+b+c);

        sc.close();
    }
}
