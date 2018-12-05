import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        boolean isBigger = false;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if(counter > number) {
                    isBigger = true;
                    break;
                }
                System.out.print(counter + " ");
                counter++;
             }
            if(isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
