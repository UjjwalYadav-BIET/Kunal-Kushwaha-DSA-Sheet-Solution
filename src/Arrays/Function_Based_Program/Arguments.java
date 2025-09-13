package Arrays.Function_Based_Program;

public class Arguments {
    public static void main(String[] args) {
        int ans = sum(3,5); // 3 and 5 → arguments
        System.out.println("Answer = "+ans);
    }
    static int sum(int a, int b)// a and b → parameters
    {
        return a+b;
    }
}
