package Java;

import java.util.Scanner;

public class AreadelTrianguloIsoseles {
    
 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Triangulo isósceles es uno que tiene dos lados iguales");
            System.out.print("Cuanto miden los dos lados iguales: ");
            double a = Double.parseDouble(sc.nextLine());
            System.out.print("Cuanto miden el otro lado: ");
            double b = Double.parseDouble(sc.nextLine());
            double area = (b * Math.sqrt((Math.pow(a, 2) - (Math.pow(b, 2) / 4)))) / 2;
            System.out.println("El área del triangulo isósceles es: " + area);
        }
    }