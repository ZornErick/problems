package main.hackerrank.algorithms.implementation.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class GMigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        int maxCount = 0;

        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            counts.put(arr.get(i), counts.getOrDefault(arr.get(i), 0) + 1);

            if (counts.get(arr.get(i)) > maxCount) {
                maxCount = counts.get(arr.get(i));
            }
        }

        List<Integer> repeatedMaxValues = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == maxCount) {
                repeatedMaxValues.add(entry.getKey());
            }
        }

        if (repeatedMaxValues.size() > 1) {
            return Collections.min(repeatedMaxValues);
        }

        return repeatedMaxValues.get(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = migratoryBirds(arr);
        System.out.println(result);

        bufferedReader.close();
    }
}
