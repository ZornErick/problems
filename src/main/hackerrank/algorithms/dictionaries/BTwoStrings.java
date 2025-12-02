package main.hackerrank.algorithms.dictionaries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;


public class BTwoStrings {
    public static String twoStrings(String s1, String s2) {
        int[] charCount = new int[256];

        for (char c : s1.toCharArray()) {
            charCount[c]++;
        }

        for (char c : s2.toCharArray()) {
            if (charCount[c] > 0) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = twoStrings(s1, s2);
                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
