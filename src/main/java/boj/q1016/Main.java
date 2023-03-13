package boj.q1016;

import java.util.ArrayList;
import java.util.Scanner;

/// 시간초과 - 다시풀기 (에라토스테네스의 체)
public class Main {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        System.out.println(new Solution().solution(min, max));

    }
}

class Solution {
    public int solution(int min, int max) {

        ArrayList squareNumber = new ArrayList();

        for (int i = 2; i <= max; i++) {
            int a = i * i;
            if (a <= max) {
                squareNumber.add(a);
            } else break;
        }

        int count=0;
        if(max<=3) count=max;
        else {
            for (int i = min; i<=max; i++) {
                for(int j=0; j<squareNumber.toArray().length; j++){
                    if (i % (int)squareNumber.get(j) == 0){
                        count++;
                        break;
                    }
                }
            }
        }

        return max-min-count+1;
    }
}