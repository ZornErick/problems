package main.hackerrank.algorithms.implementation.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class XBreakingRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>(List.of(0, 0));

        int minScore = scores.getFirst();
        int maxScore = scores.getFirst();
        for (int score : scores) {
            System.out.println(score);
            System.out.println(maxScore);
            System.out.println();

            if (score > maxScore) {
                result.set(0, result.getFirst() + 1);
                maxScore = score;
            } else if (score < minScore) {
                result.set(1, result.getLast() + 1);
                minScore = score;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = breakingRecords(scores);
        System.out.println(result);

        bufferedReader.close();
    }
}
