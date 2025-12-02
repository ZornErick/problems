package main.hackerrank.algorithms.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CNewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        List<Integer> sortedQ = q.stream().sorted().collect(Collectors.toList());
        int bribeCount = 0;

        for (int i = 0; i < sortedQ.size(); i++) {
            int sortedPersonP = sortedQ.get(i);
            int currentPersonP = q.get(i);

            if (sortedPersonP != currentPersonP) {
                if (currentPersonP > sortedPersonP) {
                    int diff = currentPersonP - sortedPersonP;
                    if (diff > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < q.size(); i++) {
            int start = Math.max(0, q.get(i) - 2);

            for (int j = start; j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    bribeCount++;
                }
            }
        }

        System.out.println(bribeCount);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .toList();

                minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

