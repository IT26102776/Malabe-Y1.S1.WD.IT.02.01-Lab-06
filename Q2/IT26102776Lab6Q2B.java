import java.util.Scanner;

public class IT26102776Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter 10 numbers: ");
        
        int count = 1;
        String enteredNumbers = "";
        
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();
            
            
            enteredNumbers = enteredNumbers + number + " ";
            
            count++;
        }
        
        System.out.println("\nThe numbers you entered are:");
        System.out.println(enteredNumbers);
    }
}