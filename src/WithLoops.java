import java.util.*;
public class WithLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("starting temperature");
        int start = sc.nextInt();
        System.out.print(" how much u want to give the end temperature:");

        int end = sc.nextInt();

        System.out.print("enter how much you want to increase temparature: ");
        int increament = sc.nextInt();

        System.out.println("Celsius\t\tFahrenheit");
        for (int cel = start; cel <= end; cel += increament) {

            double fahrenheit = (9.0 / 5) * cel + 32;
            System.out.println(cel + "\t" + fahrenheit);
        }
    }
}
