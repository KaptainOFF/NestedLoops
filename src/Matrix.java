import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2; i++) {
            for (int j = num1; j <= num2; j++) {
                for (int k = num3; k <= num4; k++) {
                    for (int l = num3; l <= num4; l++) {
                        if((i + l) == (j + k) && (i != j) && (k != l)) {
                            System.out.printf("%d%d%n",i,j);
                            System.out.printf("%d%d%n",k,l);
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
