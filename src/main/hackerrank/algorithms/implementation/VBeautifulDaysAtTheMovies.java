package main.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VBeautifulDaysAtTheMovies {
    public static int beautifulDays(int i, int j, int k) {
        int result = 0;

        for (int x = i; x <= j; x++) {
            int reverse = Integer.parseInt(
                    new StringBuilder(String.valueOf(x)).reverse().toString()
            );

            if (Math.abs(x - reverse) % k == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = VBeautifulDaysAtTheMovies.beautifulDays(i, j, k);
        System.out.println(result);

        bufferedReader.close();
    }
}
