package Arrays.Function_Based_Program;

public class Shadowing {

    static int x=20;

    public static void main(String[] args) {
        int x = 40;
        System.out.println(x);// It will print the 40, since the 20 become shadowed below 40.
        fun();// But it will print the 20 bcz, the function fun uses the reference of x which is declared globally.
    }

    static void fun() {
        System.out.println(x);
    }
}
