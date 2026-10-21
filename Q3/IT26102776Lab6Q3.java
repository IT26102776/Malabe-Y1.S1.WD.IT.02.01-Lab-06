import java.util.Scanner;
public class IT26102776Lab6Q3{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int count = 0;
        int num = 0;
        int total_of_squares = 0;
        System.out.println("Enter positive integers (terminate input with -99) : ");
        num = input.nextInt();
        while (num != -99)
        {
            if (num > 0) {
                System.out.println("Enter a number : ");
                
                num = input.nextInt();
                int square = num*num;
                total_of_squares = total_of_squares + square;
                count = count + 1;
            }else { System.out.println("Invalid input");
                break;
            }
        }
        
        if (count > 0) {
            double mean_square = total_of_squares/count;
            double root_mean_square = Math.sqrt(mean_square);
            System.out.println("The root mean square (RMS) is :" + root_mean_square);
        }
    }
}
