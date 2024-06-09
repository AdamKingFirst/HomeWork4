import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String alphabet = "qwertyuiopasdfghjklzxcvbnmq";
        char[] alpha = alphabet.toCharArray();

        System.out.println("Введите строчную букву английского алфавита:");
        Scanner scanner = new Scanner(System.in);
        char w = scanner.next().charAt(0);

        for (int i = 1; i < alpha.length; i++) {
            if (alpha[i] == w) {
                System.out.println(alpha[i-1]);
            }
        }
    }
}