package main.hackerrank.algorithms.implementation.A;

import java.io.*;

public class LCountingValleys {
    public static int countingValleys(int steps, String path) {
        int result = 0;
        int level = 0;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i) == 'D') {
                if (level == 0) {
                    result++;
                }

                level--;
            } else {
                level++;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);
        System.out.println(result);

        bufferedReader.close();
    }
}
