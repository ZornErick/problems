package main.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class KJumpingOnTheClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        int result = 0;

        for (int i = 0; i < c.size();) {
            System.out.println("Estou no index: " + i);
            System.out.println("Valor armazenado: " + c.get(i));
            if (i + 2 <= c.size() - 1 && c.get(i + 2) == 0) {
                i += 2;
            } else {
                i += 1;
            }

            result++;
        }

        return result - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = jumpingOnClouds(c);
        System.out.println(result);

        bufferedReader.close();
    }
}
