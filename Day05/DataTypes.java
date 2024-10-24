package Day05;

public class DataTypes {
    
    public static void main(String[] args){
       
       System.out.println("Data Types in Java\n");
        IntergerData();
    }

    public static void IntergerData(){
        int Ia = 10;
        int Ib = 20;
        int Ic = Ia + Ib;
        System.out.println("Sum of a and b is: " + Ic);

        BytesData();
    }
    public static void BytesData(){

        byte  Ba = 10;
        byte  Bb = 5;
        System.out.println("diffence of a and b is: " + (Ba - Bb));
        ShortData();
    }
    public static void ShortData(){
        short Sa = 10;
        short Sb = 5;
        short Sc = (short) (Sa * Sb);
        System.out.println("Multiply of a and b is: " + Sc);
        LongData();
    }
    public static void LongData(){
        long La  = 20;
        long Lb = 15;
        long Lc = (Lb-La);
        System.out.println("The difference of a and b is: " + Lc);
        FloatData();
    }
    public static void FloatData(){
        float Fa = 15;
        float Fb = 25;
        float Fc = (Fa + Fb);
        System.out.println("The result of a and b is: " + Fc);
        CharData();
    }
    public static void CharData(){
        char Ca = 'A';
        char Cb = 'B';
        char Cc  = 65;
        System.out.println("The value of a is: " + Ca);
        System.out.println("The value of b is: " + Cb);
        System.out.println("The value 65 represent:"+ Cc);
        BooleanData();
    }
    public static void BooleanData(){
        boolean a = true;
        boolean b = false;
        boolean c = a && b;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + c);
        StringData();
    }
    public static void StringData(){
        String S1 = "Hello";
        String S2 = " World";
        String S3 = S1 + S2;
        System.out.println("The value of S1 and S2 is: " + S3);
    }
}