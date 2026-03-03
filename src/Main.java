import Entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter the width: ");
        rectangle.width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        rectangle.height = scanner.nextDouble();


        //System.out.print("Area: " + area + "cm2!");
        System.out.printf("Area: %.2f cm2", rectangle.area());
        scanner.close();
    }
}