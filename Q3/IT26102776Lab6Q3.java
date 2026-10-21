import java.util.Scanner;

public class IT26102776Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter positive integers (terminate input with -99):");
        
        int n = 0;           
        double sumSquare = 0.0; 
        
        
        while (true) {
            System.out.print("Enter a number: ");
            int x = input.nextInt();
            
            if (x == -99) {
                break;
            }
            
            if (x < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue; 
            }
            
            
            sumSquare = sumSquare + (x * x);
            n++; 
        }
        
        
        double rms = 0.0;
        if (n > 0) {
            rms = Math.sqrt(sumSquare / n); 
        }
        
        System.out.println("\nThe Root Mean Square (RMS) is: " + rms);
    }
}