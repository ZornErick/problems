package main.hackerrank.algorithms.implementation.A;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class JSalesByMarch {
    public static int sockMerchant(int n, List<Integer> ar) {
        Map<Integer, Integer> sockPairs = new HashMap<>();

        for (int a : ar) {
            sockPairs.put(a, sockPairs.getOrDefault(a, 0) + 1);
        }

        int pairs = 0;
        for (int sockPair : sockPairs.values()) {
            if (sockPair > 1) {
                pairs += (int) Math.floor((float) sockPair / 2);
            }
        }

        return pairs;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = sockMerchant(n, ar);
        System.out.println(result);

        bufferedReader.close();
    }
}
