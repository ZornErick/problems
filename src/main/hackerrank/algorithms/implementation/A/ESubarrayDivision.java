package main.hackerrank.algorithms.implementation.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ESubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i < s.size(); i++) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(s.get(i));
            for (int j = i + 1; j < s.size(); j++) {
                if (numbers.size() < m) {
                    numbers.add(s.get(j));
                }
            }

            boolean isValidSum = numbers.stream().mapToInt(Integer::intValue).sum() == d;
            if (isValidSum) result ++;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = birthday(s, d, m);
        System.out.println(result);

        bufferedReader.close();
    }
}
