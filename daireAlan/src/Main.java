import java.text.DecimalFormat;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                double r;
                double pi = 3.14;
                System.out.print("Dairenin yarıçapını giriniz: ");
                r = input.nextDouble();
                double alan, cevre;
                alan = pi * Math.pow(r,2);
                cevre = 2*pi*r;
                System.out.printf("\nDairenin alanı: " + alan + "\nDairenin çevresi: "+ new DecimalFormat().format(cevre));
                double a;
                System.out.print("\nAlpha: ");
                a = input.nextDouble();
                System.out.println("\nDaire diliminin alani: " + new DecimalFormat().format((pi*Math.pow(r,2)*a)/360));

            }
        }



