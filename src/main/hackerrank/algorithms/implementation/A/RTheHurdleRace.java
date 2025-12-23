package main.hackerrank.algorithms.implementation.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class RTheHurdleRace {
    public static int hurdleRace(int k, List<Integer> height) {
        int highestHeight = Collections.max(height);

        if (k >= highestHeight) {
            return 0;
        }

        return highestHeight - k;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = RTheHurdleRace.hurdleRace(k, height);

        System.out.println(result);

        bufferedReader.close();
    }
}
