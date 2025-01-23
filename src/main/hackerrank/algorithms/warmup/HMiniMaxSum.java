package main.hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HMiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> fourBiggestNumbers  = arr.subList(0, 4);
        List<Integer> fourSmallestNumbers  = arr.subList(arr.size() - 4, arr.size());

        System.out.print(fourBiggestNumbers.stream().mapToLong(Integer::intValue).sum() + " " + fourSmallestNumbers.stream().mapToLong(Integer::intValue).sum());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        miniMaxSum(arr);

        bufferedReader.close();
    }
}
