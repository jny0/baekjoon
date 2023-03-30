package boj.재귀.boj11729;

import java.io.*;

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        bw.write((int)(Math.pow(2, n) - 1) + "\n");

        Hanoi(n, 1, 2, 3);

        bw.flush();
        bw.close();
    }

    public static void Hanoi(int n, int start, int mid, int end) throws IOException {
        if (n == 1) {
            bw.write(start + " " + end + "\n");
            return;
        }

        Hanoi(n - 1, start, end, mid);
        bw.write(start + " " + end + "\n");
        Hanoi(n - 1, mid, start, end);

    }
}