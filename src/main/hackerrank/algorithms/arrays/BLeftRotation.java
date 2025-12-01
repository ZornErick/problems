package main.hackerrank.algorithms.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class BLeftRotation {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        for (int i = 0; i < d; i++) {
            int firstElement = a.getFirst();
            a.add(firstElement);
            a.removeFirst();
        }

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = rotLeft(a, d);
        System.out.println(result);

        bufferedReader.close();
    }
}
