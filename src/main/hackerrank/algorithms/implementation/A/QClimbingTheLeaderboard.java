package main.hackerrank.algorithms.implementation.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class QClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();

        List<Integer> rankedCopy = ranked.stream().distinct().toList();
        for (Integer playerValue : player) {
            int index = Collections.binarySearch(rankedCopy, playerValue, Comparator.reverseOrder());
            System.out.println(index);
            int pos = (index >= 0) ? index + 1 : -index;
            result.add(pos);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        List<Integer> result = QClimbingTheLeaderboard.climbingLeaderboard(List.of(100, 90, 90, 80, 75, 60), List.of(50, 65, 77, 90, 102));

        System.out.println(result);

        bufferedReader.close();
    }
}
