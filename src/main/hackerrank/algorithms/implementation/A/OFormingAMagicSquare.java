package main.hackerrank.algorithms.implementation.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class OFormingAMagicSquare {
    public static int formingMagicSquare(List<List<Integer>> s) {
        List<List<Integer>> possibleMagicSquares = new ArrayList<>();

        List<List<Integer>> sumsEqualTo15 = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            for (int j = i + 1; j <= 9; j++) {
                for (int k = j + 1; k <= 9; k++) {
                    int sum = i + j + k;
                    if (sum == 15) {
                        sumsEqualTo15.add(List.of(i, j, k));
                    }
                }
            }
        }

        Map<Integer, Integer> numbersFrequency = new HashMap<>();
        for (List<Integer> sums : sumsEqualTo15) {
            for (int value : sums) {
                numbersFrequency.put(value, numbersFrequency.getOrDefault(value, 0) + 1);
            }
        }

        System.out.println(numbersFrequency);

        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> s = new ArrayList<>();

        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = formingMagicSquare(s);
        System.out.println(result);

        bufferedReader.close();
    }
}
