package Arrays.Function_Based_Program;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun(4);
    }
    static void fun(int a){
        System.out.println("The value of a = "+a);
    }
    static void fun(String str){
        System.out.println("String = ");
    }
}
