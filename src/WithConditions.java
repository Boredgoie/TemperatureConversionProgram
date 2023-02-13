import java.util.*;
public class WithConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give the tempin cel: ");
        int cel = sc.nextInt();

        if (cel>=-273) {
            double fahrenheit = (9.0/5)*cel+32;
            System.out.println("temperature in fahrenheat: " + fahrenheit);
        }

        else {
            System.out.println("innvalid temperatureo");
        }


    }
}
