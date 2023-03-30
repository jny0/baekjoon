package boj.자료구조.boj17413;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine() + " "; // 마지막 출력을 위해 공백 추가

        Stack<Character> stack = new Stack<>();

        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '<') {     // '<'이 열리면 스택 모두 pop하고 '>'이 닫힐 때 까지 문자 그대로 출력
                while (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                for (int j = i; j < str.length(); j++) {
                    bw.write(str.charAt(j));
                    i++;
                    if (str.charAt(j) == '>') {
                        break;
                    }

                }
            } else if (str.charAt(i) == ' ') { //공백이면 스택에 저장한 문자 모두 pop
                while (!stack.isEmpty()) {
                    bw.write(stack.pop());
                }
                bw.write(str.charAt(i));
                i++;
            } else {    // 스택에 문자 저장
                stack.push(str.charAt(i));
                i++;
            }
        }
        bw.flush();
        br.close();
    }
}
