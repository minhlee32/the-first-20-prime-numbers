import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers;
        System.out.println("Please enter quantity of prime number you want to print out: ");
        numbers = input.nextInt();
        int count = 0;
        int N = 2;
        while(count != numbers) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    prime = false;
                    break;
                }

            }
            if (prime) {
                count++;
                System.out.println(N);
            }
            N++;
        }
    }

}
