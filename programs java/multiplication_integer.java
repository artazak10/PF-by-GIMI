import java.util.Scanner;
public class multiplication_integer {
    public static void main(String[] args) { 
        System.out.println("hello");
        int a,b ;
        Scanner read= new Scanner(System.in);

        System.out.print("type the number for multiplication table: ");
        
        a=read.nextInt();
        
        System.out.print("tell the range of the table: ");

        b=read.nextInt();

        for(int c=1 ; c<= b ; c++){
            System.out.print ( "        " +a + " x " + c + " = ");
            int d = a*c;
            System.out.println(d);
        }


        
    }
}
