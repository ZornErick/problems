package main.hackerrank.algorithms.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class LRepeatedString {
    public static long repeatedString(String s, long n) {
        int aInS = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aInS++;
            }
        }

        long fullRepeats = n / s.length();
        long remainder = n % s.length();

        long total = fullRepeats * aInS;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                total++;
            }
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = repeatedString(s, n);
        System.out.println(result);

        bufferedReader.close();
    }
}
