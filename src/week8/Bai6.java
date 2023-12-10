package week8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập văn bản:");
        String inputText = scanner.nextLine();

        // Chia chuỗi thành các từ
        String[] words = inputText.split("\\s+");

        // Sắp xếp mảng từ điển
        ArrayList<String> uniqueWords = new ArrayList<>();
        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
        Collections.sort(uniqueWords);

        // Đếm số lần xuất hiện của mỗi từ
        int[] wordCounts = new int[uniqueWords.size()];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int index = uniqueWords.indexOf(word);
            wordCounts[index]++;
        }

        // In kết quả
        System.out.println("Kết quả:");
        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println(uniqueWords.get(i) + ": " + wordCounts[i]);
        }
    }
}

