package Day05;

public class DataTypes {
    
    public static void main(String[] args){
       
        IntergerData();
        BytesData();
        ShortData();
        LongData();
    }

    public static void IntergerData(){
        int Ia = 10;
        int Ib = 20;
        int Ic = Ia + Ib;
        System.out.println("Sum of a and b is: " + Ic);

    }
    public static void BytesData(){

        byte  Ba = 10;
        byte  Bb = 5;
        System.out.println("diffence of a and b is: " + (Ba - Bb));
        
    }
    public static void ShortData(){
        short Sa = 10;
        short Sb = 5;
        short Sc = (short) (Sa * Sb);
        System.out.println("Multiply of a and b is: " + Sc);
    }
    public static void LongData(){
        long La  = 20;
        long Lb = 15;
        long Lc = (Lb-La);
        System.out.println("The difference of a and b is: " + Lc);
    }
    public static void FloatData(){
        float Fa = 15;
        float Fb = 25;
        float Fc = (Fa + Fb);
        System.out.println("The result of a and b is: " + Fc);
    }
}