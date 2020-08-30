package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static final int BLOCK_WORDS = 15;
    public static final String[] WORDS = new String[]{
            "apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        System.out.println("Угадай слово из перечисленных" + Arrays.toString(WORDS));
        Random random = new Random();
        int word = random.nextInt(WORDS.length);
        String blockWord = WORDS[word];

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введи слово: ");
            String userWord = scanner.nextLine();

            if (userWord.equals(blockWord)) {
                System.out.println("Ты угадал!");
                break;
            }
            System.out.println("Ты не угадал.Дам тебе подсказку");
            hintWord(blockWord, userWord);
            System.out.println();

        } while (true);
        System.out.println("Game over");
    }


    private static void hintWord(String blockWord, String userWord) {
        for (int i = 0; i < BLOCK_WORDS; i++) {
            char hint = '*';
            if (i < userWord.length() && i < blockWord.length() && userWord.charAt(i) == blockWord.charAt(i)) {
                hint = userWord.charAt(i);
            }
            System.out.println(hint);
        }
    }
}