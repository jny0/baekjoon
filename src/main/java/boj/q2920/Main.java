package boj.q2920;

import java.util.*;

import static java.util.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        String asc = Arrays.sort(input);
        String answer = null;
        if(asc.equals(input)) {
           answer = "ascending";
        }

        System.out.println(Arrays.toString(input));
        System.out.println(answer);


    }
}

