package main.hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SDesignerPDFViewer {
    public static int designerPdfViewer(List<Integer> h, String word) {
        List<Integer> charHeights = new ArrayList<>(word.length());

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c >= 'a' && c <= 'z') {
                charHeights.add(h.get(c - 'a'));
            }
        }

        Integer maxHeight = Collections.max(charHeights);

        return maxHeight * word.length();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .toList();

        String word = bufferedReader.readLine();

        int result = SDesignerPDFViewer.designerPdfViewer(h, word);
        System.out.println(result);

        bufferedReader.close();
    }
}
