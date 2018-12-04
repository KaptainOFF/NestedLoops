import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        int max = Integer.MIN_VALUE;
        String name = "";

        while (!stop) {
            String input = scanner.nextLine();
            int sum = 0;
            if(input.toLowerCase().equals("stop")) {
                stop = true;
                continue;
            }
            for(char letter : input.toCharArray()) {
                sum += letter;
                if (sum > max) {
                    max = sum;
                    name = input;
                }
            }
        }

        System.out.printf("Winner is %s - %d!", name, max);
    }
}
