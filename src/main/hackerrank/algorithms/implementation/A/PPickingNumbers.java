package main.hackerrank.algorithms.implementation.A;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class PPickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int result = 0;

        for (int i = 0; i < a.size(); i++) {
            int count = 0;
            for (int j = 0; j < a.size(); j++) {
                int diff = Math.abs(a.get(i) - a.get(j));
                if (diff <= 1 && a.get(j) >= a.get(i)) {
                    count++;
                }
            }
            result = Math.max(result, count);
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> a = Stream.of(scanner.nextLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int result = PPickingNumbers.pickingNumbers(a);

        System.out.println(result);
    }
}
