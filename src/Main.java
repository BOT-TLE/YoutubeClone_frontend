import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Program to take calculate the percentage");
        Scanner sc = new Scanner(System.in);
        System.out.print("Maths : ");
        float m = sc.nextFloat();
        System.out.print("English : ");
        float e = sc.nextFloat();
        System.out.print("Science : ");
        float s = sc.nextFloat();
        System.out.print("SST : ");
        float ss = sc.nextFloat();
        System.out.print("Computer: ");
        float c = sc.nextFloat();
        System.out.println("Percentage : " + (((m+e+s+ss+c)*100)/500));
    }
}
// Pascal method -- PasCal
// camelCase -- camelCase