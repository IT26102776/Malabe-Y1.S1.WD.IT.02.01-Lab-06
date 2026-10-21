import java.util.Scanner;

public class IT26102776Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 10 numbers: ");
        
        int count = 1;
        int sum = 0; 
        String enteredNumbers = "";
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            
            enteredNumbers = enteredNumbers + number + " ";
            sum = sum + number; 
            
            count++;
        }
        
        
        double average = sum / 10.0;
        
        System.out.println("\nThe numbers you entered are:");
        System.out.println(enteredNumbers);
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}