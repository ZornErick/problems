package main.hackerrank.algorithms.implementation.A;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DBetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;

        Integer max = Collections.max(a);
        Integer min = Collections.min(b);

        for (int i = max; i <= min; i++) {
            boolean isValidNumber = true;

            for (Integer number : a) {
                if (i % number != 0) {
                    isValidNumber = false;
                    break;
                }
            }
            for (Integer number : b) {
                if (number % i != 0) {
                    isValidNumber = false;
                    break;
                }
            }

            if (isValidNumber) result++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = getTotalX(arr, brr);

        System.out.println(total);

        bufferedReader.close();
    }
}
