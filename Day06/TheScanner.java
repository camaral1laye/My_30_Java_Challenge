package Day06;

import java.util.Scanner;  // Import the Scanner class

public class TheScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  // Create Scanner object to read input
        System.out.print("Enter your name: ");
        System.out.println("Your name is : " +input.nextLine());
        
input.close();  // Close the Scanner object
    }
}
