import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        try (Scanner in = new Scanner(System.in)) {
            int num = 0, numValues = 0;
            boolean valid;
            while (numValues < numbers.length) {
                valid = false;
                
                do {
                    System.out.print("Please enter a unique number: ");
                    num = in.nextInt();
                    valid = true;
                    
                    for (int i = 0; i < numValues; i++) {
                        if (num == numbers[i]) {
                            System.out.println("Number already exists");
                            valid = false;
                            break;
                        }
                    }
                } while (!valid);
                
                numbers[numValues] = num;
                numValues++;
            }   System.out.println("Unique numbers entered:"); 
            for (int number : numbers) {
                System.out.println(number);
            }
        }
    }
}