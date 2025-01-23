package main.hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FPlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (Integer a : arr) {
            if (a > 0) {
                positive += 1;
            } else if (a < 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }

        int arraySize = arr.size();

        System.out.println((float) positive / arraySize);
        System.out.println((float) negative / arraySize);
        System.out.println((float) zero / arraySize);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }
}
