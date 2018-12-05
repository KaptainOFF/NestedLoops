import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String numToStr = Integer.toString(number);
        for (int i = numToStr.length()-1; i >= 0; i--) {
            int num = Integer.parseInt(String.valueOf(numToStr.charAt(i)));
            if (num == 0) {
                System.out.print("ZERO");
            }
            for (int j = 0; j < num; j++) {
                char k = (char)(num + 33);
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
