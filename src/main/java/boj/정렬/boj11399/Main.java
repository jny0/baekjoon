package boj.정렬.boj11399;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] arr2 = br.readLine().split(" ");

        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(arr2[i]);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += (arr.length-i)*arr[i];
        }

        System.out.println(sum);
    }
}
