package Day05;

public class ConcatenatingString {
    public static void main(String[] args) {
        String part1 = "Stockton";
        String part2 = "University";
        String part3 = "Atlantic City";
        String part4 = "New Jersey";
        String full = part3 + ", " + part4;

        System.out.println(part1 + " " + part2);
        System.out.println(full);
        System.out.println("Atlantic".concat(" City"));
        numberConcatenation();  
      }
    public static void numberConcatenation() {
        int num1 = 5;
        int num2 = 20;

        System.out.println("Sum of numbers: " + num1 + num2);
        System.out.println("Sum of numbers: 5"+3);
    }
}
