import java.util.Scanner;

public class NumbersTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int current = 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                current = i + j + 1;
                if(current > number) {
                    current = 2 * number - current;
                }
                System.out.print(current + " ");
            }
            System.out.println();
        }
    }
}
