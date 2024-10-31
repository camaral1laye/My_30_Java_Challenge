package Day05;

public class CallingStringMethods {
    public static void main(String[] args) {
    String s1 = "LayE";
    String s2 = " CaMaRa";
    
    //toUpperCase(), toLowerCase() method
    System.out.print(s1.toUpperCase());
    System.out.println(s2.toLowerCase());
    

    //s1length()

    int i = s1.length();
    System.out.println(i);

    //isEmpty()
    String e2 = "";
    String e1 = "Stockton University";
    System.out.println(e2.isEmpty());
    System.out.println(e1.isEmpty());
    
    //isBlank()
    String b1 = " ";
    String b2 = "Stockton University";
    System.out.println(b1.isBlank());
    System.out.println(b2.isBlank());

    //ChartAt()
    char c1 = b2.charAt(9);
    System.out.println(c1);

    //indexOf(), lastIndexOf()
    int i1 = b2.indexOf('U');
    int i2 = b2.lastIndexOf('t');
    System.out.println(i1);
    System.out.println(i2);
    
    //concat()
    String c4 = "Hello";
    String c3 = c4.concat(" World");
    
   System.out.println(c3);
    }

}
