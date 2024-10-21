package Day05;

public class DataTypes {
    
    public static void main(String[] args){
       
        IntergerData();
        BytesData();
        ShortData();
    }

    public static void IntergerData(){
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b is: " + c);

    }
    public static void BytesData(){

        byte  a = 10;
        byte  b = 5;
        System.out.println("diffence of a and b is: " + (a - b));
        
    }
    public static void ShortData(){
        short a = 10;
        short b = 5;
        short c = (short) (a * b);
        System.out.println("diffence of a and b is: " + c);
    }
}