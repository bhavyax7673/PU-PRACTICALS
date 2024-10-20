public class Main{
    public static void main(String args[]){
        int a=10,b=20;
        System.out.println("Arithmetic Operation :- \n");
        System.out.println( "Addition = "  + (a+b));
        System.out.println( "Substraction = "  + (a-b));
        System.out.println( "Divide = "  + (a/b));
        System.out.println( "Modulus = "  + (a%b));
        System.out.println( "Multiplication = "  + (a*b));

        System.out.println("Bitwise Operation :- \n");
        System.out.println("Bitwise OR = " + (a|b) );
        System.out.println("Bitwise AND = " + (a&b) );
        System.out.println("Bitwise XOR = " + (a^b) );
        System.out.println("Bitwise COMPLEMENT = " + (~b) );
        
    }
}