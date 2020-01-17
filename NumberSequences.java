
import java.util.Scanner;
public class NumberSequences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first character of the sequence to generate");
            System.out.print("(C)ollatz, (F)ib, or (E)xit: ");
            char c = input.next().charAt(0);
            if (c == 'C') {
                System.out.print("Enter the starting number (1 - 100): ");
                int startNum = input.nextInt(), steps = 0;
                System.out.println();
                System.out.print("Collatz Sequence: " + startNum + " ");
                while (startNum > 1) {
                    if (startNum % 2 == 0) {
                        startNum = startNum / 2;
                        steps++;
                    } else {
                        startNum = startNum * 3 + 1;
                        steps++;
                    }
                    System.out.print(startNum + " ");
                }
                System.out.println("\n" + "Number of steps: " + steps);
                System.out.println("--------------------");
            } else if (c == 'F') {
                int firstNumber = 0, secondNumber = 1, nextNumber, i;
                System.out.print("Enter the length of the desired fib sequence (1 - 40): ");
                int upperFibLimit = input.nextInt();
                System.out.println();
                System.out.print("Fib Sequence: ");
                for (i = 0; i < upperFibLimit; i++) {
                    if (i <= 1) {
                        nextNumber = i;
                    } else {
                        nextNumber = firstNumber + secondNumber;
                        firstNumber = secondNumber;
                        secondNumber = nextNumber;
                    }
                    System.out.print(nextNumber + " ");
                }
                System.out.println("\n" + "--------------------");
            } else if (c == 'E') {
                System.out.println("--------------------");
                return;
            }
        }
    }
}
