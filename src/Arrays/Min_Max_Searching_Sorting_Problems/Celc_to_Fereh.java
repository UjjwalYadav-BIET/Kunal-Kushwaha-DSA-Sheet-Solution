package Arrays.Min_Max_Searching_Sorting_Problems;

import java.util.Scanner;

public class Celc_to_Fereh {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give the temperature in Celsius.");
        float TempC = input.nextFloat();
        float TempF = (TempC*9/5)+32;
        System.out.println("The temperature in Fahrenheit "+TempF);
    }
}
