import java.util.Scanner;

public class Default {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;

        for (int i = 0; i <= n; i+=2){
            System.out.println((int)Math.pow(2,i));
        }
    }
}