package Java;

import java.util.Scanner;

public class AreadelTriangulo {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println("Digite la base del triangulo");
        double b= s.nextDouble();
        System.out.println("Digite la altura del triangulo");
        double h= s.nextDouble();
        // area = (base * altura)/2
        double area =(b*h)/2;
        System.out.println("Area Del Circulo Es Igual a:"+area);
    }
}
