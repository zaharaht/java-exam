
    import java.util.Scanner;

    public class average {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            double sum = 0;
            int numCount = 5;


            System.out.println("Enter five numbers:");


            for (int i = 0; i < numCount; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                double number = scanner.nextDouble();
                sum += number;
            }

            double average = sum / numCount;

            System.out.println("The average of the five numbers is: " + average);


        }
    }

}
