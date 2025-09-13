import java.util.Scanner;

public class first {
    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        System.out.println(a);// This line is basically used to print the integer only.
        String b=input.next();
        System.out.println(b); // This line print the single words only.
        String c= input.nextLine();
        System.out.println(c); // This line is used to print the whole string line.
        Byte d= input.nextByte();
        System.out.println(d); // This is used to print the byte value.
        Float e= input.nextFloat();
        System.out.println(e); // This is used to print the float value.
        Boolean f= input.nextBoolean();
        System.out.println(f); //This prints the Boolean value.
        Double g= input.nextDouble();
        System.out.println(g); // This prints the double value.
        //int h= 234,000,000; This will shows the error.
        int h= 234_000_000;
        System.out.println(h);

        //Type casting
        int num = (int)(829.39f);
        System.out.println(num);

        byte num2 = (byte)(257);
        System.out.println(num2);
    }
}

