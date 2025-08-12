package main.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WViralAdvertising {
    public static int viralAdvertising(int n) {
        int result = 2;

        int receptions = 2;
        for (int i = 1; i < n; i++) {
            int likedToday = (receptions * 3) / 2;
            result += likedToday;
            receptions = likedToday;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = WViralAdvertising.viralAdvertising(n);
        System.out.println(result);

        bufferedReader.close();
    }
}
